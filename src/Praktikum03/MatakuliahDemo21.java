package Praktikum03;
import java.util.Scanner;
public class MatakuliahDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlah = sc.nextInt();
        sc.nextLine();
        Matakuliah21 [] arrayOfMatakuliah = new Matakuliah21[jumlah];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            arrayOfMatakuliah[i] = new Matakuliah21();

            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode\t\t: ");
            kode = sc.nextLine();
            System.out.print("Nama\t\t: ");
            nama = sc.nextLine();
            System.out.print("Sks\t\t: ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah jam\t: ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("----------------------------------------");
            arrayOfMatakuliah[i].tambahData(kode, nama, sks, jumlahJam);
        }
        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}
