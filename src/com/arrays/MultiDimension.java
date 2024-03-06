package com.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
        * 1 2 3
        * 4 5 6
        * 7 8 9
        * */
        // syntax datatype[][] array_name = new datatype[row.length][col.length] // here is not mandatory to specify
        // a column length, but it is mandatory to specify row length.

        int[][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a array 3X3: ");
//        int[][] arr = {
//                {1},
//                {2,3,},
//                {4,5,6}
//        };



//        System.out.println(Arrays.toString(arr[0]));
//        System.out.println(Arrays.toString(arr[1]));
//        System.out.println(Arrays.toString(arr[2]));
//        System.out.println(arr[1][0]);
//        input
        for(int row = 0; row < arr.length; row++){
            //now we take col
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
            System.out.println();
        }
        for(int[] e : arr){
            System.out.println(Arrays.toString(e));
        }
    }
}
