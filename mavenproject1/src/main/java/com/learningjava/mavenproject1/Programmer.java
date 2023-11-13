/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learningjava.mavenproject1;

/**
 *
 * @author merkol
 */
public class Programmer extends Employee {
    private String knowledgeString;

    public Programmer(String knowledgeString, String name, int salary, String department) {
        super(name, salary, department);
        this.knowledgeString = knowledgeString;
    }
    
    @Override
    public void printValues() {
        super.printValues();
        System.out.println("Bilinen dil: " + knowledgeString);
    }
}
