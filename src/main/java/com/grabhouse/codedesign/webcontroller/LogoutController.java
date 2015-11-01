package com.grabhouse.codedesign.webcontroller;

import com.grabhouse.codedesign.utils.Constants;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "logoutController", urlPatterns = "/logout")
public class LogoutController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if(session!=null && session.getAttribute(Constants.USER_NAME)!=null){
			session.invalidate();
			req.setAttribute("message", "Successfully Logged out!");
		}
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
