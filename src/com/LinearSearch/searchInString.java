package com.LinearSearch;

import java.util.Arrays;

public class searchInString {
    public static void main(String[] args) {
        String name = "ankit";
        char target = 'k';
//        System.out.println(search(name,target));
//        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean searchOne(String str, char target){
        if(str.isEmpty()){
            return false;
        }
        for (char ch : str.toCharArray() ){
            if (ch == target){
                return true;
            }
        }
        return false;
    }
    static boolean search(String str , char target){
        if(str.isEmpty()){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
