package com.grabhouse.codedesign.webcontroller;

import com.grabhouse.codedesign.beans.House;
import com.grabhouse.codedesign.dao.HouseDao;
import com.grabhouse.codedesign.utils.Constants;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by srihari on 31/10/15.
 */
@WebServlet(name="houseController", urlPatterns = {"/houses","/houses/*"})
public class HouseController extends HttpServlet{
	Logger logger = LogManager.getLogger(this.getClass());
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String houseId = req.getParameter("houseId");
        House house = HouseDao.getHouse(Integer.valueOf(houseId));
        req.setAttribute("house", house);
        req.getRequestDispatcher("house_details.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String errorMsg = "Session has time out, please try again.";
    	if(req.getSession(false) ==null||req.getSession(false).getAttribute(Constants.USER_NAME)==null){
    		req.setAttribute("message", errorMsg);
    		req.getRequestDispatcher("house_detail_add.jsp").forward(req, resp);
    		System.out.println("Session not found");
    		return;
    	}
    	
    	String cmd = req.getParameter(Constants.CMD);
    	if(Constants.LOCATION_SEARCH.equals(cmd)){
    		searchHouse(req,resp);
    	} else {
	    	addHouse(req, resp);    	
	    }
    }

    
    
	private void addHouse(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
			IOException {
		String errorMsg = "Something wrong.... please try again";
    	String successMsg = "House has been saved successfully.";
		String location = req.getParameter(Constants.LOCATION);
		String description = req.getParameter(Constants.DESCRIPTION);
		String photo = req.getParameter(Constants.PHOTO);
		String price = req.getParameter(Constants.PRICE);
		String houseType = req.getParameter(Constants.HOUSE_TYPE);
		String userName = (String)req.getSession(false).getAttribute(Constants.USER_NAME);
		House house = new House();
		house.setLocation(location==null?"":location);
		house.setDescription(description==null?"":description);
		house.setPrice(price==null?0:Float.valueOf(price));
		house.setUserName(userName);
		house.setHouseType(houseType);
		System.out.println(house.toString());
		if(HouseDao.addHouse(house)){
			System.out.println("success");
			req.setAttribute("message", successMsg);
		} else {
			System.out.println("failure");
			req.setAttribute("message", errorMsg);
		}
		req.getRequestDispatcher("house_detail_add.jsp").forward(req, resp);
	}
	
	private void searchHouse(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
	IOException {
		String location = req.getParameter(Constants.LOCATION);
		String houseType = req.getParameter(Constants.HOUSE_TYPE);
		location = location==null?"%":"%"+location+"%";
		houseType = houseType==null?"%":"%"+houseType+"%";
		List<House> houseList = HouseDao.getHouseListPerLocationAndHouseType(location, houseType);
		req.setAttribute("houseList", houseList);
		req.getRequestDispatcher("house_search.jsp").forward(req, resp);
	}
    
    
}
