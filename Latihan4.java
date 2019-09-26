/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet12;

import java.util.Scanner;

/**
 *
 * @author TUF
 */
public class Latihan4 {

    public static void kecepatan(double a, double b) {
        System.out.println("Kecepatan : " + (a / b)+" km/jam");
    }

    public static void main(String[] args) {
        int jarak, waktu;
        Scanner apik = new Scanner(System.in);
        System.out.println("Masukkan jarak : ");
        jarak = apik.nextInt();
        System.out.println("Masukkan waktu : ");
        waktu = apik.nextInt();
        kecepatan(jarak, waktu);
    }
}
