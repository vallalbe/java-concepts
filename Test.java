package com.interview.questions;

/**
 * *@author PARIVALLAL R
 */
public class Test {
    public static void main(String[] args) {
        int n=3;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("x ");
            }

            System.out.println();
        }


    }
}
