/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pqueue;

/**
 *
 * @author merkol
 */
public class Patient implements Comparable<Patient>{
    private String name;
    private String hastalık;
    private int emergencyRate;

    public Patient(String name, String hastalık, int emergencyRate) {
        this.name = name;
        this.hastalık = hastalık;
        this.emergencyRate = emergencyRate;
    }

    @Override
    public int compareTo(Patient o) {
        return this.emergencyRate - o.emergencyRate;
    }

    @Override
    public String toString() {
        return "name=" + name + ", hastal\u0131k=" + hastalık + ", emergencyRate=" + emergencyRate;
    }
    
    
    
}
