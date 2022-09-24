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
        int results = 0;

        switch (operation) {
            case "+":
                results = numberTwo + numberTwo;
                break;
            case "-":
                results = numberTwo - numberTwo;
                break;
            case "/":
                results = numberTwo / numberTwo;
                break;
            case "*":
                results = numberTwo * numberTwo;
                break;
        }
        System.out.println("The answer is :" + results);
        System.out.println(results);
    }
}
