/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_3;

/**
 *
 * @author asus
 */
public class Kubus extends Bangun{
   private int sisi;

    public Kubus(int sisi, String nama) {
        super(nama);
        this.sisi = sisi;
    }

    public Kubus(String nama) {
        super(nama);
    }
    

    public Kubus(int sisi) {
        super("Kubus");
        this.sisi = sisi;
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
    
    public int hitungVolume(){
    return this.sisi * this.sisi * this.sisi;
    }
    
    public int luasPermukaan(){
        return 6*(this.sisi*this.sisi);
    }

    @Override
    public String toString() {
        return super.toString() + "sisi=" + sisi + "Volume = " + this.hitungVolume()
                + "luas Permukaan = " + this.luasPermukaan() + '}';
    }
    
   
   
}
