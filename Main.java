package com.smarthome;

public class Main {
    public static void main(String[] args) {
        // Create a thermostat with a wanted temp of 20.0
        ThermoSetX19 thermostat = new ThermoSetX19(20.0);

        //  getting temperature
        System.out.println("Initial desired temperature: " + thermostat.getTemperature() + "°C");

        // this is tochange the desired temperature
        thermostat.setTemperature(22.5);
        System.out.println("Updated desired temperature: " + thermostat.getTemperature() + "°C");

      
        Room livingRoom = new Room("Living Room");
        livingRoom.setThermostat(thermostat); 
        
    }
}
