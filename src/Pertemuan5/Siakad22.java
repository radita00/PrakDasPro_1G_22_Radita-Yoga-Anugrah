package Pertemuan5;

import java.util.Scanner;

public class Siakad22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String nama, nim;
        String kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukkan nomer absen: ");
        absen = sc.nextByte();

        System.out.print("Masukan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas:  ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masikkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masikkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();

        nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUTS * 0.30) + (nilaiUAS * 0.35);

        System.out.println("Mahasiswa dengan nama " + nama + "( NIM " + nim + ")" + " Kelas " + kelas + " Nomor Absen " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            System.out.println("Nilai akhir huruf : A \nKualifikasi : Sangat Baik");
        }
        else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            System.out.println("Nilai akhir huruf : B+ \nKualifikasi : Lebih dari Baik");
        }
        else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            System.out.println("Nilai akhir huruf : B \nkualifikasi : Baik");
        }
        else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            System.out.println("Nilai akhir huruf : C+ \nkualifikasi : lebih dari Cukup");
        }
        else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            System.out.println("Nilai akhir huruf : C \nkualifikasi : Cukup");
        }
        else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            System.out.println("Nilai akhir huruf : D \nkualifikasi : Kurang");
        }
        else if (nilaiAkhir <= 39) {
            System.out.println("Nilai akhir huruf : E \nkualifikasi : Gagal");
        }
    }
}