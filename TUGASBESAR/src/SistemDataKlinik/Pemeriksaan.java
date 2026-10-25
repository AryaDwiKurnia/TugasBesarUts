/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemDataKlinik;

/**
 *
 * @author admin
 */
public class Pemeriksaan {

    /**
     * @param args the command line arguments
     */
    private String noPemeriksaan;
    private String namaPasien;
    private String namaDokter;
    private double biayaPemeriksaan;
    
    public Pemeriksaan(String noPemeriksaan, String namaPasien, String namaDokter, double biayaPemeriksaan) {
        this.noPemeriksaan = noPemeriksaan;
        this.namaPasien = namaPasien;
        this.namaDokter = namaDokter;
        this.biayaPemeriksaan = biayaPemeriksaan;
    }
    
    public void tampilData() {
        System.out.println("No. Pemeriksaan : " + this.noPemeriksaan);
        System.out.println("Nama Pasien     : " + this.namaPasien);
        System.out.println("Nama Dokter     : " + this.namaDokter);
        System.out.println("Biaya           : Rp " + (long) this.biayaPemeriksaan);
        System.out.println("----------------------------------------");
    }
    
    public double hitungTotal() {
        return this.biayaPemeriksaan;
    }
    
    public String getNoPemeriksaan() {
        return noPemeriksaan;
    }

    public void setNoPemeriksaan(String noPemeriksaan) {
        this.noPemeriksaan = noPemeriksaan;
    }

    public String getNamaPasien() {
        return namaPasien;
    }

    public void setNamaPasien(String namaPasien) {
        this.namaPasien = namaPasien;
    }

    public String getNamaDokter() {
        return namaDokter;
    }

    public void setNamaDokter(String namaDokter) {
        this.namaDokter = namaDokter;
    }

    public double getBiayaPemeriksaan() {
        return biayaPemeriksaan;
    }

    public void setBiayaPemeriksaan(double biayaPemeriksaan) {
        this.biayaPemeriksaan = biayaPemeriksaan;
    }
}
