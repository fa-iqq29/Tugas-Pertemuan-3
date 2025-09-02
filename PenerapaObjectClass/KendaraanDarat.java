/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PenerapaObjectClass;

/**
 *
 * @author Faiq
 */
abstract class KendaraanDarat extends Transportasi {

    public KendaraanDarat(String nama) {
        super (nama);
    }
    
    abstract void jumlahRoda();
    
    void detailDarat(){
        System.out.println(nama + " dapat digunakan pada medan terjal.");
    }
}
