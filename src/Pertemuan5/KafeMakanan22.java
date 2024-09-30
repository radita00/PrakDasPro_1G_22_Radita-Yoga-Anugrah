package Pertemuan5;

import java.util.Scanner;

public class KafeMakanan22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jmlNasgor, jmlMieRebus, jmlFuyunghai;
        double hrgNasgor, hrgMieRebus,hrgFuyunghai;

        System.out.println("----------Nasi Goreng----------");
        System.out.print("Masukan jumlah pembelian nasi goreng: ");
        jmlNasgor = sc.nextInt();
        System.out.print("Masukan harga nasi goreng: Rp. ");
        hrgNasgor = sc.nextDouble();
        System.out.println("-----------Mie Rebus-----------");
        System.out.print("Masukan jumlah pembelian mie rebus: ");
        jmlMieRebus = sc.nextInt();
        System.out.print("Masukan harga mie rebus: Rp. ");
        hrgMieRebus = sc.nextInt();
        System.out.println("-----------Fuyunghai-----------");
        System.out.print("Masukan jumlah penbelian fuyunghai: ");
        jmlFuyunghai = sc.nextInt();
        System.out.print("Masukan harga fuyunghai: Rp. ");
        hrgFuyunghai = sc.nextDouble();

        double totalHarga = (jmlNasgor * hrgNasgor) + (jmlMieRebus * hrgMieRebus) + (jmlFuyunghai * hrgFuyunghai);

        if (totalHarga > 500000) {
            double nominalBayar = totalHarga - (totalHarga * 0.1);
            System.out.println("\nNominal bayar : Rp " + nominalBayar);
        }
        else if (totalHarga > 200000) {
            double nominalBayar = totalHarga - (totalHarga * 0.05);
            System.out.println("\nNominal bayar : Rp " + nominalBayar);
        }
        else if (totalHarga > 100000) {
            double nominalBayar = totalHarga - (totalHarga * 0.01);
            System.out.println("\nNominal bayar : Rp " + nominalBayar);
        }
        else{
            double nominalBayar = totalHarga;
            System.out.println("\nNominal bayar : Rp " + nominalBayar);
        }
    }
}
