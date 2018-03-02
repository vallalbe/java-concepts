package com.interview.questions;

/**
 * * @author PARIVALLAL R
 */
public class MethodOverrRiding {

    public static void main(String[] args) {
        Company c = new Company();// Company reference and object
        Company cebay = new eBay();// Company reference but eBay object

        c.address();// runs the method in Company class
        cebay.address();// Runs the method in eBay class
    }

}

class Company {
    public void address() {
        System.out.println("This is address of Base Company...");
    }
}

class eBay extends Company {
    public void address() {
        super.address(); // invokes the super class method
        System.out.println("This is address of eBay...");
    }
}