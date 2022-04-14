package com.company;

public class Car implements Cloneable {

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
    public Car clone() {
        try {
            return (Car) super.clone();
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
}
