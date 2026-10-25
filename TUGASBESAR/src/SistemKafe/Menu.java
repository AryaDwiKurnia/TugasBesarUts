/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemKafe;

/**
 *
 * @author admin
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    private String kodeMenu;
    private String namaMenu;
    private double harga;
    private String kategori;
    
    public Menu() {
        this.kodeMenu = "";
        this.namaMenu = "";
        this.harga = 0.0;
        this.kategori = "";
    }
    
    public Menu(String kodeMenu, String namaMenu, double harga, String kategori) {
        this.kodeMenu = kodeMenu;
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.kategori = kategori;
    }
    
    public void tampilMenu() {
        System.out.println("Kode   : " + kodeMenu);
        System.out.println("Nama   : " + namaMenu);
        System.out.println("Harga  : " + (int) harga);
    }
    
    public double hitungHarga(int jml) {
        return this.harga * jml;
    }

    
    public String getKodeMenu() {
        return kodeMenu;
    }

    public void setKodeMenu(String kodeMenu) {
        this.kodeMenu = kodeMenu;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    
    }
}
