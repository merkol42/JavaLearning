/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectorandstack;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

/**
 *
 * @author merkol
 */
public class VectorAndStack {

    public static void main(String[] args) {
        
        Vector<String> vec = new Vector<>();
        ArrayList<String> arr_lst = new ArrayList<>();
        
        vec.add("C++");
        vec.add("java");
        vec.add("Python");
        vec.add("Php");
        vec.add("Go");
        
//        for (String s : vec) {
//            System.out.println(s);
//        }
        
//        ListIterator<String> it = vec.listIterator();
//        
//        while (it.hasNext())
//            System.out.println(it.next());
//        
        Enumeration<String> enu = vec.elements();
        
        while (enu.hasMoreElements())
            System.out.println(enu.nextElement());
        
    }
    
}
