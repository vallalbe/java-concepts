package com.interview.questions;

/**
 * Aggregation Example in Java
 * For example consider two classes Student class and Address class. Every student has an address so the relationship
 * between student and address is a Has-A relationship. But if you consider its vice versa then it would not make any
 * sense as an Address doesn’t need to have a Student necessarily. Lets write this example in a java program.
 * Student Has-A Address
 * <p>
 * The below example shows the Aggregation between Student and Address classes.
 * You can see that in Student class I have declared a property of type Address to obtain student address.
 * Its a typical example of Aggregation in Java.
 *
 *  * @author PARIVALLAL R
 */
public class Aggregation {
    public static void main(String[] args) {
        Address ad = new Address(55, "Agra", "UP", "India");
        StudentClass obj = new StudentClass(123, "Chaitanya", ad);
        System.out.println(obj.rollNum);
        System.out.println(obj.studentName);
        System.out.println(obj.studentAddr.streetNum);
        System.out.println(obj.studentAddr.city);
        System.out.println(obj.studentAddr.state);
        System.out.println(obj.studentAddr.country);
    }
}

class Address {
    int streetNum;
    String city;
    String state;
    String country;

    Address(int street, String c, String st, String coun) {
        this.streetNum = street;
        this.city = c;
        this.state = st;
        this.country = coun;
    }
}

class StudentClass {
    int rollNum;
    String studentName;
    //Creating HAS-A relationship with Address class
    Address studentAddr;

    StudentClass(int roll, String name, Address addr) {
        this.rollNum = roll;
        this.studentName = name;
        this.studentAddr = addr;
    }
    public static void main(String[] args) {
        Address ad = new Address(55, "Agra", "UP", "India");
        StudentClass obj = new StudentClass(123, "Chaitanya", ad);
        System.out.println(obj.rollNum);
        System.out.println(obj.studentName);
        System.out.println(obj.studentAddr.streetNum);
        System.out.println(obj.studentAddr.city);
        System.out.println(obj.studentAddr.state);
        System.out.println(obj.studentAddr.country);
    }

}

class College {
    String collegeName;
    //Creating HAS-A relationship with Address class
    Address collegeAddr;

    College(String name, Address addr) {
        this.collegeName = name;
        this.collegeAddr = addr;
    }
    public static void main(String[] args) {
        Address ad = new Address(55, "Agra", "UP", "India");
        College obj = new College("sct",  ad);
        System.out.println(obj.collegeName);
        System.out.println(obj.collegeAddr.streetNum);
        System.out.println(obj.collegeAddr.city);
        System.out.println(obj.collegeAddr.state);
        System.out.println(obj.collegeAddr.country);
    }
}

class Staff {
    String employeeName;
    //Creating HAS-A relationship with Address class
    Address employeeAddr;

    Staff(String name, Address addr) {
        this.employeeName = name;
        this.employeeAddr = addr;
    }
    public static void main(String[] args) {
        Address ad = new Address(55, "Agra", "UP", "India");
        Staff obj = new Staff("parivallal R",  ad);
        System.out.println(obj.employeeName);
        System.out.println(obj.employeeAddr.streetNum);
        System.out.println(obj.employeeAddr.city);
        System.out.println(obj.employeeAddr.state);
        System.out.println(obj.employeeAddr.country);
    }
}