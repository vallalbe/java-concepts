package com.interview.questions;

/**
 * Composition is a restricted form of Aggregation in which two entities (or you can say classes) are highly dependent on each other.
 * For e.g. Human and Heart.
 * A human needs heart to live and a heart needs a Human body to survive. In other words when the classes (entities) are dependent on each other and their life span are same (if one dies then another one too) then its a composition. Heart class has no sense if Human class is not present.
 *
 * Java composition is achieved by using instance variables that refers to other objects.
 * For example, a Person has a Job. Let’s see this with a java composition example code.
 */
public class Composition {
    public static void main(String[] args) {
        Job job=new Job();
        job.setId(1);
        job.setRole("se");
        job.setSalary(10000);
        Person1 person1=new Person1();
        System.out.println(person1.getSalary());

        person1.getSalary();
    }
}

class Job {
    private String role;
    private long salary;
    private int id;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

class Person1 {

    //composition has-a relationship
    private Job job;

    public Person1() {
        this.job = new Job();
        job.setSalary(1000L);
    }

    public long getSalary() {
        return job.getSalary();
    }
}