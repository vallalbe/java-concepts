package com.interview.questions;

/**
 *@author PARIVALLAL R
 */
public class Quicksort {
    private static int[] numbers;
    private int number;

    public static void main(String[] args) {
        Quicksort qs=new Quicksort();
        int[] test =  {64, 34, 25, 12, 22, 11, 90};
        //int arr[] = {64, 34, 25, 12, 22, 11, 90};
        qs.sort(test);
        for(int i:test){
            System.out.print(i);
            System.out.print(" ");
        }
    }

    public int[] sort(int[] values) {
        // check for empty or null array
        if (values == null || values.length == 0) {
            return null;
        }
        this.numbers = values;
        number = values.length;
        quicksort(0, number - 1);
        return numbers;
    }

    private void quicksort(int low, int high) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = numbers[low + (high - low) / 2];

        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller than the pivot
            // element then get the next element from the left list
            while (numbers[i] < pivot) {
                i++;
            }
            // If the current value from the right list is larger than the pivot
            // element then get the next element from the right list
            while (numbers[j] > pivot) {
                j--;
            }

            // If we have found a value in the left list which is larger than
            // the pivot element and if we have found a value in the right list
            // which is smaller than the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    private void exchange(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
