package Pertemuan6;

import java.util.Scanner;

public class P6_TugasLat322 {
    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);

        int merk, kategori, ukuran;

        System.out.println("----------------------------------------------");
        System.out.println("================= LIST MERK ==================");
        System.out.println("----------------------------------------------");
        System.out.println("1. Converse");
        System.out.println("2. Skecher");
        System.out.println("3. Nike");
        System.out.println("----------------------------------------------");
        System.out.print("Masukan angka dari merk yang dipilih = ");
        merk = input22.nextInt();
        System.out.println("----------------------------------------------");
        
        if (merk == 1) {
            System.out.println("================= KATEGORI ===================");
            System.out.println("----------------------------------------------");
            System.out.println("1. Slip On (Uk. 36-40)");
            System.out.println("2. High Top (Uk. 40-44)");
            System.out.println("----------------------------------------------");
            System.out.print("Masukan angka dari kategori yang dipilih = ");
            kategori = input22.nextInt();
            System.out.println("----------------------------------------------");
            if (kategori == 1) {
            System.out.print("Masukan ukuran = ");
            ukuran = input22.nextInt();
                if (ukuran >= 36 && ukuran <= 40) {
                System.out.println("Harga sepatu = Rp800.000");
                }
                else {
                    System.out.println("Ukuran salah");
                }
            }
            else if (kategori == 2) {
                System.out.print("Masukan ukuran = ");
                ukuran = input22.nextInt();
                if (ukuran >= 40 && ukuran <= 44) {
                    System.out.println("Harga sepatu = Rp1.200.000");
                }
                else {System.out.println("Ukuran salah");}
            }
            else {
                System.out.println("Kategori salah");
            }
        } else if (merk == 2) {
            System.out.println("================= KATEGORI ===================");
            System.out.println("----------------------------------------------");
            System.out.println("1. Woman (Uk. 36-41)");
            System.out.println("2. Man (Uk. 41-44)");
            System.out.println("----------------------------------------------");
            System.out.print("Masukan angka dari kategori yang dipilih = ");
            kategori = input22.nextInt();
            System.out.println("----------------------------------------------");
            if (kategori == 1) {
            System.out.print("Masukan ukuran = ");
            ukuran = input22.nextInt();
                if (ukuran >= 36 && ukuran <= 41) {
                System.out.println("Harga sepatu = Rp1.000.000");
                }
                else {
                    System.out.println("Ukuran salah");
                }
            }
            else if (kategori == 2) {
                System.out.print("Masukan ukuran = ");
                ukuran = input22.nextInt();
                if (ukuran >= 41 && ukuran <= 44) {
                    System.out.println("Harga sepatu = Rp1.800.000");
                }
                else {System.out.println("Ukuran salah");}
            }
            else {
                System.out.println("Kategori salah");
            }
        } else if (merk == 3) {
            System.out.println("================= KATEGORI ===================");
            System.out.println("----------------------------------------------");
            System.out.println("1. Kids (Uk. 36-40)");
            System.out.println("2. Adult (Uk. 40-44)");
            System.out.println("----------------------------------------------");
            System.out.print("Masukan angka dari kategori yang dipilih = ");
            kategori = input22.nextInt();
            System.out.println("----------------------------------------------");
            if (kategori == 1) {
            System.out.print("Masukan ukuran = ");
            ukuran = input22.nextInt();
                if (ukuran >= 36 && ukuran <= 40) {
                System.out.println("Harga sepatu = Rp750.000");
                }
                else {
                    System.out.println("Ukuran salah");
                }
            }
            else if (kategori == 2) {
                System.out.print("Masukan ukuran = ");
                ukuran = input22.nextInt();
                if (ukuran >= 40 && ukuran <= 44) {
                    System.out.println("Harga sepatu = Rp1.500.000");
                }
                else {System.out.println("Ukuran salah");}
            }
            else {
                System.out.println("Kategori salah");
            }
        }else {
            System.out.println("Merk salah");
        }
        input22.close();
    }
}
