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
 * Servlet implementation class CandidateListServlet
 */
@WebServlet("/candidate_list")
public class CandidateListServlet extends HttpServlet {
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		Map<Integer, Candidate> allCandidates = candidateDAO.getAllCandidates();
//		string = "<table>\r\n" + "        <thead>\r\n" + "            <tr>\r\n" + "                <th>Party</th>\r\n"
//				+ "                <th>Candidate Name</th>\r\n" + "                <th>Vote</th>\r\n"
//				+ "            </tr>\r\n" + "        </thead>\r\n" + "        <tbody>\r\n";
//		allCandidates.values().stream().forEach(c -> {
//			string += "<tr><td>" + c.getParty() + "</td><td>" + c.getName() + "</td><td><a href= 'vote/" + c.getId()
//					+ "'>Vote</a></td></tr>";
//		});
//		string += "</tbody></table>";
//		try (PrintWriter writer = response.getWriter()) {
//			writer.print(string);
//		}
//		;
//	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
	    response.setContentType("text/html");

	    Map<Integer, Candidate> allCandidates = candidateDAO.getAllCandidates();
	    StringBuilder html = new StringBuilder();

	    html.append("<html>")
	        .append("<head>")
	        .append("<style>")
	        .append("table { width: max-content; border-collapse: collapse; margin: auto; }")
	        .append("th, td { border: 1px solid #ddd; padding: 8px; text-align: left; }")
	        .append("th { background-color: #f2f2f2; }")
	        .append("tr:nth-child(even) { background-color: #f9f9f9; }")
	        .append("tr:hover { background-color: #f1f1f1; }")
	        .append("a { text-decoration: none; color: #007BFF; }")
	        .append("a:hover { text-decoration: underline; }")
	        .append("</style>")
	        .append("</head>")
	        .append("<body>")
	        .append("<table>")
	        .append("<thead>")
	        .append("<tr>")
	        .append("<th>Party</th>")
	        .append("<th>Candidate Name</th>")
	        .append("<th>Vote</th>")
	        .append("</tr>")
	        .append("</thead>")
	        .append("<tbody>");

	    allCandidates.values().forEach(c -> {
	        html.append("<tr>")
	            .append("<td>").append(c.getParty()).append("</td>")
	            .append("<td>").append(c.getName()).append("</td>")
	            .append("<td><a href='vote/").append(c.getId()).append("'>Vote</a></td>")
	            .append("</tr>");
	    });

	    html.append("</tbody>")
	        .append("</table>")
	        .append("</body>")
	        .append("</html>");

	    try (PrintWriter writer = response.getWriter()) {
	        writer.print(html.toString());
	    }
	}


}
