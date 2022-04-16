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

    //This is the copy constructor, it is set up to accept a data type of its own class via overloading and then writes the values of all attributes into the newly instantiated object. !!!!Cloneable interface IS NOT required in this case!!!!
    public SuperCar(SuperCar other) {
        //Primitive attributes are rather straightforward.
        this.brand = other.getBrand();
        this.horsePower = other.getHorsePower();

        //To copy complex attributes with this technique a new instance of it is created within the constructor of the parent class and then assigned to the variable.
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
