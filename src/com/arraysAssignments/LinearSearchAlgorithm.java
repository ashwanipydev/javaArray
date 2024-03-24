package com.arraysAssignments;

public class LinearSearchAlgorithm {
    public static void main(String[] args) {
//        Q: Find whether 14 exists in array or not?
        int[] arr = {14,32,12,4,124,33,55,104};
        for (int a:arr){
            if (a == 14){
                System.out.println("Yes it's");
                return;
            }
            System.out.println("Sorry not here!");
        }
    }
}
