package Pertemuan10;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bnykNilai,total = 0,terendah = 100, tertinggi = 0;
        double rata2;

        System.out.println("========= INPUT NILAI =========");
        System.out.print("Masukkan banyak nilai mahasiswa : ");
        bnykNilai = sc.nextInt();

        int [] nilaiMhs= new int [bnykNilai];
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-"+(i+1)+ " : ");
            nilaiMhs[i]=sc.nextInt();
            total += nilaiMhs[i];
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }else if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }
        rata2 = total/nilaiMhs.length;

        System.out.println();
        System.out.println("======== NILAI MAHASISWA ========");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai mahasiswa ke " + (i+1) + " adalah " + nilaiMhs[i]);
        }
        System.out.println("Rata-rata nilai mahasiswa : " + rata2);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        sc.close();
    }
    
}
