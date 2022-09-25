package com.wornofkeys;

public class Hotel extends House {
    public Hotel(String ownerName, int floors) {
        super(ownerName,floors);
    }

    public void print() {
        System.out.println("Hello, World, I am the owner "+ getOwnername() + "and there are "+ getFloor() + "floors in the house");
    }
}
