package org.example;

import java.util.LinkedHashSet;
import java.util.Set;

public class SeleniumDemo {
    public static void main(String[] args) {
        String name = "jgiugiiuttttttttttttuuuuuuuuuuuuuuuuguygyu";
        //System.out.println(new StringBuilder(name).reverse());
        Set<Character> seen = new LinkedHashSet<>();
        for(char ch : name.toCharArray()){
            seen.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for(char c : seen){
            sb.append(c);
        }
        System.out.println(sb);
    }
}
