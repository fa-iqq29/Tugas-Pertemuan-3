/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PenerapaObjectClass;

/**
 *
 * @author Faiq
 */
public class Main {
    public static void main(String[] args) {
        MobilAmfibi AngkatanDarat = new MobilAmfibi("BRDM-1");
        
        System.out.println("JENIS KENDARAAN: ");
        AngkatanDarat.nama();
        AngkatanDarat.detailDarat();
        AngkatanDarat.jenisMesin();
        
        System.out.println("");
        System.out.println("DETAIL KENDARAAN: ");
        AngkatanDarat.bergerak();
        AngkatanDarat.jumlahRoda();
        AngkatanDarat.detailMesin();
        
        System.out.println("");
        System.out.println("KEMAMPUAN KENDARAAN: ");
        AngkatanDarat.nanjak();
        AngkatanDarat.ngapung();
        AngkatanDarat.ngebut();
    }
}
