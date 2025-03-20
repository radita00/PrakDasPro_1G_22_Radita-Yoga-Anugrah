package Praktikum05;

public class Dosen21 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;
    
    Dosen21(String kd, String name, boolean jk, int age){
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }
    void tampilInformasi(){
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis kelamin: " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("usia: " + usia);
    }
}
