package com.smarthome;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private List<Room> rooms;

    public Building() {
        rooms = new ArrayList<>(); // To state the list of rooms
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public double getAverageTemperature() {
        double total = 0;
        int count = 0;
        for (Room room : rooms) {
            total += room.getAverageTemperature();
            count++;
        }
        return count > 0 ? total / count : 0; // Dont divide by zero
    }
}
