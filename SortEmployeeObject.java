package com.interview.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * *@author PARIVALLAL R
 */
public class SortEmployeeObject {
    public static void main(String args[]) {
        System.out.println("SortEmployeeObject - Java!");

        List<Employee1> empList = new ArrayList();
        for (int i = 10; i > 0; i--) {
            Employee1 e = new Employee1(i, "Name-" + i);
            empList.add(e);
        }

        List<Employee1> iList = getByIdOrder(empList);
        for (Employee1 i : iList) {
            System.out.println("Employee1 - " + i.getEmpId() + ". " + i.getEmpName());
        }
        List<Employee1> nList = getByNameOrder(empList);
        for (Employee1 e : nList) {
            System.out.println("Employee1 - " + e.getEmpId() + ". " + e.getEmpName());
        }

    }

    public static List<Employee1> getByIdOrder(List<Employee1> emps) {

        Collections.sort(emps, new EmployeeSortById());
        return emps;
    }

    public static List<Employee1> getByNameOrder(List<Employee1> emps) {


        return new ArrayList<>(emps);
        }
    }

    class Employee1 {

        private int empId;
        private String empName;

        public Employee1(int id, String name) {
            this.empId = id;
            this.empName = name;
        }

        public String getEmpName() {
            return empName;
        }

        public void setEmpName(String name) {
            this.empName = name;
        }

        public int getEmpId() {
            return empId;
        }

        public void setEmpId(int id) {
            this.empId = id;
        }
    }

    class EmployeeSortById implements Comparator<Employee1> {
        public int compare(Employee1 emp1, Employee1 emp2) {
            int value = 0;
            if (emp1.getEmpId() > emp2.getEmpId())
                value = 1;
            else if (emp1.getEmpId() < emp2.getEmpId())
                value = -1;
            else if (emp1.getEmpId() == emp2.getEmpId())
                value = 0;

            return value;
        }
    }

/*class EmployeeSortByName implements Comparator  {
    public int compare(Employee emp1, Employee emp2) {

        return emp1.getEmpName().compareTo(emp2.getEmpName());
    }
}*/


