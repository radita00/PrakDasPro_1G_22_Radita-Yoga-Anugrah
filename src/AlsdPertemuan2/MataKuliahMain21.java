package AlsdPertemuan2;

public class MataKuliahMain21 {
    public static void main(String[] args) {
        MataKuliah21 mk1 = new MataKuliah21();
        mk1.kodeMK = "RTI242006";
        mk1.nama = "Basis data";
        mk1.sks = 2;
        mk1.jumlahJam = 4;

        mk1.tampilkanInformasi();
        System.out.println("------------------------------------");
        mk1.ubahSks(3);
        mk1.tambahJam(2);
        mk1.kurangiJam(1);
        mk1.tampilkanInformasi();

        System.out.println("=====================================");

        MataKuliah21 mk2 = new MataKuliah21();
        mk2.kodeMK = "RTI242007";
        mk2.nama = "Praktikum Basis data";
        mk2.sks = 2;
        mk2.jumlahJam = 4;

        mk2.tampilkanInformasi();
        System.out.println("------------------------------------");
        mk2.ubahSks(3);
        mk2.kurangiJam(5);
        mk2.tampilkanInformasi();
    }
}
