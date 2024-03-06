package com.arrays;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
//        Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 100 ; i++) {
            list.add(i);
        }
        System.out.println(list);
    }
}
