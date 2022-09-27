package com.wornofkeys;

public class Crow extends Bird implements Animal{
    public Crow(String type){
        super(type);
    }

    public void sing() {
        System.out.println("crr crr");
    }

    public int averageLifespan() {
        return 6;
    }
}
