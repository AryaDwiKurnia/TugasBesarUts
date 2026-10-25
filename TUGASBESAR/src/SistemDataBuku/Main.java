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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Buku buku1 = new Buku(
                "B001","Pemrogram Berbasis Objek","Arya Dwi Kurnia",70000
        );
        
        Buku buku2 = new Buku(
                "B002","Sistem Operasi","Afdhal Syulthony",65000
        );
        
        System.out.println("DATA INVENTARIS BUKU");
        System.out.println("====================");
        buku1.TampilData();
        buku2.TampilData();
    }
    
}
