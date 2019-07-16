package com.group5.controller;

import com.google.gson.Gson;
import com.group5.dao.GuestDao;
import com.group5.dao.RoomDao;
import com.group5.model.CheckinModel;
import com.group5.model.CheckinReturnModel;
import com.group5.model.Guest;
import com.group5.model.Room;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet("/checkin")
public class CheckinController extends HttpServlet {

    private RoomDao roomDao;
    private Gson gson;

    @Override
    public void init(){
            roomDao = new RoomDao();
            gson = new Gson();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String checkinJsonString  = request.getParameter("checkin");
        CheckinModel checkinModel = gson.fromJson(checkinJsonString,CheckinModel.class);
        int guestId = Integer.parseInt(checkinModel.getGuestId());
        String roomType = checkinModel.getRoomType();

        GuestDao guestDao = (GuestDao) request.getSession().getAttribute("guestDAO");
        Guest guest = guestDao.getGuestById(guestId);

        PrintWriter out = response.getWriter();
        CheckinReturnModel checkinReturnModel = new CheckinReturnModel();
        if(!guest.isCheckedin()){
            // get room and occupy it
            Room room = roomDao.getRoomByTypeAndOccupy(roomType,guest);
            if(room != null) {
                // assign room
                guest.setRoom(room);
                guest.setCheckInTime(LocalDateTime.now().toString());
                guest.setCheckedin(true);
                guestDao.updateGuest(guest);
                request.getSession().setAttribute("guestDAO", guestDao);
                checkinReturnModel.setSuccess(true);

            }else{
                checkinReturnModel.setSuccess(false);
                checkinReturnModel.setMessage("Fully Booked!");
            }

        }else{
            checkinReturnModel.setSuccess(false);
            checkinReturnModel.setMessage("Guest is already checked in!");

        }
        out.print(gson.toJson(checkinReturnModel));



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String guestId = request.getParameter("guestId");
        GuestDao guestDao = (GuestDao) request.getSession().getAttribute("guestDAO");
        Guest guest = guestDao.getGuestById(Integer.parseInt(guestId));
        request.setAttribute("guest",guest);
        request.getRequestDispatcher("checkout.jsp").forward(request,response);

    }
}
