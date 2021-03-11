package com.gmail.justinvsoficial.carfactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        displayMenu();
    }







    public static void displayMenu() {
        Scanner input = new Scanner(System.in);
        CarFactory carFactory = new CarFactory();

        System.out.println("¿Which car would you want to create? ");
        System.out.println("- Ferrari");
        System.out.println("- McLaren");
        System.out.println("- Mazda");
        System.out.print("Enter name here: ");
        String type = input.nextLine();

        if (type.equalsIgnoreCase("ferrari") || type.equalsIgnoreCase("mazda")
                || type.equalsIgnoreCase("mclaren")){

        } else {
            System.out.println("\033[31mType a correct car model!\u001B[0m");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            displayMenu();
        }
        ICar car = carFactory.create(type);
        System.out.println("\033[32m created successfully\u001B[0m");
        System.out.println(" ");
        car.turnOn();
        yesOrNoTurnOff(car);
    }





    public static void yesOrNoTurnOff(ICar car) {
        Scanner input = new Scanner(System.in);


        System.out.println(" ");
        System.out.println(" ");
        System.out.println("¿Would you like to turn off you car?");
        System.out.print("¿yes or no? : ");
        String option = input.nextLine();

        if(option.equalsIgnoreCase("yes")) {
            car.turnOff();

        } else if (option.equalsIgnoreCase("no")) {

        } else {
            System.out.println("\033[31mType a correct answer.\u001B[0m");
            yesOrNoTurnOff(car);
        }

    }
}
