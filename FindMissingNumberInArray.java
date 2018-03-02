package com.interview.questions;

import java.util.Arrays;

/**
 * @author PARIVALLAL R
 */
public class FindMissingNumberInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5,6};
        int missingNumber = getMissingNumber(array, 6);
        System.out.printf("Missing Number in array %s is %d %n ", Arrays.toString(array), missingNumber);

    }

    private static int getMissingNumber(int[] array, int n) {
        int expectedsum = n * (n + 1) / 2;
        int actualsum = 0;

        for (int i : array) {
            actualsum = actualsum+i;

        }
        return expectedsum - actualsum;
    }
}
