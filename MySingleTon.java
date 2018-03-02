package com.interview.questions;

/**
 * We can make constructor as private. So that We can not create an object outside of the class.
 * This property is useful to create singleton class in java.
 * Singleton pattern helps us to keep only one instance of a class at any time.
 * The purpose of singleton is to control object creation by keeping private constructor.
 *
 *
 * * @author PARIVALLAL R
 */
public class MySingleTon {
    private static MySingleTon myObj;

    /**
     * Create private constructor
     *
     */
    private MySingleTon (){

    }
    /**
     * Create a static method to get instance.
     */
    public static MySingleTon getInstance(){
        if(myObj == null){
            myObj = new MySingleTon();
        }
        return myObj;
    }
    public void print(String s){
        System.out.println("s = " + s);
    }

    public static void main(String[] args) {
        MySingleTon mySingleTon=MySingleTon.getInstance();
        mySingleTon.print("this is singletom class method");

    }
}


class SingletomTest{
    //MySingleTon mySingleTon=new MySingleTon(); //CE:Error:(40, 29) java: MySingleTon() has private access in com
    // .interview.questions.MySingleTon

}