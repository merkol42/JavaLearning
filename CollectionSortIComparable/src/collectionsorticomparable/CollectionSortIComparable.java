/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collectionsorticomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author merkol
 */
public class CollectionSortIComparable {

    public static class MyClass implements Comparable<MyClass> {
        
        int id;
        String name;

        public MyClass(String name, int id) {
            this.id = id;
            this.name = name;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 53 * hash + this.id;
            hash = 53 * hash + Objects.hashCode(this.name);
            System.out.println(hash);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final MyClass other = (MyClass) obj;
            if (this.id != other.id) {
                return false;
            }
            return Objects.equals(this.name, other.name);
        }

        @Override
        public String toString() {
            return "MyClass{" + "id=" + id + ", name=" + name + '}';
        }
        
        @Override
        public int compareTo(MyClass o) {
            return this.id - o.id;
        }
    }
    
    public static void sortList() {
        List<String> lst = new ArrayList<>();
        
        lst.add("C++");
        lst.add("Java");
        lst.add("Python");
        lst.add("Rust");
        lst.add("Go");
        
        Collections.sort(lst);
        Collections.sort(lst, new CompareClass());
        
        for (String s : lst) {
            System.out.println(s);
        }

    }
    
    public static void sortMyClass() {
        List<MyClass> lst = new ArrayList<>();
        
        lst.add(new MyClass("Mete", 5));
        lst.add(new MyClass("Apoli", 1));
        lst.add(new MyClass("Oğuz", 2));
        lst.add(new MyClass("Han", 3));
        
        Collections.sort(lst);
        
        for (MyClass s : lst) {
            System.out.println(s);
        }

    }
    
    public static void main(String[] args) {
       sortList();
//       sortMyClass();
    }
    
}
