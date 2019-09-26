/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet12;

/**
 *
 * @author TUF
 */
public class Luasbangundatar {

    public static void main(String[] args) {
        System.out.println("Luas Persegi " + persegi());
        System.out.println("Luas Persegi Panjang " + persegipanjang());
        System.out.println("Luas lingkaran " + lingkaran());
    }

    public static double persegi() {
        int s = 10;
        double hasil = s * s;
        return hasil;
    }

    public static double persegipanjang() {
        int p = 10;
        int l = 5;
        double hasil = p * l;
        return hasil;
    }

    public static double lingkaran() {
        int r = 10;
        double phi = 3.14;
        double hasil = phi * r * r;
        return hasil;
    }
}
