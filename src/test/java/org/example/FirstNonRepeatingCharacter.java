package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String nonRepeatingCharacterInput = "Selenium";
       Map<Character, Integer> countMap = new LinkedHashMap<>();
       for(char ch : nonRepeatingCharacterInput.toCharArray()){
           countMap.put(ch, countMap.getOrDefault(ch, 0)+1);
       }
       for(char ch : countMap.keySet()){
           if(countMap.get(ch)==1){
               System.out.println("First non repeating character is : "+ch);
               break;
           }
       }

    }
}
