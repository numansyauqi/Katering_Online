/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_3;

import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class MainProfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mhs = setDataMhs();
        Dosen dsn = setDataDsn();
        
         Profile[] myProf = {mhs, dsn};
        for(Profile prof : myProf){
            System.out.println(prof.toString());
        }
    }
    
    private static Mahasiswa setDataMhs(){
        Mahasiswa mhs = new Mahasiswa();
        String nrp, nama, alamat, jurusan, email, keahlian;
        int umur;
        
        nrp = JOptionPane.showInputDialog("Masukkan NRP Mahasiswa");
        nama = JOptionPane.showInputDialog("Masukkan Nama Mahasiswa");
        alamat = JOptionPane.showInputDialog("Masukkan Alamat Mahasiswa");
        jurusan = JOptionPane.showInputDialog("Masukkan Jurusan Mahasiswa");
        email = JOptionPane.showInputDialog("Masukkan Email Mahasiswa");
        umur = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Umur Mahasiswa"));
        
        mhs.setNrp(nrp);
        mhs.setNama(nama);
        mhs.setAlamat(alamat);
        mhs.setJurusan(jurusan);
        mhs.setEmail(email);
        mhs.setUmur(umur);
        
        return mhs;
    }
    
    private static Dosen setDataDsn(){
        String nrp, nama, alamat, email, keahlian;
        int umur;
        nrp = JOptionPane.showInputDialog("Masukkan NRP Dosen");
        nama = JOptionPane.showInputDialog("Masukkan Nama Dosen");
        alamat = JOptionPane.showInputDialog("Masukkan Alamat Dosen");
        email = JOptionPane.showInputDialog("Masukkan Email Dosen");
        keahlian = JOptionPane.showInputDialog("Masukkan Keahlian Dosen");
        umur = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Alamat Dosen"));
     
        return new Dosen(nrp, keahlian, nama, alamat, umur, email);
    }
}
