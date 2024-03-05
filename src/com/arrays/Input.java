package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr= new int[5];
        arr[0] = 12;
        arr[1] = 11;
//        System.out.println(arr[0]);
        // Input using for loop;
        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
        }
        // Print out using for loop;
        for (int j : arr) { // for every element in arr, print the element;
//            System.out.print(j + " "); // Here j is representing element of the arr;
        }
        // third way to print array is
//        System.out.println(Arrays.toString(arr));

        // array of objects;
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "ankit";
        System.out.println(Arrays.toString(str));
    }
}
