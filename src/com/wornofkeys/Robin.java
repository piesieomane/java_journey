package com.wornofkeys;

public class Robin extends Bird implements Animal{
    public Robin (String type) {
        super(type);
    }

    public void sing() {
        System.out.println("tweet tweet");
    }

    public int averageLifespan() {
        return 6;
    }
}
