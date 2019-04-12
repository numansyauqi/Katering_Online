/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_2;

/**
 *
 * @author asus
 */
public class MainArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // deklarasi Array
        // tipeData[] arrName = new tipeData[size];
        int[] arrInt = new int[5];
        // set element Array selalu dimulai dari 0
       arrInt[0] = 10;
       arrInt[1] = 9;
       arrInt[2] = 8;
       arrInt[3] = 7;
       arrInt[4] = 6;
       //menampilkan elemen array
       for(int i=0; i<arrInt.length; i++){
           System.out.println("elemen ke - " + (i+1)+ " = " + arrInt[i]);
       }
       
       //mengganti elemen ke-2
       arrInt[1] = 12;
       System.out.println("elemen ke-2 = " + arrInt[1]);
    }
    
}
