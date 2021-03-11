package com.gmail.justinvsoficial.carfactory.cars;

import com.gmail.justinvsoficial.carfactory.ICar;

public class McLaren implements ICar {

    @Override
    public void turnOn() {
        System.out.println("\033[32mMcLaren turned on successfully\u001B[0m");

    }

    @Override
    public void turnOff() {
        System.out.println("\033[31mMcLaren turned off successfully\u001B[0m");

    }
}
