package com.grabhouse.codedesign.controller;

import com.google.gson.Gson;
import com.grabhouse.codedesign.beans.House;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by srihari on 31/10/15.
 */
@WebServlet(name="houseController", urlPatterns = {"/houses","/houses/*"})
public class HouseController extends HttpServlet{
    private House house = null;
    private Gson gson = new Gson();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String houseId = req.getParameter("houseId");
        if(houseId != null){
            house = new House();
            house.setHouseId(houseId);
        }

        resp.setContentType("application/json");
        PrintWriter pw = resp.getWriter();
        pw.print(gson.toJson(house));
        pw.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Scanner scanner = new Scanner(new InputStreamReader(req.getInputStream()));
        StringBuilder input = null;
        while(scanner.hasNext()){
            input.append(scanner.next());
        }
        //resp.setContentType("application/json");
        PrintWriter pw = resp.getWriter();
        pw.print(input.toString());
        pw.flush();
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Scanner scanner = new Scanner(new InputStreamReader(req.getInputStream()));
        String input = null;
        if(scanner.hasNext()) input = scanner.next();
        //resp.setContentType("application/json");
        PrintWriter pw = resp.getWriter();
        pw.print(input);
        pw.flush();
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String houseId = req.getParameter("houseId");
    }
}
