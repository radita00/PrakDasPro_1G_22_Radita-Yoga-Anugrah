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

        if (angka % 2 == 0)
        {
            System.out.println("Angka " + angka + " termasuk bilangan genap");
        }
        else
        {
            System.out.println("Angka " + angka + " termasuk bilangan ganjil");
        }
    
    }
}