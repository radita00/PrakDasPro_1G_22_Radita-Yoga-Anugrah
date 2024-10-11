package Pertemuan7;

import java.util.Scanner;

public class SiakadFor22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100, batas = 60;
        int lulus = 0, tidakLulus = 0;

        for (int i = 1; i <= 10; i++)   {
            System.out.print("Masukan nilai mahasiawa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            } 
            if (nilai > batas) {
                lulus ++;
            }
            else {
                tidakLulus ++;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus: " + lulus);
        System.out.println("Jumlah masasiswa tidak lulus: " + tidakLulus);
    }
}
