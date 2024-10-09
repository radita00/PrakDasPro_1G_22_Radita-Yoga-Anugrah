package Pertemuan6;

import java.util.Scanner;

public class P6_TugasLat222 {
    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);

        String jenisBuku;
        int jumlah;
        double diskon, totalDiskon;

        System.out.println("===================================");
        System.out.print("Masukan jenis buku = ");
        jenisBuku = input22.nextLine();
        System.out.print("Masukan jumlah buku = ");
        jumlah = input22.nextInt();
        System.out.println("-----------------------------------");

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 0.10;
            if (jumlah > 2) {
                totalDiskon = (diskon + 0.02);
            } else {
                totalDiskon = diskon;
            }
            System.out.println("Total diskon = " + totalDiskon);
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 0.07;
            if (jumlah > 3) {
                totalDiskon = diskon + 0.02;
            } else {
                totalDiskon = diskon + 0.01;
            }
            System.out.println("Total diskon = " + totalDiskon);
        } else if (jumlah > 3) {
            totalDiskon = 0.05;
            System.out.println("Total diskon = " + totalDiskon);
        } else {
            System.out.println("Total diskon = 0");
        }
        System.out.println("===================================");
    }
}
