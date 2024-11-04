package Pertemuan10;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlPesanan;
        int total = 0;
        System.out.println("=========== PEMESANAN ===========");
        System.out.print("Masukkan jumlah pembelian : ");
        jmlPesanan = sc.nextInt();
        sc.nextLine();
        
        String [] namaMenu = new String[jmlPesanan];
        int [] hargaMenu = new int[jmlPesanan];

        for (int i = 0; i < jmlPesanan; i++) {
            System.out.print("Masukan nama makanan/minuman ke-" + (i+1) + " : ");
            namaMenu [i] = sc.nextLine();
            System.out.print("Masukkan harga : ");
            hargaMenu [i] = sc.nextInt();
            sc.nextLine();
            total += hargaMenu[i];
        }
        System.out.println("======== DAFTAR PESANAN ========");
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println("Nama menu ke-" + (i+1) + " : " + namaMenu[i]);
            System.out.println("Harga : " + hargaMenu[i]);
        }
        System.out.println("================================");
        System.out.println("Total harga : " + total);
        System.out.println("================================");
        sc.close();
        
    }
}
