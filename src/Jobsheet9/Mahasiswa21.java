package Jobsheet9;

public class Mahasiswa21 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    Mahasiswa21(String nama, String nim, String kelas){
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }
    void tugasDinilai(int nilai){
        this.nilai = nilai;
    }
}
