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
        int l = 0;

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
        System.out.println("The answer is :");
        System.out.println(l);
    }
}
