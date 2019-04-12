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
public class MainAsosiasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MataKuliah mtk1 = new MataKuliah ("IFA-101", "Pengantar Teknik Informatika", 2, "A");
        MataKuliah mtk2 = new MataKuliah ("IFA-102", "Matematika", 3, "A");
        MataKuliah mtk3 = new MataKuliah ("IFA-103", "Algoritma Pemrograman", 3, "B");
        MataKuliah mtk4 = new MataKuliah ("IFA-201", "Basis Data", 4, "C");
        MataKuliah mtk5 = new MataKuliah ("IFA-202", "Pengantar Multimedia", 2, "C");
        MataKuliah mtk6 = new MataKuliah ("IFA-203", "Struktur Data", 3, "A");
        
        String[] lstMQMhs1 = {"IFA-101", "IFA-103", "IFA-202"};
        String[] lstMQMhs2 = {"IFA-101", "IFA-203", "IFA-202"};
        String[] lstMQMhs3 = {"IFA-101", "IFA-103", "IFA-201", "IFA-203"};
        
        Mahasiswa mhs1 = new Mahasiswa ("152018001", "Abdullah", 16);
        mhs1.setListkodeMK(lstMQMhs1);
         Mahasiswa mhs2 = new Mahasiswa ("152001701", "Budiman", 17);
        mhs1.setListkodeMK(lstMQMhs2);
         Mahasiswa mhs3 = new Mahasiswa ("152015002", "Clara", 18);
        mhs1.setListkodeMK(lstMQMhs3);
         Mahasiswa mhs4 = new Mahasiswa ("152001001", "Donny", 15);
        Mahasiswa[] lstMhs = {mhs1, mhs2, mhs3, mhs4};
        MataKuliah[] lstMtk = {mtk1, mtk2, mtk3, mtk4, mtk5, mtk6};
        
         for(Mahasiswa mhs:lstMhs){
             System.out.println(mhs);
             String[] myKodeMK = mhs.getListkodeMK();
             //System.out.println("Panjang : " + myKodeMK.length);
             System.out.println("Mata Kuliah yang diambil Mahasiswa :");
             if(myKodeMK.length>0){
              for(String KodeMK : myKodeMK){
                 for(MataKuliah mtk : lstMtk){
                  if(KodeMK.equalsIgnoreCase(mtk.getKodeMK())){
                  System.out.println(mtk);
                            
             }
             
                     }
                     
                 }
             }
        }
    }
    
}
