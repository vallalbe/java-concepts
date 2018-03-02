package com.interview.questions;

/**
 * Abstract class in java is similar to interface except that it can contain default method implementation.
 * An abstract class can have abstract method without body and it can have methods with implementation also.

 abstract keyword is used to create a abstract class and method.
 Abstract class in java can’t be instantiated.
 Abstract class is mostly used to provide base for subclasses to extend and implement the abstract methods and override or use the implemented methods in abstract class.
 */
public class Abstraction {
    /*
    -Person is a Abstract class
    -Employee class extending  person class
        - Overriding/implementing work() method

     */


}
//abstract class
 abstract class Person {

    private String name;
    private String gender;

    public Person(String nm, String gen){
        this.name=nm;
        this.gender=gen;
    }

    //abstract method
     abstract void work();

    @Override
    public String toString(){
        return "Name="+this.name+"::Gender="+this.gender;
    }

    public void changeName(String newName) {
        this.name = newName;
    }
}

 class Employee extends Person {

    private int empId;

    public Employee(String nm, String gen, int id) {
        super(nm, gen);
        this.empId=id;
    }

    public void work() {
        if(empId == 0){
            System.out.println("Not working ");
        }else{
            System.out.println("Working as employee!!");
        }
    }

    public static void main(String args[]){
        //coding in terms of abstract classes
        Person student = new Employee("Dove","Female",0);
        Person employee = new Employee("Pankaj","Male",123);
        student.work();
        employee.work();
        //using method implemented in abstract class - inheritance
        employee.changeName("Pankaj Kumar");
        System.out.println(employee.toString());
    }
}

/**
 * Interface:
 * An interface in java is a blueprint of a class. It has static constants and abstract methods.
 *
 *
 *
 * @author PARIVALLAL
 */

interface Printable{
    void print();
}
interface Showable{
    public static final int member=2;
    public abstract void show();
}


class InterfaceTest1 implements Printable,Showable{

    @Override
    public void print() {
        System.out.println("Print");
    }

    @Override
    public void show() {
        System.out.println("show");

    }

    public static void main(String[] args) {
        InterfaceTest1 interfaceTest1=new InterfaceTest1();
        interfaceTest1.print();
        interfaceTest1.show();
    }
}
