package Pertemuan11;
import java.util.Scanner;
public class BioskopWithScanner22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris,kolom;
        String nama,next;
        String [][] penonton = new String[4][2];

        while (true) {
            System.out.println("===== INPUT DATA PENONTON =====");
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();
            System.out.print("Masukkan baris: ");
            baris = sc.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();

            if (baris >= 0 && baris <= penonton.length && kolom >= 0 && kolom <= penonton[0].length){
                if (penonton[baris-1][kolom-1]==null) {
                    penonton[baris-1][kolom-1] = nama;
                } else {
                    System.out.println();
                    System.out.println("Kursi telah terisi, masukkan ulang!");
                    System.out.println();
                }
            } else {
                System.out.println();
                System.out.println("Baris/kolom yang di pilih tidak tersedia");
                System.out.println();
            }


            System.out.println("===== TAMPILAN DAFTAR PENONTON =====");
            System.out.println();
            for (int i = 0; i < penonton.length; i++) {
                System.out.print("Penonton pada baris ke-" + (i + 1) + ": ");
                for (int j = 0; j < penonton[i].length; j++) {
                    System.out.print((penonton[i][j] == null ? "***" : penonton[i][j]) + " ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
        sc.close();
    }
}
