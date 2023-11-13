/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.learningjava.arrayinjava;

import java.util.Arrays;

/**
 *
 * @author merkol
 */
public class ArrayInJava {

    public static void fillArr(int arr[], int multiplier) {
        int size = arr.length;
        for (int i = 0; i < size; i++)
            arr[i] = (i + 1) * multiplier;
    }
    
    public static void printArr(int arr[]) {
        for (int i : arr)
            System.out.println(i);
    }
    
    public static void swapArr(int a1[], int b1[]) {
        int tmp[] = new int[a1.length];
        System.arraycopy(a1, 0, tmp, 0, a1.length);
        System.arraycopy(b1, 0, a1, 0, b1.length);
        System.arraycopy(tmp, 0, b1, 0, tmp.length);
    }
    
    public static void main(String[] args) {
        System.out.println("Array In Java!");
        int a[] = new int[3];
        int b[] = new int[3];
        fillArr(a, 1);
        fillArr(b, 2);
        printArr(a);
        printArr(b);
        swapArr(a, b);
        printArr(a);
        printArr(b);
        if (a == b)
            System.out.println("equal");
        else
            System.out.println("not equal");
        if (Arrays.equals(a, b))
            System.out.println("equal");
        else
            System.out.println("not equal");


        
    }
}
