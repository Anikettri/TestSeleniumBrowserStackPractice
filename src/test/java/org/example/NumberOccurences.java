package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class NumberOccurences {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 2, 3, 5, 7, 5};
        Map<Integer, Integer> countNUmber = new LinkedHashMap<>();
        for(int number : arr){
            countNUmber.put(number, countNUmber.getOrDefault(number, 0)+1);
        }
        for(int key : countNUmber.keySet()){
            System.out.println(key+" "+countNUmber.get(key));
        }
    }
}
