package com.gmail.justinvsoficial.carfactory.cars;

import com.gmail.justinvsoficial.carfactory.ICar;

public class Ferrari implements ICar {

    @Override
    public void turnOn() {
        System.out.println("\033[32mFerrari turned on successfully\u001B[0m");

    }

    @Override
    public void turnOff() {
        System.out.println("\033[31mFerrari turned off successfully\u001B[0m");

    }
}
