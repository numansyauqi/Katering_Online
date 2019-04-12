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
public class MataKuliah {
   private String kodeMK; 
   private String namaMK;
   private int sks;
   private String grade;

    public MataKuliah() {
    }

    public MataKuliah(String kodeMK, String namaMK, int sks, String grade) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        this.grade = grade;
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public void setKodeMK(String kodeMK) {
        this.kodeMK = kodeMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public void setNamaMK(String namaMK) {
        this.namaMK = namaMK;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "MataKuliah{" + "kodeMK=" + kodeMK + ", namaMK=" + namaMK + ", sks=" + sks + ", grade=" + grade + '}';
    }
   
   
}
