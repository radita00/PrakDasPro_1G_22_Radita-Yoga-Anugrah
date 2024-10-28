package Pertemuan9;

import java.util.Scanner;

public class RataNilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Float nilai,rataNilai,totalNilai;
        int i =1;
        while (i<=5) {
            totalNilai = 0f;
            System.out.println("Input nilai mahasiswa ke-" + i);
            for (int j = 1; j <=5; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                nilai = sc.nextFloat();
                totalNilai += nilai;
            }
            rataNilai = totalNilai/5;
            System.out.println("Rata-rata nilai mahasiswa ke-" + i + " adalah " + rataNilai);
            i++;
        }
    }
    
}
