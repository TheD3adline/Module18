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

        System.out.println("---------------------------------------");

        EvenBetterCarEngine engine2 = new EvenBetterCarEngine("Diesel 1.8l");

        EvenBetterCar car7 = new EvenBetterCar("Audi", 250, engine2);
        EvenBetterCar car8 = car7.clone();

        System.out.println(car7);
        System.out.println(car8);
        System.out.println();

        car8.setBrand("BMW");
        car8.setHorsePower(280);
        car8.getEngine().setName("Petrol 2.0l");

        System.out.println(car7);
        System.out.println(car8);

        System.out.println("---------------------------------------");

        SuperCarEngine engine3 = new SuperCarEngine("Petrol 3.0l");

        SuperCar car9 = new SuperCar("Porsche", 450, engine3);
        SuperCar car10 = new SuperCar(car9);

        System.out.println(car9);
        System.out.println(car10);
        System.out.println();

        car10.setBrand("Mercedes AMG");
        car10.setHorsePower(580);
        car10.getEngine().setName("Petrol 4.0l");

        System.out.println(car9);
        System.out.println(car10);
    }
}
