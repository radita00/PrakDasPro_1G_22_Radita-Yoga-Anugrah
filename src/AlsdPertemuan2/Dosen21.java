package AlsdPertemuan2;

public class Dosen21 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilkanInformasi(){
        System.out.println("Id Dosen: " + idDosen);
        System.out.println("Nama dosen: " + nama);
        if (statusAktif==false) {
            System.out.println("Status keaktifan: Tidak aktif");
        } else {
            System.out.println("Status keaktifan: Aktif");
        }
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }
    void setStatusDosen(boolean status){
        statusAktif = status;
    }
    
    int hitungMasaKerja(int thnSkrng){
        thnSkrng -= tahunBergabung;
        return thnSkrng;
    }
    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }
}
