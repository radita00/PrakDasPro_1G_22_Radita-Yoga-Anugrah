package AlsdPertemuan1;
import java.util.Scanner;
public class PrakPerulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM = ");
        long nim = input.nextLong();
        long digitNIM = nim % 100;
        if (digitNIM < 10) {
            digitNIM += 10;
        }
        System.out.println("===============");
        System.out.println("n = " + digitNIM);

        for (int i = 1; i <= digitNIM; i++) {
            if (i==6 || i==10) {
                continue;
            }
            if (i % 2 == 1) {
                System.out.print("* ");
            }
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
