package Pertemuan10;

import java.util.Scanner;

public class ArrayRataNilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-"+(i+1)+ " : ");
            nilaiMhs[i]=sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = "+rata2);
        sc.close();
    }
}
