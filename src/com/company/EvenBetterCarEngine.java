package com.company;

public class EvenBetterCarEngine implements Cloneable { //!!!!Cloneable interface needs to be implemented!!!!

    private String name;

    public EvenBetterCarEngine(String name) {
        this.name = name;
    }

    @Override
    public EvenBetterCarEngine clone() { //For the deep copy example to work, the lower class objects of the objects that need deep copies created also need their own clone() methods overwritten and specified
        try {                            //This creates a shallow copy of this data type within the higher class. If there are other complex data types nested into this class then this too would need
            return (EvenBetterCarEngine) super.clone(); //the overwritten deep clone() method of their parent class. !!!!Cloneable interface needs to be implemented!!!!
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
