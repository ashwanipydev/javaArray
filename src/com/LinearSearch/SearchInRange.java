package com.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
//        Q: Search for 3 in the range of index[1,4]
        int startIndex = 1;
        int endIndex = 4;
        int target = 24;
        int[] arr = {19,12,-7,3,13,24};
        int ans = searchInRange(arr, target ,startIndex, endIndex);
        System.out.println(ans);

    }

    static int searchInRange(int[] arr, int target, int startIndex, int endIndex) {
        if(arr.length == 0){
            return -1;
        }
        for (int i = startIndex; i < endIndex; i++) {
            int element = arr[i];
            if (element == target){
                return i;
            }
        }

        return  -1;
    }

}



