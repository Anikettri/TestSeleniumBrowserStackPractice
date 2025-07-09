package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 6};
        int count=0;
        Arrays.sort(arr);
        int[][] result= new int[arr.length][2];
        for(int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++)
            if(arr[i]+arr[j]==10){
               result[count][0]=arr[i];
                result[count][1]=arr[j];
                count++;
            }
        }
        for(int[] output : result){
            System.out.print(output[0]);
            System.out.print(output[1]);
        }
        System.out.println();
    }
}
