package Pertemuan6;

import java.util.Scanner;

public class P6_TugasLat122 {
    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);
        
        int bil1, bil2, bil3;

        System.out.print("Masukan bilangan pertama = ");
        bil1 = input22.nextInt();
        System.out.print("Masukan bilangan ke-2 = ");
        bil2 = input22.nextInt();
        System.out.print("Masukan bilangan ke-3 = ");
        bil3 = input22.nextInt();

        if (bil1 > bil2) 
            if (bil1 > bil3) {
                System.out.println("Bilangan terbesar = " + bil1);
            }
            else {
                System.out.println("Bilangan terbesar = " + bil3);
            }
        else if(bil2 > bil3) {
            System.out.println("Bilangan terbesar = " + bil2);
        }
        else {
            System.out.println("Bilangan terbesar = " + bil3);
        }
    }
}
