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
public class MainAgregasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs1 = new Mahasiswa("152001001", "Wahyu", "Bandung No.1", 16);
        Mahasiswa mhs2 = new Mahasiswa("152001002", "Cahya", "Bandung No.2", 16);
        Mahasiswa mhs3 = new Mahasiswa("152001003", "Rudi", "Bandung No.1", 17);
        Mahasiswa mhs4 = new Mahasiswa("152001004", "Budiman", "Bandung No.1", 16);
        Mahasiswa mhs5 = new Mahasiswa("152001005", "Welly", "Bandung No.1", 16);
        Mahasiswa mhs6 = new Mahasiswa("152001006", "Redeam", "Bandung No.2", 17);
    }
    Mahasiswa[] mhsBimb1 = {mhs1, mhs3, mhs6};
    Mahasiswa[] mhsBimb2 = {mhs2, mhs4, mhs5};
    
    Dosen dsn1 = new Dosen ("1519", "Budi", "Programming");
    dsn1.setlstBimibingan(mhsBimb1);
    Dosen dsn2 = new Dosen ("1520", "Mr. King", "Analisis dan Desain");
    dsn2.setlstBimibingan(mhsBimb2);
    
    Dosen[] lstDsn = {dsn1,dsn2};
    for(Dosen dsn : lstDsn){
    
}
}
