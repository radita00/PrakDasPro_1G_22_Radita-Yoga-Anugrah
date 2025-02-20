package AlsdPertemuan2;

public class DosenMain21 {
    public static void main(String[] args) {
        Dosen21 dsn1 = new Dosen21();
        dsn1.idDosen = "CR";
        dsn1.nama = "Cahya Rahmad, ST., M.Kom., Dr Eng";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2004;
        dsn1.bidangKeahlian = "Matematika";

        dsn1.tampilkanInformasi();
        System.out.println("---------------------------");
        dsn1.setStatusDosen(false);
        dsn1.ubahKeahlian("Bahasa Inggris");
        dsn1.tampilkanInformasi();
        System.out.println("Masa Kerja: "+ dsn1.hitungMasaKerja(2025)+" Tahun");

        System.out.println("===============================");

        Dosen21 dsn2 = new Dosen21();
        dsn2.idDosen = "AF";
        dsn2.nama = "Astrifidha Rahma Amalia,S.Pd., M.Pd.";
        dsn2.statusAktif = false;
        dsn2.tahunBergabung = 2018;
        dsn2.bidangKeahlian = "Agama";

        dsn2.tampilkanInformasi();
        System.out.println("---------------------------");
        dsn2.setStatusDosen(true);
        dsn2.ubahKeahlian("MAtematika");
        dsn2.tampilkanInformasi();
        System.out.println("Masa Kerja: "+ dsn2.hitungMasaKerja(2025)+" Tahun");
    }
}
