package AlsdPertemuan2;

public class MataKuliah21 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilkanInformasi(){
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("Jumlah jam: " + jumlahJam);
    }
    void ubahSks(int sksBaru){
        sks = sksBaru;
        System.out.println("Sks telah diubah");
    }
    void tambahJam(int jamBaru){
        jumlahJam += jamBaru;
    }void kurangiJam(int jamBaru){
        if (jumlahJam < jamBaru) {
            System.out.println("Pengurangan tidak dapat dilakukan");
        } else {
            jumlahJam -= jamBaru;
            System.out.println("Jumlah jam telah diubah");
            System.out.println("Jumlah jam baru: " + jumlahJam);
        }
    }
}
