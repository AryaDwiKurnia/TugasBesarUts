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
public class Sepeda {

    /**
     * @param args the command line arguments
     */
    private String KodeSepeda;
    private String JenisSepeda;
    private int LamaSewa;
    private double HargaPerJam;
    
    public Sepeda(String KodeSepeda,String JenisSepeda,int LamaSewa,double HargaPerJam){
        this.KodeSepeda = KodeSepeda;
        this.JenisSepeda = JenisSepeda;
        this.LamaSewa = LamaSewa;
        this.HargaPerJam = HargaPerJam;
    }
    
    public double HitungBiaya(){
        return LamaSewa*HargaPerJam;
    }
    
    public void TampilData(){
        System.out.println("Kode Sepeda : " + KodeSepeda);
        System.out.println("Jenis Sepeda: " + JenisSepeda);
        System.out.println("Lama Sewa   : " + LamaSewa + " jam");
        System.out.println("Harga Per Jam: Rp" + HargaPerJam);
        System.out.println("Total Biaya : Rp" + HitungBiaya());
        System.out.println("==================================");
    }
}
