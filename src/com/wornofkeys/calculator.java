package com.wornofkeys;

import java.util.Scanner;

public class calculator {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your 1st number");
        int numberOne = input.nextInt();

        System.out.println("What is your 2nd number");
        int numberTwo = input.nextInt();

        System.out.println("What is your operation(+, -, /, *)");
        String operation = input.next();
        int l;

        switch (operation) {
            case "+":
                l = numberTwo + numberTwo;
                break;
            case "-":
                l = numberTwo - numberTwo;
                break;
            case "/":
                l = numberTwo / numberTwo;
                break;
            case "*":
                l = numberTwo * numberTwo;
                break;
        }

    }
}
