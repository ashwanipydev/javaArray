package com.LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {12,34,64,44,3,66,34,1,-1,44,65,7,3,55};
        int ans = findMin(arr);
        System.out.println(ans);
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int j : arr) {
            if (min > j) {
                min = j;
            }
        }
        return min;
    }
}
