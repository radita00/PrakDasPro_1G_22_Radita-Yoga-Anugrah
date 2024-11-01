package Pertemuan10;

import java.util.Scanner;

public class ArrayNilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilaiAkhir [] = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukan niali akhir ke-"+i+" : ");
            nilaiAkhir[i] = sc.nextInt();
        } 
        for (int i = 0; i <  nilaiAkhir.length; i++) {
           if (nilaiAkhir[i]>70) {
                System.out.println("Nilai mahasiswa ke-"+i+" lulus!");
           } else{
                System.out.println("Nilai mahasiswa ke-"+i+" tidak lulus!");
            }
        
        }sc.close();
    }
}
