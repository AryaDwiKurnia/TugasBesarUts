/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemDataKlinik;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Pemeriksaan> daftarPemeriksaan = new ArrayList<>();
        
        Pemeriksaan p1 = new Pemeriksaan("P001", "Arya Dwi Kurnia", "dr. Tirta", 350000);
        Pemeriksaan p2 = new Pemeriksaan("P002", "Afdhal Syulthony", "dr. Rendi", 500000);
        Pemeriksaan p3 = new Pemeriksaan("P003", "Immanuel Laba Witak", "dr. Tirta", 375000);
        
        daftarPemeriksaan.add(p1);
        daftarPemeriksaan.add(p2);
        daftarPemeriksaan.add(p3);
        
        System.out.println("DATA PEMERIKSAAN KLINIK SEHAT");
        System.out.println("=============================");
        System.out.println("");
        
        double totalBiayaKeseluruhan = 0;
        
        for (Pemeriksaan p : daftarPemeriksaan) {
            p.tampilData();
            totalBiayaKeseluruhan += p.hitungTotal();
        }
        System.out.println("TOTAL BIAYA KESELURAHAN : Rp " + (long) totalBiayaKeseluruhan);
    }
    
}
