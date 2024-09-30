package Pertemuan5;

import java.util.Scanner;

public class Kafe22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 0.1f;

        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = sc.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jmlKopi = sc.nextInt();
        System.out.print("Masukkan jumlah pembelian teh: ");
        jmlTeh = sc.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        jmlRoti = sc.nextInt();

        double totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        
        System.out.println("Keanggotaan pelanggan " + keanggotaan);
        System.out.println("Item pembelian " + jmlKopi + " kopi " + jmlTeh + " teh " + jmlRoti + " roti ");
        
        if (keanggotaan == true) {
            double nominalBayar = totalHarga - (totalHarga * diskon);
            System.out.println("Nominal bayar : Rp " + nominalBayar);
        }
        else{
            double nominalBayar = totalHarga;
            System.out.println("Nominal bayar : Rp " + nominalBayar);
        }
    }
}