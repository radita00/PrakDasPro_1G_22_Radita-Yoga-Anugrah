package Pertemuan9;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlPoltek;
        String namaPoltek, atlet1 = "",atlet2="",atlet3="",atlet4="",atlet5="",cabor="";

        System.out.println("=== PORSENI POLITEKNIK NEGERI MALANG 2024 ===");
        System.out.print("Masukan jumlah politeknik yang daftar : ");
        jmlPoltek = sc.nextInt();
        for (int i = 1; i <= jmlPoltek; i++) {
            System.out.print("Masukan nama politeknik : ");
            namaPoltek = sc.nextLine();
            sc.nextLine();
            for (int j = 0; j < 4; j++) {
                System.out.print("Masukan cabang olahraga : ");
                cabor = sc.nextLine();
                for (int k = i; k <= 5; k++) {
                    System.out.print("Nama atlet ke-" + k + " : ");
                    if (k == 1) {
                        atlet1 = sc.nextLine();
                    } else if (k == 2) {
                        atlet2 = sc.nextLine();
                    } else if (k == 3) {
                        atlet3 = sc.nextLine();
                    } else if (k == 4) {
                        atlet4 = sc.nextLine();
                    } else if (k == 5) {
                        atlet5 = sc.nextLine();
                    }
                }System.out.println(namaPoltek + " - Cabang olahraga " + cabor);
                System.out.println("Atlet yang berpartisipasi");
                System.out.println("1. " + atlet1);
                System.out.println("2. " + atlet2);
                System.out.println("3. " + atlet3);
                System.out.println("4. " + atlet4);
                System.out.println("5. " + atlet5);
            } 
            
        }sc.close();
        
    }  
}
