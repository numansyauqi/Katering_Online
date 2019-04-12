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
public class Mahasiswa extends Profile{
    private String nrp;
    private String Jurusan;

    public Mahasiswa() {
    }

    public Mahasiswa(String nrp, String Jurusan, String nama, String alamat, int umur, String email) {
        super(nama, alamat, umur, email);
        this.nrp = nrp;
        this.Jurusan = Jurusan;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getJurusan() {
        return Jurusan;
    }

    public void setJurusan(String Jurusan) {
        this.Jurusan = Jurusan;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + super.toString() + "nrp=" + nrp + ", Jurusan=" + Jurusan + '}';
    }
    
    
}
