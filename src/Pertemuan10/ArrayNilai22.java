package Pertemuan10;

import java.util.Scanner;

public class ArrayNilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilaiAkhir [] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukan niali akhir ke-"+i+" : ");
            nilaiAkhir[i] = sc.nextInt();
        } 
        for (int i = 0; i < 10; i++) {
            System.out.print("Nilai akhir ke-"+i+" adalah "+nilaiAkhir[i]);
        }sc.close();
    }
}
