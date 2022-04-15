package com.company;

public class SuperCar {

    private String brand;
    private int horsePower;
    private SuperCarEngine engine;

    public SuperCar(String brand, int horsePower, SuperCarEngine engine) {
        this.brand = brand;
        this.horsePower = horsePower;
        this.engine = engine;
    }

    //copy constructor
    public SuperCar(SuperCar other) {
        //primitive attributes
        this.brand = other.getBrand();
        this.horsePower = other.getHorsePower();

        //complex attributes
        SuperCarEngine engineOther = new SuperCarEngine(other.getEngine().getName());
        this.engine = engineOther;
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", hp: " + this.horsePower + ", engine type: " + this.engine.getName();
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

    public SuperCarEngine getEngine() {
        return engine;
    }

    public void setEngine(SuperCarEngine engine) {
        this.engine = engine;
    }
}
