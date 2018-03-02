package com.interview.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * * @author PARIVALLAL R
 */
public class List1 {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList();
        list1.add(1);
        list1.add(5);
        list1.add(10);
        list1.add(80);
        list1.add(53);

        List<Integer> list2=new ArrayList();
        list2.add(2);
        list2.add(50);
        list2.add(6);

        list1.addAll(list2);
        //Collections.sort(list1);//sorting
        System.out.println(list1);
    }
}
