package AlsdPertemuan1;
import java.util.Scanner;
public class PrakPemilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas: ");
        int nilaiTugas = input.nextInt();
        
        System.out.print("Masukkan Nilai Kuis: ");
        int nilaiKuis = input.nextInt();

        System.out.print("Masukkan Nilai Uts: ");
        int nilaiUts = input.nextInt();

        System.out.print("Masukkan Nilai Uas: ");
        int nilaiUas = input.nextInt();

        System.out.println("==============================");
        System.out.println("==============================");

        if (nilaiKuis < 0 || nilaiKuis > 100 ||nilaiTugas < 0 || nilaiTugas > 100 ||nilaiUts < 0 || nilaiUts > 100 ||nilaiUas < 0 || nilaiUas > 100) {
            System.out.println("Nilai Tidak Valid");
            System.out.println("==============================");
            System.out.println("==============================");
    
        }
        else {
        double nilaiAkhir= (nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUts * 0.3) + (nilaiUas * 0.3);
        System.out.println("Nilai Akhir = " + nilaiAkhir);

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            System.out.println("Nilai Huruf = A");
        }

        else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            System.out.println("Nilai Huruf = B+");
        }

        else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            System.out.println("Nilai Huruf = B");
        }

        else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            System.out.println("Nilai Huruf = C+");
        }
        else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            System.out.println("Nilai Huruf = C");
        }

        else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            System.out.println("Nilai Huruf = D");
        }

        else if (nilaiAkhir <= 39) {
            System.out.println("Nilai Huruf = E ");
        }
        
        System.out.println("==============================");
        System.out.println("==============================");
        if (nilaiAkhir > 50 && nilaiAkhir <= 100) {
            System.out.println("SELAMAT ANDA LULUS");
        } else if (nilaiAkhir <= 50) {
            System.out.println("ANDA TIDAK LULUS");
        }
        }
    }
}
