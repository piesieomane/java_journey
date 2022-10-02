package com.wornofkeys;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String [] args) throws Exception {
//        System.out.println("Hello world!!");
//        int age = 22;
//        String name = "Piesie";
//        boolean isProgramming = true;
//        System.out.println(name);
//        Scanner input = new Scanner(System.in);
//        System.out.println("The number:");
//        int number = input.nextInt();
//        if(number == 50) {
//            System.out.println("The number is 50");
//        }
//        else if(number == 51) {
//            System.out.println("The number is 51");
//        }
//        else if (number == 52) {
//            System.out.println("The number is 52");
//        }
//        else System.out.println("Out of range");

        Scanner input = new Scanner(System.in);
//        System.out.println(input.nextInt());
//        try {
//            //connect to the database
//            System.out.println(input.nextInt());
//        } catch (InputMismatchException e) {
//            //Handle any erros, example invalid login
//            System.out.println("You did not put in the correct number");
//            //e.printStackTrace();
//        } finally {
//            //close any open connections
//            System.out.println("Finally worked");
//        }
//        System.out.println("WOrked");

        //THROWING ERROS
        String nextStr = input.nextLine();

        if(nextStr.equalsIgnoreCase("error")) {
            throw new Exception("An error was given frm the user");
        }

        System.out.println(nextStr);
    }
}
