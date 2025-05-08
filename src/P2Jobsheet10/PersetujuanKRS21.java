package P2Jobsheet10;
import java.util.Scanner;
public class PersetujuanKRS21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianPersetujuanKRS21 antrian = new AntrianPersetujuanKRS21(10);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Persetujuan KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Panggil Dua Mahasiswa");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat Dua Antrian Terdepan");
            System.out.println("5. Lihat Antrian Terakhir");
            System.out.println("6. Cek Jumlah Antrian");
            System.out.println("7. Cek Jumlah Terverifikasi");
            System.out.println("8. Cek Jumlah Belum Terverifikasi");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("NIM\t: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama\t: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi\t: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas\t: ");
                    String kelas = sc.nextLine();
                    Mahasiswa21 mhs = new Mahasiswa21(nim, nama, prodi, kelas);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    if (antrian != null) {
                        antrian.layaniDuaMahasiswa();
                    }
                    break;
                case 3: 
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.lihatDuaTerdepan();
                    break;
                case 5:
                    antrian.lihatPalingbelakang();
                    break;
                case 6:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 7:
                    System.out.println("Jumlah Mahasiswa yang sudah melakukan proses KRS: " + antrian.jumlahTerverif());
                    break;
                case 8:
                    System.out.println("Jumlah Mahasiswa yang belum melakukan proses KRS: " + antrian.jumlahBelumTerverif());
                    break;
                case 9:
                    antrian.clear();
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 0);
        sc.close();
    }
}
