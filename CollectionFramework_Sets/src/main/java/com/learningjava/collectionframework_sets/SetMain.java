/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learningjava.collectionframework_sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author merkol
 */
public class SetMain {
    
    public static void diffAndCommon() {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        
        set1.add("Java");
        set1.add("C++");
        set1.add("Python");
        set1.add("Rust");
        
        set2.add("Java");
        set2.add("Python");
        
        // set1 set2 ye farkı
        System.out.println("***********DiffValue***********");
        Set<String> diff = new HashSet<>(set1);
        
        System.out.println(diff.removeAll(set2));
        System.out.println(diff);
        
        Set<String> common = new HashSet<>(set1);
        
        // set1 set2 ortakları
        System.out.println("***********CommonValue***********");

        System.out.println(common.retainAll(set2)); // retainAll(&ref) kesişim ortak
        System.out.println(common);
    }
    
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(); // O(1) insert remove search hashing method 
        Set<String> set2 = new LinkedHashSet<>(); // O(1) insert remove search 
        Set<String> set3 = new TreeSet<>(); // O(log(n)) insert remove search ?rbtree?
        
        // HashSet
        set1.add("C++");
        set1.add("Java");
        set1.add("TypeScript");
        
        // LinkedHashSet
        set2.add("C++");
        set2.add("TypeScript");
        set2.add("Java");
        
        // TreeSet
        set3.add("Java");
        set3.add("TypeScript");
        set3.add("C++");
        
        System.out.println("***********HashSet***********");
        for (String val : set1) {
            System.out.println(val);
        }
        System.out.println("***********LinkedHashSet***********");
        for (String val : set2) {
            System.out.println(val);
        }
        System.out.println("***********TreeSet***********");
        for (String val : set3) {
            System.out.println(val);
        }
        
        
        // Contains
        System.out.println(set1.contains("C++")); //boolean
        
        // Remove
        System.out.println(set2.remove("Java")); // boolean

        System.out.println("***********DiffCalc***********");
        diffAndCommon();
    }
}
