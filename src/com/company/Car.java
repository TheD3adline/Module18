package com.company;

public class Car implements Cloneable { //!!!!Cloneable interface needs to be implemented!!!!

    private String brand;
    private int horsePower;

    public Car(String brand, int horsePower) {
        this.brand = brand;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", hp: " + this.horsePower;
    }

    @Override
    public Car clone() { //This is the overwritten clone() method that will allow this class to create a shallow copy of itself. !!!!Cloneable interface needs to be implemented!!!!
        try {
            return (Car) super.clone();
        } catch(CloneNotSupportedException e) {
            System.out.println("Unexpected problem during clone process Car.java");
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
}
