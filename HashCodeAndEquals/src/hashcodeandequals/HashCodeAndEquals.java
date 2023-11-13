/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashcodeandequals;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashCodeAndEquals {

    public static class MyClass {
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
    }
    
    
    public static void main(String[] args) {
        Set<MyClass> hashset = new HashSet<>();
        // myclass hashcode() ve equals() override etmek set içinde uniq olması için gerekli
        MyClass myclass1 = new MyClass("Mete", 0);
        MyClass myclass2 = new MyClass("Mete", 0);
        MyClass myclass3 = new MyClass("Mete", 0);
        MyClass myclass4 = new MyClass("Mete", 0);
        MyClass myclass5 = new MyClass("Mete", 0);
        
        hashset.add(myclass1);
        hashset.add(myclass2);
        hashset.add(myclass3);
        hashset.add(myclass4);
        hashset.add(myclass5);
        
        System.out.println(hashset);

    }
    
}
