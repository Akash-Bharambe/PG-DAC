package com.app.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.DAO.VoterDAO;
import com.app.DAO.VoterDAOImpl;
import com.app.core.Voter;

/**
 * Servlet implementation class SignupServelt
 */
@WebServlet("/signup")
public class SignupServelt extends HttpServlet {

	private VoterDAO voterDOA;

	@Override
	public void init() throws ServletException {
		try {
			voterDOA = new VoterDAOImpl();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String dob = request.getParameter("dob");

		LocalDate date = LocalDate.parse(dob);
		if (date.plusYears(21).isAfter(LocalDate.now())) {
			try (PrintWriter pWriter = response.getWriter()) {
				pWriter.print("<h2>Age must be greater than 21 to vote <a href='login.html'>Login</a></h2>");
			}
		} else {

			try {
				if (voterDOA.voterRegistration(
						new Voter(first_name, last_name, email, password, LocalDate.parse(dob), false, "voter")))
					response.sendRedirect("login.html");

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
