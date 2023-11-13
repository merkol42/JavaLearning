/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learningjava.mavenproject1;

/**
 *
 * @author merkol
 */
public class Account {
    private String hesapNo;
    private String isim;
    private double bakiye;
    private String email;
    private String telefonNo;

    public Account() {
        this("Default","Default",0.0,"Default","Default");
//        this.hesapNo = "Default";
//        this.isim = "Default";
//        this.bakiye = 0.0;
//        this.email = "Default";
//        this.telefonNo = "Default";
    }
    
    public Account(String hesapNo, String isim, double bakiye, String email, String telefonNo) {
        this.hesapNo = hesapNo;
        this.isim = isim;
        this.bakiye = bakiye;
        this.email = email;
        this.telefonNo = telefonNo;
    }

   
    
    public void paraYatir(double miktar) {
        if (miktar != 0)
            bakiye += miktar;
        System.out.println("paraYatır Yeni Bakiye : " + bakiye);
    }
    
    public void paraCekme(double miktar) {
        if (miktar > bakiye) {
            System.out.println("Bakiye yetersiz!");
            return;
        }
        bakiye -= miktar;
        System.out.println("paraCekme yeni bakiye : " + bakiye);
    }
    
    /**
     * @return the hesapNo
     */
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefonNo
     */
    public String getTelefonNo() {
        return telefonNo;
    }

    /**
     * @param telefonNo the telefonNo to set
     */
    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
    
    
}
