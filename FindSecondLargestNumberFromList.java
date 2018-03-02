package com.interview.questions;

import java.util.ArrayList;
import java.util.List;

public class FindSecondLargestNumberFromList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(15);
        list.add(16);
        list.add(11);

        System.out.println("list = " + list);

        int secondLargest = list.get(0);
        int largest = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > largest) {
                secondLargest = largest;
                largest = list.get(i);
            }
            /*if (list.get(i) > secondLargest && list.get(i) != largest) {
                secondLargest = list.get(i);
            }*/
        }
        System.out.print("Second biggest number "+secondLargest);
    }
}
