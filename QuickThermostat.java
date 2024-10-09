package com.smarthome;

import com.vendor.ThermostatInterface; 

public class QuickThermostat implements ThermostatInterface {
    private double desiredTemperature;

    public QuickThermostat(double defaultTemperature) {
        this.desiredTemperature = defaultTemperature;
    }

    @Override
    public void setTemperature(double temperature) {
        this.desiredTemperature = temperature;
    }

    @Override
    public double getTemperature() {
        return desiredTemperature;
    }
}
