package com.wornofkeys;

public class world_of_methods {
    public static void main (String [] args) {
        System.out.println(add(5,9));
        System.out.println(add(5,8));
        System.out.println(add(5,9));
        System.out.println(add("Hello", " World"));
        arrays();
        array();

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
}
