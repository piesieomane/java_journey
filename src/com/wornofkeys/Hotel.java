package com.wornofkeys;

public class Hotel extends House {
    public Hotel(String ownerName, int floors) {
        super(ownerName,floors);
    }
    //Method Overriding
    public void print() {
        System.out.println("Hello, World, This hotel is owned by "+ getOwnername() + " and there are "+ getFloor() + " floors in the hotel");
    }

    //Method Overloading
    public void print(int times) {
        for (int i = 0 ; i < times; i++) {
            print();
        }
    }
}
