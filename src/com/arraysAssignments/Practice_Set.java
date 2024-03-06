package com.arraysAssignments;

import java.util.Arrays;

public class Practice_Set {
    public static void main(String[] args) {
        /*
        // Create an array of 5 floats add calculate their sum
        float[] arr = new float[5];
        arrayOfFloat(arr);
         */
        // Create a program to find out whether a given integer is present in an array or not

    }

    private static void arrayOfFloat(float[] arr) {
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10*i+1;

        }
        System.out.println(Arrays.toString(arr));
        for (float e : arr){
            sum += e;
//            System.out.println(sum);
        }
        System.out.println("Sum all floats in this array: "+sum);
    }
}
