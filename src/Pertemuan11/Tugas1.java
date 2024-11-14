package Pertemuan11;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] hasilSurvey = new int[10][6];

        for (int i = 0; i < hasilSurvey.length; i++) {
            System.out.println("Responden ke-" + (i+1));
            double totalPerResponden = 0;
            for (int j = 0; j < hasilSurvey[0].length; j++) {
                System.out.print("Masukan nilai untuk pertanyaan ke-" + (j+1) + " (nilai 1-5): ");
                hasilSurvey [i][j] = sc.nextInt();
                totalPerResponden += hasilSurvey[i][j];
            }
            double rata2Responden = totalPerResponden/hasilSurvey[0].length;
            System.out.println("Rata-rata nilai: " + rata2Responden);
        }
        System.out.println();
        System.out.println("Rata-rata untuk setiap pertanyaan: ");
        for (int j = 0; j < hasilSurvey[0].length; j++) {
            double totalPerPertanyaan = 0;
            for (int i = 0; i < hasilSurvey.length; i++) {
                totalPerPertanyaan += hasilSurvey[i][j];
            }
            double rata2Pertanyaan = totalPerPertanyaan/hasilSurvey.length;
            System.out.println("Rata-rata pertanyaan ke-" + (j+1) + ": " + rata2Pertanyaan);
        }
        System.out.println();
        System.out.println("Rata-rata keseluruhan: ");
        double totalnilai = 0;
        for (int i = 0; i < hasilSurvey.length; i++) {
            for (int j = 0; j < hasilSurvey[0].length; j++) {
                totalnilai += hasilSurvey[i][j];
            } 
        }
        double rata2Keseluruhan = totalnilai/(hasilSurvey.length * hasilSurvey[0].length);
        System.out.println("Rata-rata keseluruhan nilai: " + rata2Keseluruhan);
        sc.close();
    }
}
