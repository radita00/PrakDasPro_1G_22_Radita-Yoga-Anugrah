package Pertemuan5;

import java.util.Scanner;

/**
 * PemilihanBilangan22
 */
public class PemilihanBilangan22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan angka : ");
        int angka = sc.nextInt();
        
        String nilai = (angka % 2 == 0) ?"Termasuk bilangan genap" : "Termasuk bilangan ganjil" ; 
        System.out.println(nilai);
    }
}