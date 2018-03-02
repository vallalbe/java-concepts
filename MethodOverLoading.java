package com.interview.questions;

/**
 * methods can have same name but with different parameters list
 * (i.e. number of the parameters, order of the parameters, and data types of the parameters)
 * within the same class.
 * * @author PARIVALLAL R
 */
public class MethodOverLoading {
    // adding two integer values.
    public int add(int a, int b){

        int sum = a+b;
        return sum;
    }

    // adding three integer values.
    public int add(int a, int b, int c){

        int sum = a+b+c;
        return sum;
    }
    public String m1(String s) { return s; }

    // data types of the parameter is different
    public String m1(int i) { return null; }

    //number of the parameters is different
    public String m1(int i, int j) { return null; }

    public String m1(int i, String s) { return null; }

    //order of the parameters changed
    public String m1(String s, int i) { return null; }

}
