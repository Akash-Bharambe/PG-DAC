package com.app.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.DAO.CandidateDAO;
import com.app.DAO.CandidateDAOImpl;
import com.app.core.Candidate;

/**
 * Servlet implementation class AdminPageServlet
 */
@WebServlet("/admin_page")
public class AdminPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CandidateDAO candidateDAO;
	private static String string;
	
	@Override
	public void init() throws ServletException {
		try {
			candidateDAO = new CandidateDAOImpl();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
       
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html");
//		try (PrintWriter writer = response.getWriter()) {
//			Map<Integer, Candidate> candidates = candidateDAO.getAllCandidates();
//			string = "<table>\r\n" + "        <thead>\r\n" + "            <tr>\r\n"
//					+ "                <th>Party</th>\r\n" + "                <th>Candidate Name</th>\r\n"
//					+ "                <th>Total Votes</th>\r\n" + "            </tr>\r\n" + "        </thead>\r\n"
//					+ "        <tbody>\r\n";
//			candidates.values().stream().sorted((a,b)->b.getVotes()-a.getVotes()).forEach(c -> {
//				string += "<tr><td>" + c.getParty() + "</td><td>" + c.getName() + "</td><td>"+ c.getVotes() + "</td></tr>";
//			});
//			string += "</tbody></table>";
//			writer.print(string);
//			writer.print("<h2><a href='login.html'>Logout</a></h2>");
//		};
//	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");
	    try (PrintWriter writer = response.getWriter()) {
	        Map<Integer, Candidate> candidates = candidateDAO.getAllCandidates();
	        
	        StringBuilder html = new StringBuilder();
	        html.append("<html>");
	        html.append("<head>");
	        html.append("<style>");
	        html.append("table { width: max-content; border-collapse: collapse; margin: auto }");
	        html.append("th, td { border: 1px solid #ddd; padding: 8px; text-align: left; }");
	        html.append("th { background-color: #f2f2f2; }");
	        html.append("tr:nth-child(even) { background-color: #f9f9f9; }");
	        html.append("tr:hover { background-color: #f1f1f1; }");
	        html.append("h2 { margin-top: 20px; text-align: center }");
	        html.append("a { text-decoration: none; color: #007BFF; }");
	        html.append("a:hover { text-decoration: underline; }");
	        html.append("</style>");
	        html.append("</head>");
	        html.append("<body>");
	        html.append("<h2><a href='login.html'>Logout</a></h2>");
	        html.append("<table>");
	        html.append("<thead>");
	        html.append("<tr>");
	        html.append("<th>Party</th>");
	        html.append("<th>Candidate Name</th>");
	        html.append("<th>Total Votes</th>");
	        html.append("</tr>");
	        html.append("</thead>");
	        html.append("<tbody>");

	        candidates.values().stream().sorted((a, b) -> b.getVotes() - a.getVotes()).forEach(c -> {
	            html.append("<tr>")
	                .append("<td>").append(c.getParty()).append("</td>")
	                .append("<td>").append(c.getName()).append("</td>")
	                .append("<td>").append(c.getVotes()).append("</td>")
	                .append("</tr>");
	        });

	        html.append("</tbody>");
	        html.append("</table>");
	        html.append("</body>");
	        html.append("</html>");
	        
	        writer.print(html.toString());
	    }
	}


}
