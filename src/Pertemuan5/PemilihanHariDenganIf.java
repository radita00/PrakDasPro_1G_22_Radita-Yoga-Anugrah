package Pertemuan5;

 import java.util.Scanner;

public class PemilihanHariDenganIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dayName;

        System.out.print("Input bilangan bulat: ");
        dayName = sc.nextInt();

        if (dayName >= 1 && dayName <=5) {
            System.out.println("weekday");
        }
        else if (dayName ==6 || dayName ==7) {
            System.out.println("weekend");
        }
        else {
            System.out.println("invalid number");
        }
    }
}
