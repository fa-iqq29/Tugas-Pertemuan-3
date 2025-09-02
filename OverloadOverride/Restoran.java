/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverloadOverride;

/**
 *
 * @author Faiq
 */
class Restoran {
    public void pesan(String menu) {
        System.out.println("Memesan menu: " + menu);
    }

    public void pesan(String menu, int jumlah) {
        System.out.println("Memesan: " + jumlah + " porsi " + menu);
    }

    public void pesan(String[] menuList) {
        System.out.println("Memesan beberapa menu: " + String.join(", ", menuList));
    }
}
