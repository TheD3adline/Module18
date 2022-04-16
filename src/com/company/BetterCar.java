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
    public BetterCar clone() { //This is the same overwritten clone() method as in the previous example, that will also allow this class to create a shallow copy of itself. !!!!Cloneable interface needs to be implemented!!!!
        try {                  //But since this class also has a complex attribute of the BetterCarEngine.java class within it this will only properly create a copy of the primitive attributes
            return (BetterCar) super.clone(); //while its complex data type, engine, will be shared by all new copies that are created with this method.
        } catch(CloneNotSupportedException e) {
            System.out.println("Unexpected problem during clone process of BetterCar.java");
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
