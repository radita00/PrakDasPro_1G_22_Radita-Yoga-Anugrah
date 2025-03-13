package Minggu5;

public class MainNilaiMhs21 {
    public static void main(String[] args) {
        int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82};
        int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84};

        NilaiMhs21 mhs = new NilaiMhs21();
        int maxUTS = mhs.cariMaxUTS(nilaiUTS, 0, nilaiUTS.length-1);
        int minUTS = mhs.cariMinUTS(nilaiUTS, 0, nilaiUTS.length-1);
        double rata2 = mhs.carirata2UAS(nilaiUAS);

        System.out.println("Nilai UTS tertinggi: " + maxUTS);
        System.out.println("Nilai UTS terendah: " + minUTS);
        System.out.println("Rata-rata nilai UAS: " + rata2);
    }
}
