/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6_asosiasi;

/**
 *
 * @author asus
 */
public class Mahasiswa {
    private String nrp;
    private String nama;
    private int umur;
    private String[] listkodeMK = new String[0]; //menyimpan kode-kode MK yang diambil Mahasiswa

    public Mahasiswa() {
    }

    public Mahasiswa(String nrp, String nama, int umur) {
        this.nrp = nrp;
        this.nama = nama;
        this.umur = umur;
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

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String[] getListkodeMK() {
        return listkodeMK;
    }

    public void setListkodeMK(String[] listkodeMK) {
        this.listkodeMK = listkodeMK;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nrp=" + nrp + ", nama=" + nama + ", umur=" + umur + '}';
    }
    
    
}
