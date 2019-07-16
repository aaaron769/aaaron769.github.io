package com.group5.dao;



import com.group5.model.Guest;
import com.group5.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class GuestDao {

    Map<Integer, Guest> guestDb = new HashMap<Integer, Guest>();
    // I just want to add 4 guest to Map
    {

       Guest guest1 = new Guest(  "Aaron" ,"Gezai" ,
               "AAARON769@GMAIL.COM ", "252522",
               "2019-07-09","7188380622",
               "12422 17th AV NE", "cdf",
               "SEATTLE" , "WA","98125" ,"United States",
               "2019-07-10","2019-07-24","1_BedRoom",
               "I am vegetarian! ","visa" ,"14141414141414",
               "2019-12-28" , "2565" ,"Yes");
        addGuest(guest1);
        Guest guest2 = new Guest(  "Jems" ,"Alituhiki" ,
                "Jems@GMAIL.COM ", "22222",
                "1999-07-01","7188380622",
                "15217th AV NE", "cdf",
                "NewYork" , "NY","98585" ,"United States",
                "2019-07-15","2019-07-29","1_BedRoom",
                "I am vegetarian! ","visa" ,"14141414141414",
                "2025-12-29" , "255" ,"Yes");
        addGuest(guest2);
        Guest guest3 = new Guest(  "Samuel" ,"Asmelash" ,
                "samuel@GMAIL.COM ", "23322",
                "2019-07-09","7188380622",
                "2568 17th AV NE", "cdf",
                "Dallas" , "Texas","25225" ,"United States",
                "2019-07-30","2019-08-24","1_BedRoom",
                "I am vegetarian! ","visa" ,"14141414141414",
                "2025-12-28" , "2585" ,"Yes");
        addGuest(guest3);
        Guest guest4 = new Guest(  "simon" ,"tekle" ,
                "asmara@GMAIL.COM ", "2858522",
                "1989-07-09","7188358822",
                "85858 17th AV NE", "cdf",
                "Denver" , "Co","9858" ,"United States",
                "2019-07-13","2019-08-12","1_BedRoom",
                "I am vegetarian! ","visa" ,"14141414141414",
                "2023-12-28" , "2525" ,"Yes");
        addGuest(guest4);




    }
    //Crud manipulation

    public void addGuest(Guest guest){
        int id = genId();
        guest.setId(id);
        guestDb.put(id,guest);
    }
    public void removeGuest(Guest guest){
        guestDb.remove(guest.getId(), guest);
    }
    //read
    public Guest getGuest(Integer id){
        return guestDb.get(id);
    }

    // read All
    public List<Guest> getAllGuest(){
        return guestDb.values().stream().collect(Collectors.toList());
    }
    //update
    public void updateGuest( Guest guest){
        guestDb.put(guest.getId(),guest);
        }
        // getById
    public Guest getGuestById(Integer id){
        return guestDb.get(id);
    }

    public Integer genId() {
        return guestDb.size()+1;
    }



}
