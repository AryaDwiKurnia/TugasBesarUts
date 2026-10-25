/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiketBioskop;

/**
 *
 * @author admin
 */
public class Tiket {

    /**
     * @param args the command line arguments
     */
    private String kodeTiket;
    private String namaFilm;
    private String jenisTiket;
    private double hargaTiket;
    private int jumlahTiket;

    public Tiket(String kodeTiket,String namaFilm,String jenisTiket,double hargaTiket,int jumlahTiket) {
        this.kodeTiket = kodeTiket;
        this.namaFilm = namaFilm;
        this.jenisTiket = jenisTiket;
        this.hargaTiket = hargaTiket;
        this.jumlahTiket = jumlahTiket;
    }
    
    public double hitungTotal() {
        return this.hargaTiket * this.jumlahTiket;
    }
    
    public void tampilData() {
        System.out.println("====================================================");
        System.out.println("          DATA PEMESANAN TIKET BIOSKOP XXI          ");
        System.out.println("====================================================");
        System.out.printf("Kode Tiket  : %s\n", this.kodeTiket);
        System.out.printf("Film        : %s\n", this.namaFilm);
        System.out.printf("Jenis Tiket : %s\n", this.jenisTiket);
        System.out.printf("Harga       : %.0f\n", this.hargaTiket);
        System.out.printf("Jumlah      : %d\n", this.jumlahTiket);
        System.out.printf("Total       : %.0f\n", hitungTotal());
        System.out.println("----------------------------------------");
        System.out.println();
    }
    
    public String getKodeTiket() {
        return kodeTiket;
    }

    public void setKodeTiket(String kodeTiket) {
        this.kodeTiket = kodeTiket;
    }

    public String getNamaFilm() {
        return namaFilm;
    }

    public void setNamaFilm(String namaFilm) {
        this.namaFilm = namaFilm;
    }

    public String getJenisTiket() {
        return jenisTiket;
    }

    public void setJenisTiket(String jenisTiket) {
        this.jenisTiket = jenisTiket;
    }

    public double getHargaTiket() {
        return hargaTiket;
    }

    public void setHargaTiket(double hargaTiket) {
        this.hargaTiket = hargaTiket;
    }

    public int getJumlahTiket() {
        return jumlahTiket;
    }

    public void setJumlahTiket(int jumlahTiket) {
        this.jumlahTiket = jumlahTiket;
    }
}
