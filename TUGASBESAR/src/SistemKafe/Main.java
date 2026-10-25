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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu menu1 = new Menu("M01", "Nasi Goreng", 18000, "Makanan");
        
        menu1.tampilMenu();
        
        int jumlah = 2;
        System.out.println("Jumlah : "+ jumlah);
        
        double total = menu1.hitungHarga(jumlah);
        System.out.println("Total : "+ (int)total);
    }
    
}
