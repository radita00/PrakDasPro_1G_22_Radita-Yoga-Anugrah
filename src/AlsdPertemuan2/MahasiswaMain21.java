package AlsdPertemuan2;

public class MahasiswaMain21 {
    public static void main(String[] args) {
        Mahasiswa21 mhs1 = new Mahasiswa21();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2k");
        mhs1.updateIpk(3.6);
        mhs1.tampilkanInformasi();

        Mahasiswa21 mhs2 = new Mahasiswa21("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa21 mhsRadita = new Mahasiswa21("Radita Yoga Anugrah", "244107020099", 3.42, "TI 1G");
        mhsRadita.tampilkanInformasi();
    }
}
