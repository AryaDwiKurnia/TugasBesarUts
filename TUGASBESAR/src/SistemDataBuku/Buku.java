/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemDataBuku;

/**
 *
 * @author admin
 */
public class Buku {

    /**
     * @param args the command line arguments
     */
    String KodeBuku;
       String Judul;
       String Penulis;
       double harga;
       
    public Buku (String KodeBuku,String Judul, String Penulis,double harga){
        this.KodeBuku = KodeBuku;
        this.Judul = Judul;
        this.Penulis = Penulis;
        this.harga = harga;
    }
    
    public void TampilData(){
        System.out.println("Kode Buku : " + KodeBuku);
        System.out.println("Judul     : " + Judul);
        System.out.println("Penulis   : " + Penulis);
        System.out.println("Harga     : Rp" + harga);
        System.out.println("----------------------------");
    }    
}
