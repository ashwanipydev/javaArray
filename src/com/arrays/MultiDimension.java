package com.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimension {
    public static void main(String[] args) {
        /*
        * 1 2 3
        * 4 5 6
        * 7 8 9
        * */
        // syntax datatype[][] array_name = new datatype[row.length][col.length] // here is not mandatory to specify
        // a column length, but it is mandatory to specify row length.

//        int[][] arr = new int[3][3];

        int[][] arr = {
                {1,2,3},
                {4,5},
                {7,8,9,6}
        };



        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
    }
}
