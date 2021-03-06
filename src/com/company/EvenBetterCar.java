package com.company;

public class EvenBetterCar implements Cloneable { //!!!!Cloneable interface needs to be implemented!!!!

    private String brand;
    private int horsePower;
    private EvenBetterCarEngine engine;

    public EvenBetterCar(String brand, int horsePower, EvenBetterCarEngine engine) {
        this.brand = brand;
        this.horsePower = horsePower;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", hp: " + this.horsePower + ", engine type: " + this.engine.getName();
    }

    @Override
    public EvenBetterCar clone() { //This is the overwritten clone() method that will also create a copy of the complex data type "engine" of the EvenBetterCarEngine.java class when it is being used.
        try {                      //!!!!Cloneable interface needs to be implemented!!!!
            EvenBetterCar carCopy = (EvenBetterCar) super.clone();
            carCopy.engine = (EvenBetterCarEngine) carCopy.engine.clone();
            return carCopy;
        } catch(CloneNotSupportedException e) {
            System.out.println("Unexpected problem during clone process of EvenBetterCar.java");
        }
        return null;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public EvenBetterCarEngine getEngine() {
        return engine;
    }

    public void setEngine(EvenBetterCarEngine engine) {
        this.engine = engine;
    }
}
