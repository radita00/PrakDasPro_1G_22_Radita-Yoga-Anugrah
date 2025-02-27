package Praktikum03;
import java.util.Scanner;
public class DosenDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();
        Dosen21 [] arrayOfDosen = new Dosen21[jumlah];
        String kode, nama, dummy;
        boolean jenisKelamin;
        int usia;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode\t\t: ");
            kode = sc.nextLine();
            System.out.print("Nama\t\t: ");
            nama = sc.nextLine();
            System.out.print("Jenis kelamin\t: ");
            dummy = sc.nextLine();
            jenisKelamin = dummy.equalsIgnoreCase("Pria");
            System.out.print("Usia\t\t: ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            arrayOfDosen[i] = new Dosen21(kode, nama, jenisKelamin, usia);
            System.out.println("----------------------------------------");
        }
        DataDosen21.dataSemuaDosen(arrayOfDosen);
        DataDosen21.jumlahDosenPerJenisKelamin(arrayOfDosen);
        DataDosen21.rataUsiaDosenPerJenisKelamin(arrayOfDosen);
        DataDosen21.infoDosenPalingTua(arrayOfDosen);
        DataDosen21.infoDosenPalingMuda(arrayOfDosen);
    }
}
