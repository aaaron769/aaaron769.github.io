package com.group5.controller;


import com.google.gson.Gson;
import com.group5.dao.GuestDao;
import com.group5.model.CheckinReturnModel;
import com.group5.model.Guest;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;


public class GuestController extends HttpServlet {
    private GuestDao dao;
    private String contactUs ;
    private Gson gson = new Gson();

    @Override
    public void init() throws ServletException {
        dao = new GuestDao();
        ServletContext sc =this.getServletContext();
        this.contactUs =sc.getInitParameter("hotel-contact");
    }
// the service method doGet will accept the HttpServletRequest and HttpServlet Response
    /**
     * @param request  the request from the client
     * @param response the response send to back to client
     * @throws ServletException
     * @throws IOException
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    /**
     * @param request the response
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String jsonString = request.getParameter("guest");
         Guest guest = gson.fromJson(jsonString,Guest.class);
        // setAttribute to global getServletContext
        request.getServletContext().setAttribute("aGuest",guest);
        request.getServletContext().setAttribute("contactUs",contactUs);
        // adding guest to dao
        dao.addGuest(guest);
        // return to js
            PrintWriter out = response.getWriter();
            out.print(gson.toJson(guest));

    }

}

