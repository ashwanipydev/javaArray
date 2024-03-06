package com.arraysAssignments;

import java.util.Scanner;

public class HomeWork {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //WAP to read 5 element and print table of each numbers
        int[] arr = new int[5];
        System.out.print("Enter 5 number: ");
//        table(arr);
//        fact(arr);
//        isEvenOrOdd(arr);
//
        System.out.println("Maximum number in array is: "+ maxElement(arr));
    }

    static int maxElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    static void isEvenOrOdd(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int sumOfEvenNumber = 0;
        int sumOfOddNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                System.out.println(arr[i] + " is Even number");
                sumOfEvenNumber += arr[i];
            }else {
                System.out.println(arr[i] + " is Odd number");
                sumOfOddNumber += arr[i];
            }
        }
        System.out.println("Sum of all even number: "+ sumOfEvenNumber);
        System.out.println("Sum of all odd number: "+ sumOfOddNumber);
    }

    static void fact(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int f = 1;
            for (int j = 1; j <= arr[i]; j++) {
                f *= j;
                System.out.println(f);
            }
            System.out.println();
        }

    }

    static void table(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((arr[i] * j)+" ");
            }
            System.out.println();
        }
    }
}
