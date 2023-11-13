/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learningjava.mavenproject1;

/**
 *
 * @author merkol
 */
public class Test {
    public static void main(String[] args) {
        Manager mng = new Manager("Metehan", 50000, "Embedded", 10);
        
        mng.printValues();
        
        Programmer pr = new Programmer("C/C++", "Metehan", 100000, "Software Development");
        
        pr.printValues();
    }
}
