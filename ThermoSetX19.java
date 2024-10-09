package com.smarthome;

import com.vendor.ThermostatInterface; 

public class ThermoSetX19 implements ThermostatInterface {
    private double desiredTemperature;

    // adding a constructor to initialize with a default temperature
    public ThermoSetX19(double defaultTemperature) {
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
