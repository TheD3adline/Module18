package com.company;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Audi", 250); //This lecture is about the cloning/copying of objects. It works differently to primitive data types.
        Car car2;                                       //When the object is being instantiated first via the "new" keyword it is "created" and given an address in the memory.
                                                        //When another variable of the same class is being declared without an instantiation and then assigned to the previous
        car2 = car1;                                    //variable like what can be done with primitive data types, the variable car2 in this example will now "point" towards
                                                        //the very same object in the memory as car1. It is not copied and a change to the object via car2 will then also apply
        System.out.println(car1);                       //if the object is then later being accessed via car1.
        System.out.println(car2);
        System.out.println();

        car2.setBrand("BMW");
        car2.setHorsePower(280);

        System.out.println(car1);
        System.out.println(car2);

        System.out.println("---------------------------------------");

        int var1 = 20;                                  //Primitive data types work differently, when var2 is being assigned to the previously declared var1, then the content
        int var2;                                       //is being actually copied to var2. Both variables can then be accessed and manipulated separately. They don't point to
                                                        //the same address, like complex types would in the above example.
        var2 = var1;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println();

        var2 = 40;

        System.out.println(var1);
        System.out.println(var2);

        System.out.println("---------------------------------------");

        Car car3 = new Car("Audi", 250); //To actually copy or clone complex data types there are 2 general concepts available. Here it is done via the clone() method
        Car car4 = car3.clone();                        //passed on from Object.java class.
                                                        //without all its lower classes that it may or may not access. If a copy is created with this, and the copied object also references
        System.out.println(car3);                       //to a lower class, then both the car3 and car4 object will access the very same lower object, because the lower object has not been copied in the memory.
        System.out.println(car4);
        System.out.println();

        car4.setBrand("BMW");
        car4.setHorsePower(280);

        System.out.println(car3);
        System.out.println(car4);

        System.out.println("---------------------------------------");
        System.out.println("***************************************");
        System.out.println("---------------------------------------");

        BetterCarEngine engine1 = new BetterCarEngine("Diesel 1.8l");      //This example shows a "shallow copy", a clone method that can copy the class that calls it without also creating separate copies
                                                                                //of all its lower classes that it may or may not access. If a copy is created with this, and the copied object also references
        BetterCar car5 = new BetterCar("Audi", 250, engine1);    //to a lower class, then both the car3 and car4 object will then access the very same lower object, because the lower object has not been copied in the memory.
        BetterCar car6 = car5.clone();                                          //So if we then manipulate the lower object via car6, it will also apply to car5, again, because the very same lower object is being addressed.

        System.out.println(car5);
        System.out.println(car6);
        System.out.println();

        car6.setBrand("BMW");
        car6.setHorsePower(280);
        car6.getEngine().setName("Petrol 2.0l");

        System.out.println(car5);
        System.out.println(car6);

        System.out.println("---------------------------------------");

        EvenBetterCarEngine engine2 = new EvenBetterCarEngine("Diesel 1.8l");   //This example shows a "deep copy" method. This clone() method will properly create a copy of not only the base class and all its primitives, but also
                                                                                     //all its subordinate complex types. The sub objects can then be accessed and manipulated separately without having affecting the complex types of the original car7 object.
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
