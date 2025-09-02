/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverloadOverride;

/**
 *
 * @author Faiq
 */
class RestoranCepatSaji extends Restoran {

    @Override
    public void pesan(String menu) {
        System.out.println("[CepatSaji] Pesanan cepat untuk menu: " + menu);
    }

    @Override
    public void pesan(String menu, int jumlah) {
        System.out.println("[CepatSaji] Pesanan cepat untuk menu: " + jumlah + "x " + menu + " langsung diproses!");
    }

    @Override
    public void pesan(String[] menuList) {
        System.out.println("[CepatSaji] Pesanan cepat untuk beberapa menu: " + String.join(", ", menuList));
    }

}
