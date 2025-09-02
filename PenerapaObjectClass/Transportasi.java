/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PenerapaObjectClass;

/**
 *
 * @author Faiq
 */
abstract class Transportasi {

    String nama;
    public Transportasi(String nama) {
        this.nama = nama;
    }
    
    abstract void bergerak();
    
    void nama(){
        System.out.println("Nama Kendaraan: " + nama);
    }
}
