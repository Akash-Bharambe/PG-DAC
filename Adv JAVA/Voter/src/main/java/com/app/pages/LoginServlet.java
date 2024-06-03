package com.app.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.DAO.CandidateDAO;
import com.app.DAO.CandidateDAOImpl;
import com.app.DAO.VoterDAO;
import com.app.DAO.VoterDAOImpl;
import com.app.core.Candidate;
import com.app.core.Voter;
import com.app.db.DBUtils;

//@WebServlet(value = "/login", loadOnStartup = 1)
public class LoginServlet extends HttpServlet {
	private VoterDAO voterDAO;
	private CandidateDAO candidateDAO;

	@Override
	public void init(ServletConfig config) throws ServletException {
		try {
			DBUtils.openConnection(config.getInitParameter("url"), config.getInitParameter("uname"), config.getInitParameter("password"));
			voterDAO = new VoterDAOImpl();
			candidateDAO = new CandidateDAOImpl();
		} catch (SQLException e) {
			throw new ServletException("Error in INIT" + getClass(), e);
		}
	}
	
	@Override
	public void init() throws ServletException {
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");

		String email = req.getParameter("email");
		String password = req.getParameter("password");
		HttpSession httpSession = req.getSession();

		try (PrintWriter pw = resp.getWriter()) {
			Voter voter = voterDAO.login(email, password);
			httpSession.setAttribute("voter", voter);
			httpSession.setAttribute("voterDAO", voterDAO);
			httpSession.setAttribute("candidateDAO", candidateDAO);
			if (voter == null) {
				pw.print("<h5>Invalid Login , Please <a href='login.html'>Retry</a></h5>");
			} else {
				if (voter.getRole().equals("admin")) {
					resp.sendRedirect("admin_page");
				} else {
					if (voter.isStatus()) {
						resp.sendRedirect("logout");
					} else {
						resp.sendRedirect("candidate_list");
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
			voterDAO.cleanUp();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
