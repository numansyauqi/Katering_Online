/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_2;

import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class MainArrayBalok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int size;
        size = Integer.parseInt(JOptionPane.showInputDialog("masukkan jumlah balok"));
        
        ClassBalok[] arrBlk = new ClassBalok[size];
        for(int i=0; i<size; i++){
            arrBlk[i] = setElementClassBalok();
        }
        for(ClassBalok blk: arrBlk){
            System.out.println(blk.toString());
            System.out.println("Dengan Volume = " + blk.volume());
        }
    }
    private static ClassBalok setElementClassBalok(){
        ClassBalok blk = new ClassBalok();
        double panjang, lebar, tinggi;
        
        panjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang Balok"));
        lebar = Double.parseDouble(JOptionPane.showInputDialog("Masukkan lebar Balok"));
        tinggi = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi Balok"));
        
        blk.setPanjang(panjang);
        blk.setLebar(lebar);
        blk.setTinggi(tinggi);
        return blk;
    }
    
}
