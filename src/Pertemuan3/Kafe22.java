package Pertemuan3;

import java.util.Scanner;
/**
 * Kafe22
 */
public class Kafe22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10 / 100f;

        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = sc.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jmlKopi = sc.nextInt();
        System.out.print("Masukkan jumlah pembelian teh: ");
        jmlTeh = sc.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        jmlRoti = sc.nextInt();

        double totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        double nominalBayar = totalHarga - (diskon * totalHarga);
        int nominalInt = (int) nominalBayar;

        System.out.println("Keanggotaan pelanggan " + keanggotaan);
        System.out.println("Item pembelian " + jmlKopi + " kopi " + jmlTeh + " teh " + jmlRoti + " roti ");
        System.out.println("Nominal bayar Double Rp " + nominalBayar);
        System.out.println("Nominal bayar Int Rp" + nominalInt);
    }
}