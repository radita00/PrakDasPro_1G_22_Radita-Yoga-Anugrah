package Pertemuan13;

import java.util.Scanner;

public class IbuMariana22 {
    static Scanner sc = new Scanner(System.in);
    static int [][] input (String [] menu){
        int [][] terjual = new int[5][7];
        System.out.println("=== INPUT JUMLAH PENJUALAN ===");

        for (int i = 0; i < menu.length; i++) {
            System.out.println("> Nama menu: " + menu[i]);
            for (int j = 0; j < terjual[i].length; j++) {
                System.out.print("Masukkan jumlah penjualan hari ke-" + (j+1) + ": ");
                terjual [i][j] = sc.nextInt();
            }
        }
        System.out.println();
        return terjual;
    }
    static void tampilan (String [] menu, int [][]jmlTerjual){
        System.out.println("=== DATA PENJUALAN ===");
        System.out.print("\t\t");
        for (int i = 0; i < 7; i++) {
            System.out.print("Hari ke-" + (i+1) + "\t");
        }

        System.out.println();
        for (int i = 0; i < jmlTerjual.length; i++) {
            System.out.print(menu[i] + "\t");
            for (int j = 0; j < jmlTerjual[i].length; j++) {
                System.out.print(jmlTerjual[i][j] + "\t\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void penjualanTertinggi (int [][] jmlTerjual, String [] menu){
        System.out.println("=== PENJUALAN TERBANYAK ===");
        int terjualTertinggi = 0;
        String menuTertinggi = "";
        
        for (int i = 0; i < jmlTerjual.length; i++) {
            int total = 0;
            for (int j = 0; j < jmlTerjual[i].length; j++) {
                total += jmlTerjual[i][j];
            }
            if (total > terjualTertinggi) {
                terjualTertinggi = total;
                menuTertinggi = menu[i];
            }
        }
        System.out.println("Menu yang terjual paling banyak adalah " + menuTertinggi + "sebanyak " + terjualTertinggi);
        System.out.println();
    }
    static void rata2Penjualan (int [][] jmlTerjual, String [] menu){
        System.out.println("=== RATA RATA PENJUALAN ===");
        int total = 0;

        for (int i = 0; i < jmlTerjual.length; i++) {
            for (int j = 0; j < jmlTerjual.length; j++) {
                total += jmlTerjual[i][j];
            }
            double rata2 = total/jmlTerjual[i].length;
            System.out.println("Rata rata penjualan dari " + menu[i] + ": " + rata2);
        }
    }

    public static void main(String[] args) {
        String [] menu = {"Kopi\t", "Teh\t", "Es Degan", "Roti Bakar", "Gorengan"};
        int [][] jmlTerjual = input(menu);

        tampilan(menu, jmlTerjual);

        penjualanTertinggi(jmlTerjual, menu);

        rata2Penjualan(jmlTerjual, menu);
        
    }
    
}
