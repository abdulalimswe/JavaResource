package org.student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        bikes bike = new bikes();
        bikes bike2 = new bikes();

        cars car = new cars();
        cars car2 = new cars();

        bike.model = "Yamaha R15";
        bike2.model = "Honda CRV";
        car.model = "BMW 520i";
        car2.model = "Audi A4";
        bike.price = 10000;
        bike2.price = 15000;
        car.price = 20000;
        car2.price = 25000;
        bike.color = "Black";
        bike2.color = "White";
        car.color = "Red";
        car2.color = "Blue";
        bike.year = 2018;
        bike2.year = 2019;
        car.year = 2017;
        car2.year = 2016;

        System.out.println("What do you want to buy?");
        System.out.println("1. Bike \n2. Car");

        int choice = sc.nextInt();

        if(choice == 1){
            System.out.println("We have two bikes for you:");
            System.out.println("Bike 1: " + bike.model);
            System.out.println("Bike 2: " + bike2.model);

            int x;
            x = sc.nextInt();
            if(x == 1){
                System.out.println("You have chosen bike 1");
                System.out.println("Bike Price: " + bike.price);
            }
            else{
                System.out.println("You have chosen bike 2");
                System.out.println("Bike Price: " + bike2.price);
            }
        }
        else if(choice == 2){
            System.out.println("We have two cars for you:");
            System.out.println("Car 1: " + car.model);
            System.out.println("Car 2: " + car2.model);
            int y;
            y = sc.nextInt();
            if(y == 1){
                System.out.println("You have chosen car 1");
                System.out.println("Car Price: " + car.price);
            }
            else{
                System.out.println("You have chosen car 2");
                System.out.println("Car Price: " + car2.price);
            }
        }
    }
}
