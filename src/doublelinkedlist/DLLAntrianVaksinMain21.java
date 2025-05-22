package doublelinkedlist;

import java.util.Scanner;

public class DLLAntrianVaksinMain21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLLAntrianVaksin21 antrian = new DLLAntrianVaksin21();
        int pilih;
        
        do {
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------");
                    System.out.println("Nomor Antrian: ");
                    int nomor = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nama Penerima: ");
                    String nama = sc.nextLine();
                    antrian.enqueue(nomor, nama);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3: 
                    antrian.print();
                    break;
                case 4:
                System.out.println("Keluar program");
                break;

                default:
                    System.out.println("Pilihan tidak valid");;
            }
        } while (pilih != 4);
    }
}
