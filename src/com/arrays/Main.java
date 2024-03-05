package com.arrays;

public class Main {
    public static void main(String[] args) {
        // syntax
        // datatype[] variable_name = new datatype[size];
        // Store 5 roll number of students;
//        int[] array1 = new int[5];
        // or directly;
        int[] array2 = {12,23,34,53,24};
        int[] marks; // declaration of array. ros is getting defined in the stack;
        marks = new int[5]; // initialisation: actually here object is being created in the memory (heep);
        marks[0] = 123;
        marks[1] = 123;
        marks[2] = 123;
        marks[3] = 123;
        marks[4] = 123;
        System.out.println(marks[0]);
        System.out.println(array2[0]);
        String[] arr = new String[2];
        arr[0] = "ankit";
        arr[1] = "one";
        System.out.println(arr[0]);
    }
}
