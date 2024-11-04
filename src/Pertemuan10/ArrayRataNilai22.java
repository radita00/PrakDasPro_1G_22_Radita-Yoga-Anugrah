package Pertemuan10;

import java.util.Scanner;

public class ArrayRataNilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlMhs, mhsLulus = 0, mhsTdkLulus = 0;
        double total = 0,totalLulus = 0, totalTdkLulus = 0;
        double rata2, rataLulus,rataTdkLulus;

        System.out.print("Masukan jumlah mahaiswa: ");
        jmlMhs=sc.nextInt();
        int[] nilaiMhs= new int[jmlMhs];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-"+(i+1)+ " : ");
            nilaiMhs[i]=sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                mhsLulus++;
                totalLulus += nilaiMhs[i]; 
            }else {
                mhsTdkLulus++;
                totalTdkLulus += nilaiMhs[i];
            }
        }
        System.out.println("Jumlah mahasiswa lulus = " + mhsLulus);
        System.out.println("Jumlah mahasiswa tidal lulus = " + mhsTdkLulus);
        rataLulus = totalLulus/mhsLulus;
        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        rataTdkLulus = totalTdkLulus/mhsTdkLulus;
        System.out.println("rata-rata nilai tidak lulus = " + rataTdkLulus);
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = "+rata2);
        sc.close();
    }
}
