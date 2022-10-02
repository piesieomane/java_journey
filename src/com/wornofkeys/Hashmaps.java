package com.wornofkeys;

import java.util.HashMap;
import java.util.Map;

public class Hashmaps {
    public static void main(String [] args) {
        // HAsh Maps

        Map<String, Integer> scores = new HashMap<>();
        scores.put("Piesie", 22);
        scores.put("Ato", 12);
        scores.put("Kankam", 14);

        System.out.println(scores);

        for (String key : scores.keySet()) {
            System.out.println(key);
        }

        for (int key : scores.values()) {
            System.out.println(key);
        }

        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry);
            String key = entry.getKey();
            int value = entry.getValue();

            System.out.println(key + " has " + value + " points ");
        }
    }
}
