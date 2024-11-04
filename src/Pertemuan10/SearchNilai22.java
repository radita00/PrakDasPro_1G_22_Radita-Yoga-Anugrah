package Pertemuan10;

import java.util.Scanner;

public class SearchNilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int key,nilai;
        int hasil = 0;

        System.out.print("Masukan banyaknya nilai yang akan diinput : ");
        nilai = sc.nextInt();
        int arrNilai [] = new int[nilai];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-"+(i+1)+ " : ");
            arrNilai[i]=sc.nextInt();
        }
        
        System.out.print("Masukan nilai yang ingin dicari : ");
        key = sc.nextInt();

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }
        System.out.println();
        if (key==arrNilai[hasil]) {
            System.out.println("Nilai "+key+" ketemu, merupakan nilai mahasiswa ke-"+ (hasil+1));
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
        System.out.println();
        sc.close();
    }

}