package Pertemuan13;

import java.util.Scanner;

public class Kubus22 {
    static int hitungVolume (int sisi){
        int volume = sisi * sisi * sisi;
        return volume;
    }
    static int hitungluasPermukaan (int sisi){
        int luasPermukaan = 6 * (sisi * sisi);
        return luasPermukaan;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s, vol, lp;

        System.out.print("Masukkan panjang sisi kubus (cm): ");
        s = sc.nextInt();
        
        vol = hitungVolume(s);
        System.out.println("Volume kubus adalah " + vol + " cm^3");

        lp = hitungluasPermukaan(s);
        System.out.println("Luas permukaan kubus adalah " + lp + "cm^2");
    }
    
}
