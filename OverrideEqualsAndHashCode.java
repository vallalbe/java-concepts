package com.interview.questions;

/**
 * * @author PARIVALLAL R
 */
public class OverrideEqualsAndHashCode {
    public static void main(String[] args) {
        User user1 = new User("mkyong", 35, "111222333");
        User user2 = new User("mkyong", 35, "111222333");
        System.out.println(user1.equals(user2)); // false
    }

}

class User {
    private String name;
    private int age;
    private String passport;

    public User(String name, int age, String passport) {
        this.name = name;
        this.age = age;
        this.passport = passport;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (!(obj instanceof User)) {
            return false;
        }

        return obj.hashCode() == this.hashCode();

    }

    @Override
    public int hashCode() {

        String hash = age + name + passport;
        System.out.println("hash = " + hash);
        return hash.hashCode();
    }
}