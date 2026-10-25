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

import java.util.ArrayList;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Tiket>daftarTiket = new ArrayList<>();
        
        Tiket t1 = new Tiket("T001", "AVENGERS DOOMSDAY", "VIP", 750000, 2);
        Tiket t2 = new Tiket("T002", "ONE PIECE : BAAD", "Regular", 25000, 3);
        
        daftarTiket.add(t1);
        daftarTiket.add(t2);
        
        for (Tiket t : daftarTiket) {
            t.tampilData();
    }
  }
}
