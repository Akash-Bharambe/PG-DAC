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
import com.app.DAO.VoterDAO;
import com.app.DAO.VoterDAOImpl;
import com.app.core.Candidate;
import com.app.core.Voter;

@WebServlet(value = "/login", loadOnStartup = 1)
public class LoginServlet extends HttpServlet {
	private VoterDAO voterDOA;
	private CandidateDAO candidateDAO;
	private static String string;

	@Override
	public void init() throws ServletException {
		try {
			voterDOA = new VoterDAOImpl();
			candidateDAO = new CandidateDAOImpl();
		} catch (SQLException e) {
			throw new ServletException("Error in INIT" + getClass(), e);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");

		String email = req.getParameter("email");
		String password = req.getParameter("password");

		try (PrintWriter pw = resp.getWriter()) {
			Voter voter = voterDOA.login(email, password);
			if (voter == null) {
				pw.print("<h5>Invalid Login , Please <a href='login.html'>Retry</a></h5>");
			} else {
				if (voter.getRole().equals("admin")) {
					resp.sendRedirect("admin_page");
				} else {
					if (voter.isStatus()) {
						resp.sendRedirect("logout");
					} else {
						Map<Integer, Candidate> allCandidates = candidateDAO.getAllCandidates();
						string = "<table>\r\n" + "        <thead>\r\n" + "            <tr>\r\n"
								+ "                <th>Party</th>\r\n" + "                <th>Candidate Name</th>\r\n"
								+ "                <th>Vote</th>\r\n" + "            </tr>\r\n" + "        </thead>\r\n"
								+ "        <tbody>\r\n";
						allCandidates.values().stream().forEach(c -> {
							string += "<tr><td>" + c.getParty() + "</td><td>" + c.getName() + "</td><td><a href= 'vote/"
									+ c.getId() + "'>Vote</a></td></tr>";
						});
						string += "</tbody></table>";
						pw.print(string);
						allCandidates.values().stream().sorted((a, b) -> b.getVotes() - a.getVotes())
								.forEach(System.out::println);

//						resp.sendRedirect("candidate_list");
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void destroy() {
		try {
			voterDOA.cleanUp();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
