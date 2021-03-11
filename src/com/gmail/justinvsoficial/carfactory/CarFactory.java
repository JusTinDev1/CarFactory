package com.gmail.justinvsoficial.carfactory;

import com.gmail.justinvsoficial.carfactory.cars.Ferrari;
import com.gmail.justinvsoficial.carfactory.cars.Mazda;
import com.gmail.justinvsoficial.carfactory.cars.McLaren;

public class CarFactory {

    public ICar create(String type) {
        if (type == null) {
            return null;
        }
        
        if (type.equalsIgnoreCase("mazda")) {
            return new Mazda();
        }

        if (type.equalsIgnoreCase("ferrari")) {
            return new Ferrari();
        }

        if (type.equalsIgnoreCase("mclaren")) {
            return new McLaren();
        }

        return null;
    }
}
