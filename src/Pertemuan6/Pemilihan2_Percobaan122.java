package Pertemuan6;

import java.util.Scanner;
/**
 * Pemilihan2_Percobaan122
 */
public class Pemilihan2_Percobaan122 {

    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);

        int tahun;

        System.out.print("Masukan tahun: ");
        tahun = input22.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun kabisat");
            }else{
                if ((tahun % 400) == 0) {
                    System.out.println("Tahun kabisat");
                }
                else
                System.out.println("Bukan tahun kabisat");
            }
        }else {
            System.out.println("Bukan tahun kabisat");
        }
    }
}