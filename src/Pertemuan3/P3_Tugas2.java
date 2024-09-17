package Pertemuan3;

import java.util.Scanner;

/**
 * P3_Tugas2
 */
public class P3_Tugas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jamKerja, upahPerJam;

        System.out.print("Masukan jumlah jam kerja: ");
        jamKerja = sc.nextInt();
        System.out.print("Masukan upah per jam: ");
        upahPerJam = sc.nextInt();

        double gaji = (jamKerja * upahPerJam);
        double bonus = (0.1 * gaji);
        double gajiSebelumPajak = (gaji + bonus);
        double pajak = (0.05 * gajiSebelumPajak);
        double totalGaji = (gajiSebelumPajak - pajak);

        System.out.println("Gaji dasar: Rp " + gaji);
        System.out.println("Bonus gaji: Rp " + bonus);
        System.out.println("Pajak gaji: Rp " + pajak);
        System.out.println("Total gaji: Rp " + totalGaji);
    }
}