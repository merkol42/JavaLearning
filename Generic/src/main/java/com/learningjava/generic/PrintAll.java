/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learningjava.generic;

/**
 *
 * @author merkol
 */
public class PrintAll{
//    public void print(E val[]) {
//        for (E i : val) {
//            System.out.println(i);
//        }
//    }
    public static <E> void print(E[] e)
    {
        for (E val : e)
            System.out.println(val);
    }
}
