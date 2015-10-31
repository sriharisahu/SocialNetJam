package com.grabhouse.codedesign.controller;

import com.google.gson.Gson;
import com.grabhouse.codedesign.beans.House;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Created by srihari on 31/10/15.
 */
@WebServlet(name="houseController", urlPatterns = {"/houses","/houses/*"})
public class HouseController extends HttpServlet{
    private House house = null;
    private Gson gson = new Gson();
    String houseId = null;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        houseId = req.getParameter("houseId");
        if(houseId != null){
            house = new House();
            house.setHouseId(Integer.parseInt(houseId));
        }else{

        }

        resp.setContentType("application/json");
        PrintWriter pw = resp.getWriter();
        pw.print(gson.toJson(house));
        pw.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(req.getInputStream()));
        String line;
        StringBuilder json = new StringBuilder();
        while((line = br.readLine() ) != null){
            json.append(line);
        }
        resp.setContentType("application/json");
        PrintWriter pw = resp.getWriter();
        pw.print(json);
        pw.flush();
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(req.getInputStream()));
        String line;
        StringBuilder json = new StringBuilder();
        while((line = br.readLine() ) != null){
            json.append(line);
        }
        resp.setContentType("application/json");
        PrintWriter pw = resp.getWriter();
        pw.print(json);
        pw.flush();
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        houseId = req.getParameter("houseId");
    }
}
