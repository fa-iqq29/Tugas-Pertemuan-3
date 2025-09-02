/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PenerapaObjectClass;

/**
 *
 * @author Faiq
 */
public class MobilAmfibi extends KendaraanMesin implements BisaMenanjak, BisaMengapung, BisaNgebut {

    public MobilAmfibi(String nama) {
        super(nama);
    }

    void bergerak() {
        System.out.println(nama + " bisa bergerak di darat dan air.");
    }

    void jumlahRoda() {
        System.out.println(nama + " punya 4 roda lipat.");
    }

    void detailMesin() {
        System.out.println(nama + " menggunakan mesin berpendingin udara 1.100cc V6.");
    }

    public void nanjak() {
        System.out.println(nama + " bisa bergerak secara menanjak dan jalan terjal.");
    }

    public void ngapung() {
        System.out.println(nama + " bisa mengapung dan berjalan di permukaan air.");
    }

    public void ngebut() {
        System.out.println(nama + " bisa ngebut 300 km/jam di jalan tol.");
    }

}
