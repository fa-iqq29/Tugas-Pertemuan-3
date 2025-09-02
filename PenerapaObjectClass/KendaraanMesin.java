/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PenerapaObjectClass;

/**
 *
 * @author Faiq
 */
abstract class KendaraanMesin extends KendaraanDarat {
    
    public KendaraanMesin (String nama){
        super (nama);
    }
    
    abstract void detailMesin();
    
    void jenisMesin(){
        System.out.println(nama + " menggunakan mesin hybrid super canggih.");
    }
}
