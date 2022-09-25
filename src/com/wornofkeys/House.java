package com.wornofkeys;

public class House {
    //Access modifier
    private String ownername;
    private int floors;

    public House(String ownername, int floors) {
        this.ownername = ownername;
        this.floors = floors;
    }
    public void print() {
        System.out.println("Hello, World, I am the owner "+ this.ownername + "and there are "+ this.floors + "floors in the house");
    }

    //Getter Method
    public String getOwnername() {
        return ownername;
    }
}
