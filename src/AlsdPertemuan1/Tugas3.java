package AlsdPertemuan1;
import java.util.Scanner;
public class Tugas3 {
    static void tampilkanMenu(){
        System.out.println("Menu:");
        System.out.println("1. Tampilkan seluruh jadwal kuliah");
        System.out.println("2. Tampilkan jadwal berdasarkan hari");
        System.out.println("3. Tampilkan jadwal berdasarkan semester");
        System.out.println("4. Cari mata kuliah");
        System.out.println("5. Keluar");
    }
    static void tampilkanJadwal(){
        System.out.println("==================================");
        System.out.println("JADWAL KULIAH");
        System.out.println("==================================");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Matkul: ");
        int jmlMatkul = input.nextInt();
        String [] namaMatkul = new String[jmlMatkul];
        int [] sks = new int[jmlMatkul];
        int [] semester = new int[jmlMatkul];
        String [] hariKuliah = new String[jmlMatkul];
        input.nextLine();
        for (int i = 0; i < jmlMatkul; i++) {
            System.out.print("Masukkan Nama Matkul: ");
            namaMatkul [i] = input.nextLine();
            System.out.print("Masukkan bobot sks untuk MK " + namaMatkul[i] + ": ");
            sks [i] = input.nextInt();
            System.out.print("Nilai untuk Semester: ");
            semester[i] = input.nextInt();
            input.nextLine();
            System.out.print("Masukkan Hari Kuliah: ");
            hariKuliah [i] = input.nextLine();
            System.out.println("==================================");
        }
        while (true) {
            tampilkanMenu();
            System.out.println("Pilih Menu: ");
            int pilihMenu = input.nextInt();
            input.nextLine();
            switch (pilihMenu) {
                case 1:
                System.out.println("==================================");
                System.out.println("SELURUH JADWAL KULIAH");
                System.out.println("==================================");
                for (int i = 0; i < jmlMatkul; i++) {
                    System.out.println(namaMatkul[i] + " - " + sks[i] + " SKS - Semester " + semester[i] + " - " + hariKuliah[i]);
                }
                    break;
                case 2:
                System.out.print("Masukkan Pencarian Untuk Hari Kuliah: ");
                String inputHari = input.nextLine();
                System.out.println("==================================");
                System.out.println("Jadwal Kuliah Pada Hari " + inputHari + ": ");
                System.out.println("==================================");
                for (int i = 0; i < jmlMatkul; i++) {
                    if (hariKuliah[i].equalsIgnoreCase(inputHari)) {
                        System.out.println(namaMatkul[i] + " - " + sks[i] + " SKS - Semester " + semester[i]);
                    }
                }
                    break;
                case 3:
                System.out.print("Masukkan Pencarian Untuk Semester Kuliah: ");
                int inputSmtr = input.nextInt();
                System.out.println("==================================");
                System.out.println("Jadwal Kuliah Pada Semester " + inputSmtr + ": ");
                System.out.println("==================================");
                for (int i = 0; i < jmlMatkul; i++) {
                    if (inputSmtr == semester[i]) {
                        System.out.println(namaMatkul[i] + " - " + sks[i] + " SKS -  " + hariKuliah[i]);
                    }
                }
                    break;
                case 4:
                System.out.print("Masukkan Pencarian Untuk Mata Kuliah: ");
                String inputMatkul = input.nextLine();
                System.out.println("==================================");
                System.out.println("Hasil Pencarian Mata Kuliah " + inputMatkul + ": ");
                System.out.println("==================================");
                for (int i = 0; i < jmlMatkul; i++) {
                    if (namaMatkul[i].equalsIgnoreCase(inputMatkul)) {
                        System.out.println(namaMatkul[i] + " - " + sks[i] + " SKS - Semester " + semester[i] + " - " + hariKuliah[i]);
                    }
                }
                    break;
                case 5:
                System.out.println("Program selesai.");
                    break;
                default:
                System.out.println("Pilihan tidak valid.");
                    break;
            }

        }
    }
}
