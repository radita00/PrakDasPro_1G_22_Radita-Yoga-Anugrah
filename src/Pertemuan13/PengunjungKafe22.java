package Pertemuan13;

public class PengunjungKafe22 {
    public static void daftarPengunjung (String...namaPengunjung){
        System.out.println("Daftar Nama Pengunjung");
        for (String daftarPerngunjung : namaPengunjung) {
            System.out.println("- " + daftarPerngunjung);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
    }
    
}
