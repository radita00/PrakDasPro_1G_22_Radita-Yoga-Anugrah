package Pertemuan5;

import java.util.Scanner;

public class PemilihanOperator22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angka1, angka2, hasil = 0;
        char operator;

        System.out.print("Masukan angka 1: ");
        angka1 = sc.nextDouble();
        System.out.print("Masukan angka 2: ");
        angka2 = sc.nextDouble();
        System.out.print("Masukan operator (+ - * :)");
        operator = sc.next().charAt(0);

        if (operator == '+') {
            hasil = angka1 + angka2;
        } else if (operator == '-') {
            hasil = angka1 - angka2;
        } else if (operator == '*') {
            hasil = angka1 * angka2;
        } else if (operator == ':') {
            hasil = angka1 / angka2;
        } else {
            System.out.println("Operator tidak sesuai");
        }

        System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);

    }
}
