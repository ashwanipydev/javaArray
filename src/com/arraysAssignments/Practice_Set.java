package com.arraysAssignments;

import java.util.Arrays;

public class Practice_Set {
    public static void main(String[] args) {
        /*
        // Create an array of 5 floats add calculate their sum
        float[] arr = new float[5];
        arrayOfFloat(arr);
         */
        // Create a program to find out whether a given integer is present in an array or not?
        int[] arr = {1,2,3,4,5,6};
//        System.out.println(isElementPresent(arr, 8));
        // Calculate the average marks form an array containing of all students in physics using for each loop;
        int[] marks = {77,65,76,55,76,86,56,88,88,56};
//        System.out.println(calculateAvr(marks));
        // Create a java program to add two matrix of size 2X3;
        int[][] mat1 = {{1,2,3},{4,5,6}};
        int[][] mat2 = {{2,6,13},{3,7,1}};
//        addMatrixs(mat1,mat2);
        // Write a java program to reverse array ;
        int[] arr1 = {10,212,30,443,5};
//        reverseArray(arr1);
        // Write a java program to find the maximum element in array in an array;
        System.out.println(Arrays.toString(arr1));
        System.out.println("Maximum number in array is "+maximumInArray(arr1));
        // Write a java program to find the minimum element in array in an array;
        System.out.println("Minimum number in array is "+minimumInArray(arr1));
        // Write a java program to find whether an array is sorted or not;
        int[] sorted = { 1,2,3,4,9,6};
        System.out.println( isSorted(sorted));
    }

    private static boolean isSorted(int[] sorted) {
        for (int i = 0; i < sorted.length-1; i++) {
            if (sorted[i] > sorted[i + 1]){
                return false;
            }
        }
        return true;
    }

    private static int minimumInArray(int[] arr1) {
        int minimumInt = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (minimumInt > arr1[i]){
                minimumInt = arr1[i];
            }
        }
        return minimumInt;
    }

    private static int maximumInArray(int[] arr1) {
        int maximumInt = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (maximumInt < arr1[i]){
                maximumInt = arr1[i];
            }
        }
        return maximumInt;
    }

    private static void reverseArray(int[] arr1) {
        int[] reverse = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
                     reverse[i] = arr1[arr1.length - 1 -i];
        }
        System.out.println(Arrays.toString(reverse));
    }

    private static void addMatrixs(int[][] mat1, int[][] mat2) {
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print((mat1[i][j] + mat2[i][j])+ " ");
            }
            System.out.println();
        }
    }

    private static double calculateAvr(int[] marks) {
        double avr = 0;
        for (int i = 0; i < marks.length; i++) {
            avr += marks[i];
        }
        return avr / marks.length;
    }

    private static boolean isElementPresent(int[] arr, int index1) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == index1){
                return true;
            }
        }
        return false;
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
