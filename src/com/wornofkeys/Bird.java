package com.wornofkeys;

public class Bird {
    public static int wings  = 2;

    public String type;
    public Bird(String type) {this.type = type;}

    public static int getWings() {
        return wings;
    }

}
