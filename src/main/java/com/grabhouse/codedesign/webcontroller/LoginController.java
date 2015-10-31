package com.grabhouse.codedesign.webcontroller;

import com.grabhouse.codedesign.beans.User;
import com.grabhouse.codedesign.utils.HibernateUtil;
import org.hibernate.Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by srihari on 1/11/15.
 */
@WebServlet(name="loginController", urlPatterns = "/login")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String hql = "select u from User u where u.userName = :userName";
        String userId = req.getParameter("userName");
        String password = req.getParameter("password");
        String role = req.getParameter("role");
        HibernateUtil util = new HibernateUtil();
        Session session = util.getSession();
        User user = (User) session.createQuery(hql).setParameter("userName" , userId).uniqueResult();
        if(user != null && user.getPassword().equals(password)){
            session.close();
            req.getRequestDispatcher("seeker_home.jsp");
        }else{
            session.close();
            req.setAttribute("message","UserName or Password was not found!");
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        }
    }
}
