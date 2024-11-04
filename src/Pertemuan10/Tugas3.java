package Pertemuan10;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar","Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        String key;
        boolean tersedia = false;

        System.out.print("Menu makanan yang ingin dicari : ");
        key = sc.nextLine();

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(key)) {
                tersedia = true;
                break;
            }
        }if (tersedia) {
            System.out.println("Menu " + key + " tersedia!");
        }else {
            System.out.println("Menu " + key + " tidak tersedia");
        }
        
    }
}
