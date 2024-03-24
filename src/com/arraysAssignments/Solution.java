package com.arraysAssignments;

import java.util.Arrays;

public class Solution {
    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        for(int i = 1; i < ans.length; i++){
            ans[i] = ans[i-1]+nums[i];
        }
        return ans;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        int[] ans = runningSum(arr);
        System.out.println(Arrays.toString(ans));
    }
}
