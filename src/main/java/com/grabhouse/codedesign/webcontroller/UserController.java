package com.grabhouse.codedesign.webcontroller;

import com.grabhouse.codedesign.beans.User;
import com.grabhouse.codedesign.dao.UserDao;
import com.grabhouse.codedesign.utils.Constants;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;


/**
 * Created by srihari on 31/10/15.
 */
@WebServlet(name="userController", urlPatterns = {"/user"})
public class UserController extends HttpServlet {
    Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String houseId = req.getParameter("houseId");
        User user = UserDao.getUserByUserName(userName);
        req.setAttribute("houseId", houseId);
        req.setAttribute("user", user);
        req.getRequestDispatcher("user_details.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String success = "Successfully created User";
    	String error = "Error creating user";
    	
        String userName = req.getParameter(Constants.USER_NAME);
        String name = req.getParameter(Constants.NAME);
        String role = req.getParameter(Constants.ROLE);
        String phone = req.getParameter(Constants.PHONE);
        String emailId = req.getParameter(Constants.EMAIL);
        String password = req.getParameter(Constants.PASSWORD);
        
        User user = new User();
        user.setUserName(userName);
        user.setName(name);
        user.setPassword(password);
        user.setEmailId(emailId);
        user.setPhoneNumber(phone);
        user.setRole(role);
        if(UserDao.addUser(user)) {
        System.out.println("Done..."+user.toString());
       
        
        req.setAttribute("message", success);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
        } else {
        	req.setAttribute("message", error);
        	 req.getRequestDispatcher("user_sign_up.jsp").forward(req, resp);        	
        }
    }

   
}
