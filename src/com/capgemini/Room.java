package com.capgemini;

public class Room {

    private int roomSize;
    private String roomType;
    private int roomID;
    // map<day,boolean,availabilty>


    public Room(int roomSize, String roomType, int roomID) {
        this.roomSize = roomSize;
        this.roomType = roomType;
        this.roomID = roomID;
    }

    public void setRoomSize(int roomSize) {
        this.roomSize = roomSize;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public int getRoomSize() {
        return roomSize;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getRoomID() {
        return roomID;
    }
}
