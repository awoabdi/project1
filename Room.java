package com.smarthome;

import java.util.ArrayList;
import java.util.List;

import com.vendor.ThermostatInterface;

public class Room {
    private List<TemperatureSensor> sensors;
    private ThermostatInterface thermostat; 

    public Room(String name) {
        this.sensors = new ArrayList<>();
    }

    public void addSensor(TemperatureSensor sensor) {
        sensors.add(sensor);
    }

    public List<TemperatureSensor> getSensors() {
        return sensors; // Returnthe list of sensors
    }

    public void setThermostat(ThermostatInterface thermostat) {
        this.thermostat = thermostat; // Method to set the thermostat
    }

    public ThermostatInterface getThermostat() {
        return thermostat; // this is a method to get the thermostat
    }

	public double getAverageTemperature() {
		
		return 0;
	}

  
}
