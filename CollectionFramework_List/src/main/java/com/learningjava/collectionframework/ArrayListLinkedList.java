/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.learningjava.collectionframework;

import java.util.*;

/**
 *
 * @author merkol
 */
public class ArrayListLinkedList {
    
    public void lst() {
        List<String> lst = new ArrayList<>();
        
        lst.add("Mete");
        lst.add("han");
        lst.add("C++");
        
        lst.remove("C++");
        for (String val : lst) {
            System.out.println(val);
        }
    }
    
    public static void main(String[] args) {
        LinkedList<Integer> linkedlst = new LinkedList<>();
        ArrayList<Integer> arraylst = new ArrayList<>();
        
        elapsedTime("LinkedList", linkedlst);
        elapsedTime("ArrayList", arraylst);
    }
    
    
    public static void elapsedTime(String value_type, List<Integer> lst) {
        long start;
        long end;
        
        
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
           lst.add(0, i);
        }
        
        end = System.currentTimeMillis();
        
        System.out.println(value_type + " ekleme süresi " + (end - start) + " ms");
    }
}
