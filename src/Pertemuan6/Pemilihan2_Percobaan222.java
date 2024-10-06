package Pertemuan6;

import java.util.Scanner;

public class Pemilihan2_Percobaan222 {
    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);

        int pilihan_menu;
        double diskon, harga, total_bayar;
        String member, metode;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.print("Masukan angka dari menu yang dipilih = ");
        pilihan_menu = input22.nextInt();
        input22.nextLine();
        System.out.print("Apakah punya member (y/n)? = ");
        member = input22.nextLine();
        System.out.println("-------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukan pilihan menu dengan benar");
                return;
            }
            System.out.print("Apakah metode pembayaran qris (y/n)? =");
            metode = input22.nextLine();
            if (metode.equalsIgnoreCase("y")) {
                total_bayar = harga - (harga * diskon) - 1000;
                System.out.println("Total bayar setelah diskon = " + total_bayar);
            } else if (metode.equalsIgnoreCase("n")) {
                total_bayar = harga - (harga * diskon);
                System.out.println("Total bayar setelah diskon = " + total_bayar);
            } else {
                System.out.println("Masukan metode yang benar");
                return;
            }
        }
        else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukan pilihan menu dengan benar");
                return;
            }
            System.out.print("Apakah metode pembayaran qris (y/n)? =");
            metode = input22.nextLine();
            if (metode.equalsIgnoreCase("y")) {
                total_bayar = harga - 1000;
                System.out.println("Total bayar setelah diskon = " + total_bayar);
            } else if (metode.equalsIgnoreCase("n")) {
                total_bayar = harga;
                System.out.println("Total bayar setelah diskon = " + total_bayar);
            } else {
                System.out.println("Masukan metode yang benar");
                return;
            }
        } else {
            System.out.println("member tidak valid");
        }
        System.out.println("-------------------------------------");

    }
}
