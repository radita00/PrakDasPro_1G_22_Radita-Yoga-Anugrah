package Pertemuan11;
import java.util.Scanner;
public class Siakad22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] nilai = new int[4][3];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahsiswa ke-" + (i+1));
            double totalPerSiswa = 0;
            for (int j = 0; j < nilai.length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata: " + totalPerSiswa/3);
        }
        System.out.println("\n=============================");
        System.out.println("Rata-rata Nilais etiap Mata Kuliah: ");

        for (int j = 0; j < 3; j++) {
            double totalPerMatkul = 0;
            
            for (int i = 0; i < 4; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("mata Kuliah " + (j+1) + ": " + totalPerMatkul/4);
        }
        
    }
}
