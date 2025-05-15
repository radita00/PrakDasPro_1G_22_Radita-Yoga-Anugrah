package AlsdPertemuan12;
import java.util.Scanner;
public class SSLAntrianLayananMain21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan21 antrian = new AntrianLayanan21();
        antrian.max = 5;
        int pilihan;

        do {
            System.out.println("\n=== MENU ANTRIAN MAHASISWA ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Cek Jumlah Antrian");
            System.out.println("6. Cek Apakah Antrian Kosong");
            System.out.println("7. Cek Apakah Antrian Penuh");
            System.out.println("8. Tampilkan Semua Antrian");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM\t: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama\t: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas\t: ");
                    String kelas = sc.nextLine();
                    System.out.print("IPK\t: ");
                    double ipk = sc.nextDouble();
                    sc.nextLine();
                    Mahasiswa21 mhs = new Mahasiswa21(nim, nama, kelas, ipk);
                    antrian.enqueue(mhs);
                    break;               
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.peekHead();
                    break;                  
                case 4:
                    antrian.peekTail();
                    break;
                case 5:
                    System.out.println("Jumlah antrian: " + antrian.size());
                    break; 
                case 6:
                    System.out.println("Antrian kosong: " + antrian.IsEmpty());
                    break;
                case 7:
                    System.out.println("Antrian penuh: " + antrian.isFull());
                    break;
                case 8:
                    antrian.print();
                    break;
                case 9:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("keluar program");
                    break;

                default:
                    System.out.println("pilihan tidak valid");
            }
        } while (pilihan != 0);
    }
}