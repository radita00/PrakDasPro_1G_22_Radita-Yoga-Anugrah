package Pertemuan7;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalTiket = 0,jumlahTiket, hargaTiket = 50000;
        double totalHarga = 0, jumlahHarga;
        char lanjut;
        do {
            System.out.print("Masukan jumlah pembelian tiket: ");
            jumlahTiket = sc.nextInt();
            while (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan ulang.");
                System.out.print("Masukkan jumlah pembelian tiket: ");
                jumlahTiket = sc.nextInt();
            }

            totalTiket += jumlahTiket;

            jumlahHarga = jumlahTiket * hargaTiket;
            if (jumlahTiket > 10) {
                jumlahHarga = jumlahHarga - (jumlahHarga * 0.15);
            } else if (jumlahTiket > 4) {
                jumlahHarga = jumlahHarga - (jumlahHarga * 0.10);
            }
            totalHarga += jumlahHarga;

            System.out.println("Harga tiket: Rp " + jumlahHarga);
            System.out.print("Apakah ada pelanggan lain? (y/n): ");
            lanjut = sc.next().charAt(0);
        } while (lanjut == 'y' || lanjut == 'Y');
        System.out.println("\nTotal tiket terjual: " + totalTiket);
        System.out.println("Total penjualan hari ini: Rp " + totalHarga);

        sc.close();
    }    
}
