package Pertemuan13;

import java.util.Scanner;

public class Kafe22 {
    public static void Menu (String namaPelanggan, boolean isMemeber){
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMemeber) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 15,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");

    }
    public static double hitungTotalHarga22(int pilihMenu, int banyakItem, String kodePromo){
        int [] hargaItem = {15000,20000,22000,12000,10000,18000};
        

        double hargaTotal = hargaItem[pilihMenu-1] * banyakItem;

        if (kodePromo.equalsIgnoreCase("diskon50")) {
            System.out.print("Selamat anda mendapatkan diskon sebesar 50%");
            System.out.print("\nHarga semula: Rp" + hargaTotal);
            hargaTotal *= 0.5;
        }else if (kodePromo.equalsIgnoreCase("diskon30")) {
            System.out.print("Selamat anda mendapatkan diskon sebesar 30%");
            System.out.print("\nHarga semula: Rp" + hargaTotal);
            hargaTotal *= 0.3;
        }else {
            System.out.print("Kode promo yang anda masukkan invalid");
        }
        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu("Andi", true);

        System.out.print("\nMasukkan nomor menu yang ingin anda pesan: ");
        int pilihMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin anda pesan: ");
        int banyakItem = sc.nextInt();

        sc.nextLine();
        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.nextLine();
        
        double totalHarga = hitungTotalHarga22(pilihMenu, banyakItem, kodePromo);
        
        System.out.println("\nTotal harga untuk pesanan anda: Rp" + totalHarga);

    }
}
