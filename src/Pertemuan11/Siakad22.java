package Pertemuan11;
import java.util.Scanner;
public class Siakad22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlMhs,jmlMatkul;

        System.out.print("Masukan jumlah mahasiswa: ");
        jmlMhs = sc.nextInt();
        System.out.print("Masukan jumlah mata kuliah: ");
        jmlMatkul = sc.nextInt();

        int [][] nilai = new int[jmlMhs][jmlMatkul];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahsiswa ke-" + (i+1));
            double totalPerSiswa = 0;
            for (int j = 0; j < nilai[0].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata: " + totalPerSiswa/jmlMatkul);
        }
        System.out.println("\n=============================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah: ");

        for (int j = 0; j < jmlMatkul; j++) {
            double totalPerMatkul = 0;
            
            for (int i = 0; i < jmlMhs; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("mata Kuliah " + (j+1) + ": " + totalPerMatkul/jmlMhs);
        }
        sc.close();
    }
}
