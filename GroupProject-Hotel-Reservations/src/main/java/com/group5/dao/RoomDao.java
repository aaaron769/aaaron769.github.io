package com.group5.dao;

import com.group5.model.Guest;
import com.group5.model.Room;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RoomDao {


    Map<Integer, Room> roomDB = new HashMap<Integer, Room>();

    // block 1
    {
        Room room1 = new Room(  "single", 1, 100);

        Room room2 = new Room(  "double", 1, 200);
        Room room3 = new Room(  "deluxe", 1, 500);
        Room room4 = new Room(  "single", 1, 100);
        Room room5 = new Room(  "double", 1, 200);
        Room room6 = new Room(  "deluxe", 1, 500);
        addRoom(room1);
        addRoom(room2);
        addRoom(room3);
        addRoom(room4);
        addRoom(room5);
        addRoom(room6);

    }

    // block 2
    {
        Room room1 = new Room(  "single", 1, 100);

        Room room2 = new Room(  "double", 1, 200);
        Room room3 = new Room(  "deluxe", 1, 500);
        Room room4 = new Room(  "single", 1, 100);
        Room room5 = new Room(  "double", 1, 200);
        Room room6 = new Room(  "deluxe", 1, 500);
        addRoom(room1);
        addRoom(room2);
        addRoom(room3);
        addRoom(room4);
        addRoom(room5);
        addRoom(room6);

    }

    public void addRoom(Room room){
        int id = genId();
        room.setId(id);
        roomDB.put(id,room);
    }
    //read
    public Room getRoom(Integer id){
        return roomDB.get(id);
    }

    // read All
    public List<Room> getAllRoom(){
        return roomDB.values().stream().collect(Collectors.toList());
    }
    //update
    public void updateRoom( Room room){
        roomDB.put(room.getId(),room);
    }
    // getById
    public Room getRoomById(Integer id){
        return roomDB.get(id);
    }

    public Integer genId() {
        return roomDB.size()+1;
    }

    public Room getRoomByTypeAndOccupy(String type, Guest guest){

        for (Map.Entry<Integer, Room> entry : roomDB.entrySet()) {
            Room roomUpdate = entry.getValue();
            if(roomUpdate.getType().equals(type) && !roomUpdate.isOccupied()){

                roomUpdate.setOccupied(true);
                roomUpdate.setGuest(guest);
                roomDB.put(roomUpdate.getId(),roomUpdate);
                return roomUpdate;
            }
        }
        return null;

    }

}
