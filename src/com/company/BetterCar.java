package com.company;

public class BetterCar implements Cloneable {

    private String brand;
    private int horsePower;
    private BetterCarEngine engine;

    public BetterCar(String brand, int horsePower, BetterCarEngine engine) {
        this.brand = brand;
        this.horsePower = horsePower;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", hp: " + this.horsePower + ", engine type: " + this.engine.getName();
    }

    @Override
    public BetterCar clone() {
        try {
            return (BetterCar) super.clone();
        } catch(CloneNotSupportedException e) {
            System.out.println("Unexpected exception during clone process");
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

    public BetterCarEngine getEngine() {
        return engine;
    }

    public void setEngine(BetterCarEngine engine) {
        this.engine = engine;
    }
}
