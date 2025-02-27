package Praktikum03;

public class DataDosen21 {

    public static void dataSemuaDosen(Dosen21[] arrayOfDosen) {
        System.out.println("\nData Semua Dosen:");
        int i = 0;
        for (Dosen21 dosen21 : arrayOfDosen) {
            System.out.println("Data dosen ke-" + (i + 1));
            System.out.println("Kode\t\t: "+ dosen21.kode);
            System.out.println("Nama\t\t: "+ dosen21.nama);
            System.out.println("Jenis kelamin\t: " + (dosen21.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia\t\t: " + dosen21.usia);
            System.out.println("----------------------------------------");
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen21[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen21 dosen21 : arrayOfDosen) {
            if (dosen21.jenisKelamin) pria++;
            else wanita++;
        }
        System.out.println("\nJumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public static void rataUsiaDosenPerJenisKelamin(Dosen21[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0, jumlahPria = 0, jumlahWanita = 0;

        for (Dosen21 dosen21 : arrayOfDosen) {
            if (dosen21.jenisKelamin) {
                totalUsiaPria += dosen21.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += dosen21.usia;
                jumlahWanita++;
            }
        }

        System.out.println("\nRata-rata Usia Dosen Pria   : " + (totalUsiaPria/jumlahPria));
        System.out.println("Rata-rata Usia Dosen Wanita : " + (totalUsiaWanita/jumlahWanita));
    }

    public static void infoDosenPalingTua(Dosen21[] arrayOfDosen) {
        Dosen21 tertua = arrayOfDosen[0];
        for (Dosen21 dosen21 : arrayOfDosen) {
            if (dosen21.usia > tertua.usia) {
                tertua = dosen21;
            }
        }
        System.out.println("\nDosen Paling Tua:");
        System.out.println("Kode\t\t: "+ tertua.kode);
        System.out.println("Nama\t\t: "+ tertua.nama);
        System.out.println("Jenis kelamin\t: " + (tertua.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia\t\t: " + tertua.usia);
        System.out.println("----------------------------------------");
        
    }

    public static void infoDosenPalingMuda(Dosen21[] arrayOfDosen) {
        Dosen21 termuda = arrayOfDosen[0];
        for (Dosen21 dosen21 : arrayOfDosen) {
            if (dosen21.usia < termuda.usia) {
                termuda = dosen21;
            }
        }
        System.out.println("\nDosen Paling Muda:");
        System.out.println("Kode\t\t: "+ termuda.kode);
        System.out.println("Nama\t\t: "+ termuda.nama);
        System.out.println("Jenis kelamin\t: " + (termuda.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia\t\t: " + termuda.usia);
        System.out.println("----------------------------------------");
    }
}

