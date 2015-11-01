package com.grabhouse.codedesign.webcontroller;

import com.grabhouse.codedesign.beans.User;
import com.grabhouse.codedesign.dao.UserDao;
import com.grabhouse.codedesign.utils.Constants;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

@WebServlet(name = "loginController", urlPatterns = "/login")
public class LoginController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String hql = "select u from User u where u.userName = :userName";
		String userName = req.getParameter(Constants.USER_NAME);
		String password = req.getParameter(Constants.PASSWORD);
		req.getSession().setAttribute(Constants.USER_NAME, userName);
		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
		String role = UserDao.isUserExist(user);
		System.out.println(">>>>>>>>>>"+role);
		if (role!=null) {
			req.getSession(false).setAttribute(Constants.ROLE, role);
			if("House Owner".equals(role)) {
				req.getRequestDispatcher("owner_home.jsp").forward(req, resp);
			} else {
				req.getRequestDispatcher("seeker_home.jsp").forward(req, resp);
			}
			
		} else {
			req.setAttribute("message", "UserName or Password was not found!");
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
	}
}
