package com.interview.questions;

/**
 *  * @author PARIVALLAL R
 */
public class Encapsulation {
    public static void main(String[] args) {
        EncapsulationDemo encapsulationDemo=new EncapsulationDemo();
        encapsulationDemo.setId(1);
        encapsulationDemo.setName("pari");


        System.out.println(encapsulationDemo.getId());
        System.out.println(encapsulationDemo.getName());
    }
}

class EncapsulationDemo{
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




}
