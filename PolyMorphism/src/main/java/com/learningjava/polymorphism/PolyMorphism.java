/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.learningjava.polymorphism;

class Hayvan {
    private String name;
    
    public Hayvan() {
        this.name = "Default";
    }
    public Hayvan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void makeSound() {
        System.out.println("Hayvan makeSound()");
    }
}

class Kedy extends Hayvan {
    
    public Kedy(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Kedy makeSound()");
    }
}

class Dog extends Hayvan {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog mageSound()");
    }
    
}

public class PolyMorphism {
    public static void speaker(Object object) {
        if (object instanceof Dog) {
            Dog ins = (Dog)object;
            ins.makeSound();
        }
        else if (object instanceof Kedy) {
            Kedy ins = (Kedy)object;
            ins.makeSound();
        }
    }
    
    public static void main(String[] args) {
        Hayvan arr[] = new Hayvan[3];
        arr[0] = new Hayvan("default");
        arr[1] = new Kedy("Kedy");
        arr[2] = new Dog("Dog");
        
        for (Hayvan i : arr) {
            speaker(i);
        }
    }
}
