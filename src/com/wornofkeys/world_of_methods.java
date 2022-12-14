package com.wornofkeys;

import java.util.Random;

public class world_of_methods {
    public static void main (String [] args) {
//        System.out.println(add(5,9));
//        System.out.println(add(5,8));
//        System.out.println(add(5,9));
//        System.out.println(add("Hello", " World"));
//        arrays();
//        array();
//        System.out.println(addition(5, 7, 7, 8, 9));
        //constants
        //final int age = 20;

        //casting Primitive
//        int num = 20;
//        double num1 = num;
//        System.out.println(num1);
//        double num = 20.5;
//        int num1 = (int) num;

        //casting to and from Strings(Reference type)
//        String str = "10";
//        int num = Integer.parseInt(str);
//        System.out.println(num);
//        int num = 10;
//        String str = String.valueOf(num);
//        System.out.println(str);

        //Generate random number
//        int number = new Random().nextInt(10);
//        System.out.println(number);

        //Newer way of generating random number
//        double number = Math.random();
//        System.out.println(number);

    }
    public static int add (int num1, int num2) {
        int number = num1 + num2;
        return number;
    }

    public static String add (String s1, String s2) {
        return  s1 + s2;
    }

    public static void arrays () {
        int [] ages = new int[] {2, 3, 4, 5, 6 };
//        System.out.println(ages[3]);
//        System.out.println(ages[2]);
//        System.out.println(ages[2]);
        //Standard For loop
//        for(int i = 0; i < ages.length; i++) {
//            System.out.println(ages[i]);
//        }
        //Using For Each loop
        for (int number: ages) {
            System.out.println(number);
        }
    }

    public  static  void array () {
        int [][] scores = {
                {2,3,4},
                {4,6,7}
        };
        for (int [] score: scores) {
            for(int number : score) {
                System.out.println(number);
            }
        }
    }

    public  static int addition(int ...args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }

}
