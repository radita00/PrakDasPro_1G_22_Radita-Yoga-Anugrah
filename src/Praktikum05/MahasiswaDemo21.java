package Praktikum05;
import java.util.Scanner;

public class MahasiswaDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        MahasiswaPrestasi21 list = new MahasiswaPrestasi21(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data mahasiswa ke-" + (i+1));
            System.out.print("NIM\t: ");
            String nim = sc.nextLine();
            System.out.print("Nama\t: ");
            String nama = sc.nextLine();
            System.out.print("Kelas\t: ");
            String kelas = sc.nextLine();
            System.out.print("IPK\t: ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            
            System.out.println("----------------------------------");

            Mahasiswa21 mhs = new Mahasiswa21(nim, nama, kelas, ipk);
            list.tambah(mhs);
        }
        list.tampil();
        System.out.println("--------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("Menggunakan binary search");
        double posisi2 = list.findBinarySearch(cari, 0, jumlah-1);
        int pss2=(int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari,pss2);
    }
}
