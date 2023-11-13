/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learningjava.mavenproject1;

/**
 *
 * @author merkol
 */
public class Manager extends Employee {
    private int exp;
    
    public Manager(String name, int salary, String department, int exprience) {
        super(name, salary, department);
        this.exp = exprience;
    }
    
    @Override
    public void printValues() {
        super.printValues();
        System.out.println("Deneyim: " + exp);
    }
    
    
}
