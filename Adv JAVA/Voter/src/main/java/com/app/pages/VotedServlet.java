package com.app.pages;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.DAO.CandidateDAO;
import com.app.DAO.CandidateDAOImpl;

/**
 * Servlet implementation class VotedServlet
 */
@WebServlet("/vote/*")
public class VotedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CandidateDAO candidateDAO;
	
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pathInfo = request.getPathInfo();
		
		if(!pathInfo.equals("/")) {
			String candidateID = pathInfo.substring(1);
			try {
				System.out.println(candidateID);
				candidateDAO.addVote(Integer.parseInt(candidateID));
				response.sendRedirect("/Voter/logout");
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
