/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialization;

import java.io.Serializable;

/**
 *
 * @author merkol
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 1;
    private String  name;
    private String  depart;
    int             id;

    public Student(String name, String depart, int id) {
        this.name = name;
        this.depart = depart;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", depart=" + depart + ", id=" + id + '}';
    }

    
    
}
