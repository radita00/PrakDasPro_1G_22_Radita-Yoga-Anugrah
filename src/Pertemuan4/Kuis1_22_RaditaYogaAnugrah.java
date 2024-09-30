package Pertemuan4;

import java.util.Scanner;

/**
 * Kuis1_22_RaditaYogaAnugrah
 */
public class Kuis1_22_RaditaYogaAnugrah {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama22, nim22, absen22;
        int jam22, menit22, lama22;

        System.out.print("Nama\t: ");
        nama22 = sc.nextLine();
        System.out.print("NIM\t: ");
        nim22 = sc.nextLine();
        System.out.print("Absen\t: ");
        absen22 = sc.nextLine();
        System.out.println("=========== PROGRAM MENGHITUNG JAM KULIAH ============");

        System.out.print("Masukan jam saat ini: ");
        jam22 = sc.nextInt();
        System.out.print("Masukan menit saat ini: ");
        menit22 = sc.nextInt();
        System.out.print("Jam saat ini: " + jam22 + ":" + menit22);
        
        System.out.print("\n\nMasukan lama kuliah dalam menit: ");
        lama22 = sc.nextInt();

        int totalMenit22 = (jam22 * 60 + menit22 + lama22);
        int jamPulang22 = (totalMenit22 / 60);
        int menitPulang22 = (totalMenit22 % 60);

        System.out.println("\nWaktu kepulangan anda selesai pukul: " + jamPulang22 + ":" + menitPulang22);
    }
}