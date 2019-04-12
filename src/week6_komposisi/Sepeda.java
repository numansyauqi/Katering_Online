/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6_komposisi;

import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class Sepeda {
  private Roda roda;
  private Pedal pedal;
  private Stang stang;
  private String merk;
  private int harga;

    public Sepeda(Roda roda, Pedal pedal, Stang stang, String merk, int harga) {
        this.roda = roda;
        this.pedal = pedal;
        this.stang = stang;
        this.merk = merk;
        this.harga = harga;
    }
    
     public Sepeda(Pedal pedal, Stang stang, String merk, int harga) {
        this.roda = roda;
        this.pedal = pedal;
        this.stang = stang;
        this.merk = merk;
        this.harga = harga;
    }

    public Sepeda(Roda roda, Pedal pedal, Stang stang) {
        this.roda = roda;
        this.pedal = pedal;
        this.stang = stang;
    }
    private Roda createRoda(){
        String tipe, velg;
        int dimensi;
        tipe = JOptionPane.showInputDialog("Masukkan tipe Roda Sepeda : ");
        velg = JOptionPane.showInputDialog("Masukkan velg Roda Sepeda : ");
        dimensi = Integer.parseInt(JOptionPane.showInputDialog("Masukkan dimensi Roda Sepeda"));
        
        return new Roda(tipe, dimensi, velg);
    }

    @Override
    public String toString() {
        return "Sepeda{" + "merk=" + merk + ", harga=" + harga + '}';
    }

    void setMerk(String polygon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setHarga(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getRoda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
  
}
