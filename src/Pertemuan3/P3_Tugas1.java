package Pertemuan3;

import java.util.Scanner;

/**
 * P3_Tugas1
 */
public class P3_Tugas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int penggunaanListrik;
        double tarifListrik = 1500.0;

        System.out.print("Masukan total penggunaan listrik dalam kWh: ");
        penggunaanListrik = sc.nextInt();
        
        double totalTarif = (penggunaanListrik * tarifListrik);
        boolean batas500Kwh = (penggunaanListrik > 500);

        System.out.println("Total tagihan listrik: Rp " + totalTarif);
        System.out.println("Apakah penggunaan melebihi 500 kWh? " + batas500Kwh);

    }
}