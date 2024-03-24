package com.LinearSearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {12,43,543,65,34,54,10,19,43,55,33,90};
        int target = 99;
        int answer = linearSearch(nums,target);
        System.out.println(answer);
    }
    // Search in the array: return the index if item found
    // otherwise if item not fond return -1;
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        // Run a for loop
        for (int index = 0; index < arr.length; index++) {
            // Check for element at every index if it is == target
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        // this line will execute if none of the return statements above have executed hence the target not found;
        return -1;
    }

}
