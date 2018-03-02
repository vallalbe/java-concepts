package com.interview.questions;

/**
 * Prime number is a number that is greater than 1 and divided by 1 or itself.
 * In other words, prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
 *
 * Note: 0 and 1 are not prime numbers.
 * The 2 is the only even prime number because all the other even numbers can be divided by 2.
 *
 *
 * * @author PARIVALLAL R
 */
public class Prime {
    public static void main(String[] args) {
        System.out.println(" Prime numbers manipulations..");

        Prime p = new Prime();
        for (int i = 1; i <= 10; i++)
            p.isPrime(i);
    }

    public boolean isPrime(int number) {
        boolean isPrimeFlag = true;
        int m = number / 2;

        if (number == 0 || number == 1) {
            // System.out.println(number + " is not prime number");
            isPrimeFlag = false;
        } else {

            for (int i = 2; i <= m; i++) {
                if (number % i == 0) {
                    //System.out.println(number + " is not prime number.");
                    isPrimeFlag = false;
                    break;
                }
            }
        }
        if (isPrimeFlag) {
            System.out.println(number + " is prime number");
        }
        return isPrimeFlag;
    }
}
