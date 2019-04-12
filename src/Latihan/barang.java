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
public class barang {
 private String id_barang;
 private String nama_barang;
 private int jumlah;

    public barang() {
    }

    public barang(String id_barang, String nama_barang, int jumlah) {
        this.id_barang = id_barang;
        this.nama_barang = nama_barang;
        this.jumlah = jumlah;
    }

    public String getId_barang() {
        return id_barang;
    }

    public void setId_barang(String id_barang) {
        this.id_barang = id_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public String toString() {
        return "barang{" + "id_barang=" + id_barang + ", nama_barang=" + nama_barang + ", jumlah=" + jumlah + '}';
    }
 
 
}
