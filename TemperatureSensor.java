package com.smarthome;

public class TemperatureSensor {
    private String name;
    private double temperature;

    public TemperatureSensor(String name, double temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getName() {
        return name;
    }
}
