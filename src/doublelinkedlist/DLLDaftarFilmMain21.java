package doublelinkedlist;

import java.util.Scanner;

public class DLLDaftarFilmMain21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLLDaftarFilm21 daftar = new DLLDaftarFilm21();
        int pilihan;
        do {
            System.out.println("====================================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("====================================");
            System.out.println("1. Tambah data awal");
            System.out.println("2. Tambah data akhir");
            System.out.println("3. Tambah data indeks tertentu");
            System.out.println("4. Hapus data pertama");
            System.out.println("5. Hapus data terakhir");
            System.out.println("6. Hapus data tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari id film");
            System.out.println("9. Urutkan data rating film-desc");
            System.out.println("10. Keluar");
            System.out.println("====================================");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.print("ID Film     : ");
                    String idAwal = sc.nextLine();
                    System.out.print("Judul Film  : ");
                    String judulAwal = sc.nextLine();
                    System.out.print("Rating Film : ");
                    float ratingAwal = sc.nextFloat();
                    sc.nextLine();
                    daftar.tambahAwal(new Film21(idAwal, judulAwal, ratingAwal));
                    break;

                case 2:
                    System.out.println("Masukkan Data Film Posisi Akhir");
                    System.out.print("ID Film     : ");
                    String idAkhir = sc.nextLine();
                    System.out.print("Judul Film  : ");
                    String judulAkhir = sc.nextLine();
                    System.out.print("Rating Film : ");
                    float ratingAkhir = sc.nextFloat();
                    sc.nextLine();
                    daftar.tambahAkhir(new Film21(idAkhir, judulAkhir, ratingAkhir));
                    break;

                case 3:
                    System.out.println("Masukkan Data Film");
                    System.out.print("Urutan ke- ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    System.out.print("ID Film     : ");
                    String idIndex = sc.nextLine();
                    System.out.print("Judul Film  : ");
                    String judulIndex = sc.nextLine();
                    System.out.print("Rating Film : ");
                    float ratingIndex = sc.nextFloat();
                    sc.nextLine();
                    daftar.tambahIndex(index, new Film21(idIndex, judulIndex, ratingIndex));
                    break;

                case 4:
                    daftar.hapusPertama();
                    System.out.println("Data film pertama telah dihapus.");
                    break;

                case 5:
                    daftar.hapusTerakhir();
                    System.out.println("Data film terakhir telah dihapus.");
                    break;

                case 6:
                    System.out.print("Masukkan ID film yang akan dihapus: ");
                    String idHapus = sc.nextLine();
                    daftar.hapusID(idHapus);
                    break;

                case 7:
                    System.out.println("Daftar Film:");
                    daftar.cetak();
                    break;

                case 8:
                    System.out.print("Masukkan ID film yang dicari: ");
                    String idCari = sc.nextLine();
                    daftar.cariID(idCari);
                    break;

                case 9:
                    daftar.urutRatingDesc();
                    System.out.println("Daftar film berhasil diurutkan berdasarkan rating.");
                    break;

                case 10:
                    System.out.println("Terima kasih. Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu 1–10.");
            }
        } while (pilihan != 10);
    }
}
