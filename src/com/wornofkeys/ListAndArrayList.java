package com.wornofkeys;

import java.util.ArrayList;
import java.util.List;

public class ListAndArrayList {
    public static void main(String [] args) {
        // Lists and ArrayLists

        // int [] numbers = {1 ,2, 3};
        //Create an array list with indefinite size
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        numbers.remove(Integer.valueOf(2));

        System.out.println(numbers);
    }
}
