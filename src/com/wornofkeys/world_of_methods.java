package com.wornofkeys;

public class world_of_methods {
    public static void main (String [] args) {
        System.out.println(add(5,9));
        System.out.println(add(5,8));
        System.out.println(add(5,9));

    }
    public static int add (int num1, int num2) {
        int number = num1 + num2;
        return number;
    }
}
