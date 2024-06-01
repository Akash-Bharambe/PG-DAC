package com.app.pages;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.DOA.VoterDOA;
import com.app.DOA.VoterDOAImpl;

@WebServlet(value = "/login", loadOnStartup = 1)
public class LoginServlet extends HttpServlet {
	private VoterDOA voterDOA;

	@Override
	public void init() throws ServletException {
		try {
			voterDOA = new VoterDOAImpl();
		} catch (SQLException e) {
			throw new ServletException("Error in INIT" + getClass(), e);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
	}
	
}
