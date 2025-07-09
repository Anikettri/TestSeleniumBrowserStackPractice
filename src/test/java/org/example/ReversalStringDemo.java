package org.example;

public class ReversalStringDemo {
    public static void main(String[] args) {
        String str = "Automation java Selenium";
        String[] values = str.split(" ");
        StringBuilder builder = new StringBuilder();
        for(int i=values.length-1;i>=0;i--){
            builder.append(values[i]).append(" ");
        }
        System.out.println(builder.toString().trim());
    }
}
