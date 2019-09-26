/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge1;

import java.util.Scanner;

/**
 *
 * @author TUF
 */
public class Kalkulator {

    public static int penjumlahan(int bil1, int bil2) {
        int hasil = bil1 + bil2;
        return hasil;
    }

    public static int pengurangan(int bila, int bilb) {
        int hasil = bila - bilb;
        return hasil;
    }

    public static int perkalian(int bil3, int bil4) {
        int hasil = bil3 * bil4;
        return hasil;
    }

    public static double pembagian(double bilc, double bild) {
        double hasil = bilc / bild;
        return hasil;
    }

    public static int sisahasilbagi(int bil5, int bil6) {
        {
            int hasil = bil5 % bil6;
            return hasil;
        }
    }

    public static void main(String[] args) {
        Scanner apik = new Scanner(System.in);
        System.out.println("===== K A L K U L A T O R  S E D E R H A N A =====");
        System.out.println();
        System.out.println("#ANDA MEMASUKI OPERATOR PENJUMLAHAN#");
        System.out.println("MASUKKAN BILANGAN PERTAMA : ");
        int bil1 = apik.nextInt();
        System.out.println("MASUKKAN BILANGAN KEDUA   : ");
        int bil2 = apik.nextInt();
        System.out.println("HASIL PENJUMLAHAN : " + penjumlahan(bil1, bil2));
        System.out.println();
        System.out.println("#ANDA MEMASUKI OPERATOR PENGURANGAN#");
        System.out.println("MASUKKAN BILANGAN PERTAMA : ");
        int bila = apik.nextInt();
        System.out.println("MASUKKAN BILANGAN KEDUA   : ");
        int bilb = apik.nextInt();
        System.out.println("HASIL PENGURANGAN : " + pengurangan(bila, bilb));
        System.out.println();
        System.out.println("#ANDA MEMASUKI OPERATOR PERKALIAN#");
        System.out.println("MASUKKAN BILANGAN PERTAMA : ");
        int bil3 = apik.nextInt();
        System.out.println("MASUKKAN BILANGAN KEDUA   : ");
        int bil4 = apik.nextInt();
        System.out.println("HASIL PERKALIAN : " + perkalian(bil3, bil4));
        System.out.println();
        System.out.println("#ANDA MEMASUKI OPERATOR PEMBAGIAN#");
        System.out.println("MASUKKAN BILANGAN PERTAMA : ");
        double bilc = apik.nextDouble();
        System.out.println("MASUKKAN BILANGAN KEDUA   : ");
        double bild = apik.nextDouble();
        System.out.println("HASIL PEMBAGIAN : " + pembagian(bilc, bild));
        System.out.println();
        System.out.println("#ANDA MEMASUKI OPERATOR SISA HASIL BAGI#");
        System.out.println("MASUKKAN BILANGAN PERTAMA : ");
        int bil5 = apik.nextInt();
        System.out.println("MASUKKAN BILANGAN KEDUA   : ");
        int bil6 = apik.nextInt();
        int sisa = sisahasilbagi(bil5, bil6);
        {
        }
        if (bil5 > bil6) {
            System.out.println("SISA HASIL BAGI : " + sisa);
        } else if (bil5 < bil6) {
            System.out.println("SISA HASIL BAGI : HASIL TIDAK DITEMUKAN");

        }
        System.out.println();
        System.out.println("TERIMA KASIH TELAH MENGGUNAKAN KALKULATOR SEDERHANA");
    }
}
