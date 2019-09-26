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
public class KalkulatorSederhana {

    public static void main(String[] args) {
        System.out.println("===== K A L K U L A T O R  S E D E R H A N A =====");
        System.out.println();
        System.out.println("Penjumlahan     : 18  + 26 = " + penjumlahan(18, 26));
        System.out.println();
        System.out.println("Pengurangan     : 49  + 23 = " + pengurangan(49, 23));
        System.out.println();
        System.out.println("Perkalian       : 78  x 56 = " + perkalian(78, 56));
        System.out.println();
        System.out.println("Pembagian       : 987 : 23 = " + pembagian(987, 23));
        System.out.println();
        System.out.println("Sisa hasil bagi : 5 % 9    = " + sisahasilbagi(5, 9));
        System.out.println();
        System.out.println("===================================================");

    }

    public static int penjumlahan(int bil1, int bil2) {
        bil1 = 18;
        bil2 = 26;
        int hasil = bil1 + bil2;
        return hasil;
    }

    public static int pengurangan(int bil1, int bil2) {
        bil1 = 49;
        bil2 = 23;
        int hasil = bil1 - bil2;
        return hasil;
    }

    public static int perkalian(int bil1, int bil2) {
        bil1 = 78;
        bil2 = 56;
        int hasil = bil1 * bil2;
        return hasil;
    }

    public static double pembagian(double bil1, int bil2) {
        bil1 = 987;
        bil2 = 23;
        double hasil = bil1 / bil2;
        return hasil;
    }

    public static double sisahasilbagi(double bil1, double bil2) {
        if (bil1 > bil2) {
            System.out.println("Sisa hasil bagi : 5 % 9    = " + bil1 % bil2);
        } else if (bil1 < bil2) {
            System.out.println("Sisa hasil bagi : Hasil tidak ditemukan");
        }

        return 0;
    }
}
