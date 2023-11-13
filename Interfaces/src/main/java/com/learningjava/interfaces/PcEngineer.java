/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learningjava.interfaces;

/**
 *
 * @author merkol
 */
public class PcEngineer implements IEngineer{
    private boolean adli_sicil;
    private boolean askerlik;

    public PcEngineer(boolean adli_sicil, boolean askerlik) {
        this.adli_sicil = adli_sicil;
        this.askerlik = askerlik;
    }
    
    
    
    @Override
    public void askerlik_durum_sorgula() {
        if (askerlik)
            System.out.println("Askerlik yapıldı");
        else
            System.out.println("Askerlik yapılmadı");
    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {
        return "derece : " + derece;
    }

    @Override
    public void adli_sicil_sorgula() {
        if (adli_sicil)
            System.out.println("Adli sicil var");
        else
            System.out.println("Adli sicil yok");
    }

    @Override
    public void tecrube() {
        System.out.println("Tübitak");
    }
    
}
