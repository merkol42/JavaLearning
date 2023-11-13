/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learningjava.mavenproject1;

/**
 *
 * @author merkol
 */
public class Employee { // superclass || baseclass
    private String  name;
    private int     salary;
    private String  department;

    public Employee(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    
    public void dummy() {
        System.out.println("Hello from Employee Class");
    }
    
    public void printValues() {
        System.out.println("İsim: " + name);
        System.out.println("Departman: " + department);
        System.out.println("Maaş: " + salary);
    } 
    
    public void changeDepartment(String newDepartment) {
        this.department = newDepartment;
        System.out.println("Departman Değiştirildi!");
    }
}
