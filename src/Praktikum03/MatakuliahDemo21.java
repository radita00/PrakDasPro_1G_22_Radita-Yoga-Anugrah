package Praktikum03;
import java.util.Scanner;
public class MatakuliahDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah21 [] arrayOfMatakuliah = new Matakuliah21[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
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

            arrayOfMatakuliah[i] = new Matakuliah21(kode, nama, sks, jumlahJam);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode\t\t: " + arrayOfMatakuliah[i].kode);
            System.out.println("Nama\t\t: " + arrayOfMatakuliah[i].nama);
            System.out.println("Sks\t\t: " + arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah jam\t: " + arrayOfMatakuliah[i].jumlahJam);
            System.out.println("----------------------------------------");
        }
    }
}
