/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author asus
 */
public class pelanggan {
 private String tgl_daftar;
 private int no_id;
 private String nama;
 private String alamat;
 private int telepon;

    public pelanggan() {
    }

    public pelanggan(String tgl_daftar, int no_id, String nama, String alamat, int telepon) {
        this.tgl_daftar = tgl_daftar;
        this.no_id = no_id;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public String getTgl_daftar() {
        return tgl_daftar;
    }

    public void setTgl_daftar(String tgl_daftar) {
        this.tgl_daftar = tgl_daftar;
    }

    public int getNo_id() {
        return no_id;
    }

    public void setNo_id(int no_id) {
        this.no_id = no_id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getTelepon() {
        return telepon;
    }

    public void setTelepon(int telepon) {
        this.telepon = telepon;
    }

    @Override
    public String toString() {
        return "pelanggan{" + "tgl_daftar=" + tgl_daftar + ", no_id=" + no_id + ", nama=" + nama + ", alamat=" + alamat + ", telepon=" + telepon + '}';
    }
    
    
 
 
}
