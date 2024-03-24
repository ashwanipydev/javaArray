package com.arraysAssignments;

public class Dsa_bootcamp_Assignments {
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    public static void main(String[] arr){
        int[] nums = {1,2,3,4,5,0};
        int[] ans = buildArray(nums);
        for (int num : ans){
            System.out.println(num);
        }
    }
}
