package com.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
//        Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5 ; i++) {
            list.add(in.nextInt());
        }
//        list.set(2,90);
//        list.remove(2);
//        System.out.println(list.contains(14));
//        System.out.println(list);
        // get item at my index;
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here.
        }
        System.out.println(list);
    }
}
