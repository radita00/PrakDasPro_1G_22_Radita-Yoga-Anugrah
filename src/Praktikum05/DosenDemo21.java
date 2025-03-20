package Praktikum05;
import java.util.Scanner;
public class DosenDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen21 list = new DataDosen21();
        String kode,nama;
        boolean jk;
        int usia;
    
        while (true) {
            System.out.println("=== MENU ===");
            System.out.println("1. Tambah data dosen");
            System.out.println("2. Tampilkan data dosen");
            System.out.println("3. Sorting ASC");
            System.out.println("4. Sorting DSC");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Masukkan data dosen ke-" + (i+1));
                        System.out.print("Kode\t\t: ");
                        kode = sc.nextLine();
                        System.out.print("Nama\t\t: ");
                        nama = sc.nextLine();
                        System.out.print("Jenis Kelamin\t: ");
                        String jenisKelamin = sc.nextLine();
                        jk = jenisKelamin.equalsIgnoreCase("Pria");
                        System.out.print("Usia\t\t: ");
                        usia = sc.nextInt();
                        System.out.println("---------------------------");
                        sc.nextLine();
                        Dosen21 dsn = new Dosen21(jenisKelamin, nama, jk, usia);
                        list.tambah(dsn);
                    }
                case 2:
                    System.out.println("Data seluruh dosen");
                    list.tampil();

                case 3:
                    System.out.println("Urutan dosen dari yang termuda");
                    list.bubbleSort();
                    list.tampil();
                case 4:
                    System.out.println("Urutan dosen dari yang tertua");
                    list.selectionSort();
                    list.tampil();
                default:
                    break;
            }
        }
    }
}
