/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverloadOverride;

/**
 *
 * @author Faiq
 */
public class Main {
    public static void main(String[] args) {
        Restoran Padang = new Restoran();
        Padang.pesan("Ayam Gulai");
        Padang.pesan("Rendang", 2);
        Padang.pesan(new String[]{"Nasi", "Ayam Gulai", "Rendang"});
        
        System.out.println("");
        
        RestoranCepatSaji KFC = new RestoranCepatSaji();
        KFC.pesan("Paket Ayam");
        KFC.pesan("Kentang", 2);
        KFC.pesan(new String[]{"Ayam Paha", "Kentang", "Es Teh"});
    }
}
