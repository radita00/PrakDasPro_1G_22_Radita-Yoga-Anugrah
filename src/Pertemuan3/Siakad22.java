package Pertemuan3;

import java.util.Scanner;
/**
 * Siakad22
 */
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

        System.out.println("Mahasiswa dengan nama " + nama + "(NIM " + nim + ")" + " Kelas " + kelas + " Nomor Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}