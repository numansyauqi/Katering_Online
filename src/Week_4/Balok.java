/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_4;

import Week_3.*;

/**
 *
 * @author asus
 */
public class Balok extends Bangun{
    private int panjang;
    private int lebar;
    private int tinggi;

    public Balok(String nama) {
        super(nama);
    }

    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
     public int hitungVolume(){
    return this.panjang * this.lebar * this.tinggi;
    }
    
    public int luasPermukaan(){
        return 2*(this.panjang*this.lebar + this.lebar*this.tinggi + 
                this.panjang*this.tinggi);
    }

    @Override
    public String toString() {
        return super.toString() + "panjang=" + panjang + ", lebar=" + lebar + ", tinggi=" 
                + tinggi + "Volume = " + this.hitungVolume() + "luas permukaan = " 
                +this.luasPermukaan() + '}';
    }
    
}
