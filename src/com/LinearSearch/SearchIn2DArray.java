package com.LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,3,4,3},
                {23,3,44,32,34},
                {78,99,34,56},
                {18,12}
        };
        int target = 56;
//        int[] ans = search(arr,target);
        int ans = searchMax(arr);
        System.out.println(ans);
//        System.out.println(Arrays.toString(ans));
    }

    static int searchMax(int[][] arr){
        if (arr.length == 0){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        for (int[] nums : arr) {
            for (int element : nums) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
    static int[] search(int[][] arr, int target){
        if (arr.length == 0){
            return new int[]{-1,-1};
        }
        for (int row = 0; row < arr.length; row++)
            for (int col = 0; col < arr[row].length; col++) {
                int element = arr[row][col];
                if (element == target) {
                    return new int[]{row, col};
                }
            }
        return new int[]{-1,-1};
    }
}
