package com.company;

public class EvenBetterCarEngine implements Cloneable {

    private String name;

    public EvenBetterCarEngine(String name) {
        this.name = name;
    }

    @Override
    public EvenBetterCarEngine clone() {
        try {
            return (EvenBetterCarEngine) super.clone();
        } catch(CloneNotSupportedException e) {
            System.out.println("Unexpected problem during clone process of EvenBetterCarEngine.java");
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
