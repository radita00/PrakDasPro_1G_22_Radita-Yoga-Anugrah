package Pertemuan7;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;

        do {
        System.out.println("===== JENIS KENDARAAN =====");
        System.out.println("1. Mobil\n2. Motor\n0. Keluar");
        System.out.print("Masukan jenis kendaraan: ");
        jenis = sc.nextInt();

        if (jenis == 1 || jenis == 2) {
            System.out.print("Masukan durasi parkir (jam): ");
            durasi = sc.nextInt();
            if (durasi > 5) {
                total = 12000;
            }else {
                if (jenis == 1) {
                    total = durasi * 3000;
                } else {
                    total = durasi * 2000;
                }
            }
            System.out.println("--------------------------------------");
            System.out.println("Total biaya parkir: Rp " + total);
            System.out.println("--------------------------------------");
        }else if (jenis != 0) {
            System.out.println("Jenis kendaraan tidak valid");
        }
         } while (jenis != 0);
         sc.close();

    }
}
