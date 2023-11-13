/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.learningjava.generic;

/**
 *
 * @author merkol
 */
public class Generic {

    public static void main(String[] args) {
        String str[] = {"mete",  "han", "erkol"};
        Integer ar[] = {42,1,3,5,6};
        
        PrintAll dnm = new PrintAll();
        System.out.println("Inner method::");
        printaa(str);
        printaa(ar);
        System.out.println("---------------------");
        System.out.println("Sınıf dışı static method");
        PrintAll.print(str);
        PrintAll.print(ar);
        System.out.println("----------------------");
    }
    
    public static <T> void printaa(T[] t){
        for(T temp : t)
            System.out.println(temp);
    }
}
