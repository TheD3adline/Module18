package com.company;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Audi", 250);
        Car car2;

        car2 = car1;

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();

        car2.setBrand("BMW");
        car2.setHorsePower(280);

        System.out.println(car1);
        System.out.println(car2);

        System.out.println("---------------------------------------");

        int var1 = 20;
        int var2;

        var2 = var1;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println();

        var2 = 40;

        System.out.println(var1);
        System.out.println(var2);

        System.out.println("---------------------------------------");

        Car car3 = new Car("Audi", 250);
        Car car4 = car3.clone();

        System.out.println(car3);
        System.out.println(car4);
        System.out.println();

        car4.setBrand("BMW");
        car4.setHorsePower(280);

        System.out.println(car3);
        System.out.println(car4);

        System.out.println("---------------------------------------");
        System.out.println("***************************************");
        System.out.println("---------------------------------------");

        BetterCarEngine engine1 = new BetterCarEngine("Diesel 1.8l");

        BetterCar car5 = new BetterCar("Audi", 250, engine1);
        BetterCar car6 = car5.clone();

        System.out.println(car5);
        System.out.println(car6);
        System.out.println();

        car6.setBrand("BMW");
        car6.setHorsePower(280);
        car6.getEngine().setName("Petrol 2.0l");

        System.out.println(car5);
        System.out.println(car6);
    }
}
