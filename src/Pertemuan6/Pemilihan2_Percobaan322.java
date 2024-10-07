package Pertemuan6;

import java.util.Scanner;;

public class Pemilihan2_Percobaan322 {
    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);

        String kategori;
        int pernghasilan, gajiBersih;
        double pajak = 0;

        System.out.print("Masukan kategori : ");
        kategori = input22.nextLine();
        System.out.print("Masukan besarnya penghasilan : ");
        pernghasilan = input22.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")) {
            if (pernghasilan <= 2000000)
                pajak = 0.1;
            else if (pernghasilan <=3000000)
                pajak = 0.15;
            else
                pajak = 0.2;
            gajiBersih = (int) (pernghasilan - (pajak * pernghasilan));
            System.out.print("Penghasilah bersih : " + gajiBersih); 
        } else if (kategori.equalsIgnoreCase("pebisnis")) {
            if (pernghasilan <=2500000)
                pajak = 0.15;
            else if (pernghasilan <= 3500000)
                pajak = 0.2;
            else
                pajak = 0.25;
            gajiBersih = (int) (pernghasilan - (pajak * pernghasilan));
            System.out.print("Penghasilan bersih : " + gajiBersih);
        } else
            System.out.println("Masukan kategori salah");
    }
}
