/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RentalSepeda;

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
        Sepeda sepeda1 = new Sepeda(
            "S001", "Sepeda MTB", 5, 15000
        );

        // Objek sepeda kedua
        Sepeda sepeda2 = new Sepeda(
            "S002", "Sepeda BMX", 4, 10000
        );

        System.out.println("=== DATA RENTAL SEPEDA ===");

        sepeda1.TampilData();
        sepeda2.TampilData();
        
    }
    
}
