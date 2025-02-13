package AlsdPertemuan1;
import java.util.Scanner;;
public class PrakArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jmlMatkul;
        System.out.print("Masukkan Jumlah Matkul: ");
        jmlMatkul = input.nextInt();
        String [] namaMatkul = new String[jmlMatkul];
        input.nextLine();

        for (int i = 0; i < jmlMatkul; i++) {
            System.out.print("Masukkan Nama Matkul: ");
            namaMatkul [i] = input.nextLine();

        }

        int [] bobotsks = new int[jmlMatkul];
        for (int i = 0; i < jmlMatkul; i++) {
            System.out.print("Masukkan bobot sks untuk MK " + namaMatkul[i] + ": ");
            bobotsks [i] = input.nextInt();
        }
        System.out.println("==============================");
        System.out.println("Program Menghitung Ip Semester");
        System.out.println("==============================");
        double [] nilaiSetara = new double[jmlMatkul];
        int [] nilai = new int[jmlMatkul];
        String [] nilaiHuruf = new String[jmlMatkul];
        for (int i = 0; i < jmlMatkul; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + namaMatkul[i] + ": ");
            nilai[i] = input.nextInt();
            if (nilai[i] > 80 && nilai[i] <= 100) {
                nilaiSetara[i] = 4.00;
                nilaiHuruf[i] = "A";
            }
            else if (nilai[i] > 73 && nilai[i] <= 80) {
                nilaiSetara [i] = 3.50;
                nilaiHuruf[i] = "B+";
            }
            else if (nilai[i] > 65 && nilai[i] <= 73) {
                nilaiSetara [i] = 3.00;
                nilaiHuruf[i] = "B";
            }
            else if (nilai[i] > 60 && nilai[i] <= 65) {
                nilaiSetara [i] = 2.50;
                nilaiHuruf[i] = "C+";
            }
            else if (nilai[i] > 50 && nilai[i] <= 60) {
                nilaiSetara [i] = 2.00;
                nilaiHuruf[i] = "C";
            }
            else if (nilai[i] > 39 && nilai[i] <= 50) {
                nilaiSetara [i] = 1.00;
                nilaiHuruf[i] = "D";
            }
            else if (nilai[i] <= 39) {
                nilaiSetara [i] = 0.00;
                nilaiHuruf[i] = "E";
            }
        }
        System.out.println("==============================");
        System.out.println("Hasil Koverensi Nilai");
        System.out.println("==============================");

        double totalNilai = 0;
        double totalSks = 0;
        for (int i = 0; i < jmlMatkul; i++) {
            totalNilai += nilaiSetara[i] * bobotsks[i];
            totalSks += bobotsks[i];
        } 
        double nilaiIP = totalNilai/totalSks;

        System.out.println("Hasil konverensi nilai");
        System.out.println("MK \t\t\tNilai Angka\tNilai Huruf\tBobot Sks ");
        for (int i = 0; i < jmlMatkul; i++) {
            System.out.print(namaMatkul[i]+ "\t\t" + nilai[i] + "\t\t" + nilaiHuruf [i] +"\t\t"+ bobotsks[i]);
            System.out.println();
        }
        System.out.println("==============================");
        System.out.println("Ip = " + nilaiIP);
        System.out.println("==============================");
    }
}
