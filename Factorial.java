package com.interview.questions;

/**
 * Factorial of n is the product of all positive descending integers.
 * Factorial of n is denoted by n!.
 *
 *  * @author PARIVALLAL R
 */
public class Factorial {
    public static void main(String[] args) {
            printFactorial(5);
    }


    public static void printFactorial(int n){
        int fact=1;
        for (int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("fact of "+n+" is= " + fact);
    }
}
