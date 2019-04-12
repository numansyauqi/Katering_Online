/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6_agregasi;

/**
 *
 * @author asus
 */
public class Dosen {
   private Mahasiswa[] lstBimbingan; //ciri Agregasi
   private String nrp;
   private String nama;
   private String keahlian;
   
   //tidak menciptakan objek lain, saat membuat objek dosen

    public Dosen() {
    }

    public Dosen(String nrp, String nama, String keahlian) {
        this.nrp = nrp;
        this.nama = nama;
        this.keahlian = keahlian;
    }

    public Mahasiswa[] getLstBimbingan() {
        return lstBimbingan;
    }

    public void setLstBimbingan(Mahasiswa[] lstBimbingan) {
        this.lstBimbingan = lstBimbingan;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKeahlian() {
        return keahlian;
    }

    public void setKeahlian(String keahlian) {
        this.keahlian = keahlian;
    }

    @Override
    public String toString() {
        return "Dosen{" + "nrp=" + nrp + ", nama=" + nama + ", keahlian=" + keahlian + '}';
    }
   
   
}
