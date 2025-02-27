package Praktikum03;

import java.util.Scanner;

public class MahasiswaDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa21 [] arrayOfMahasiswa = new Mahasiswa21[3];
        String dummy;
        Mahasiswa21[] myArrayOfMahasiswa = new Mahasiswa21[3];
        myArrayOfMahasiswa[0].nim = "244107060033";
        myArrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        myArrayOfMahasiswa[0].kelas = "SIB-1E";
        myArrayOfMahasiswa[0].ipk = (float) 3.75;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa21();
            
            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM\t: ");
            arrayOfMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama\t: ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas\t: ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK\t: ");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy); 
            System.out.println("----------------------------------------");
        }
        for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            arrayOfMahasiswa[i].cetakinfo();
        }
    }
}
