package Praktikum05;

public class DataDosen21 {
    Dosen21[] listDsn= new Dosen21[5];
    int idx;

    void tambah(Dosen21 d){
        if (idx<listDsn.length) {
            listDsn[idx]=d;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }
    void tampil(){
        for (Dosen21 d : listDsn) {
            d.tampilInformasi();
            System.out.println("-------------------------------------");
        }
    }
    void bubbleSort(){
        for (int i = 0; i < listDsn.length-1; i++) {
            for (int j = 1; j < listDsn.length-i; j++) {
                if (listDsn[j].usia<listDsn[j-1].usia) {
                    Dosen21 tmp = listDsn [j];
                    listDsn[j]=listDsn[j-1];
                    listDsn[j-1]=tmp;
                }
            }
        }
    }
    void selectionSort(){
        for (int i = 0; i < listDsn.length-1; i++) {
            int idxMax=i;
            for (int j = i+1; j < listDsn.length; j++) {
                if (listDsn[j].usia>listDsn[idxMax].usia) {
                    idxMax=j;
                }
            }
            Dosen21 tmp = listDsn[idxMax];
            listDsn[idxMax]=listDsn[i];
            listDsn[i]=tmp;
        }
    }
    int[] pencarianDataSequential21(String cari){
        int [] posisi= new int[idx];
        int jumlah=0;
        for (int i = 0; i < listDsn.length; i++) {
            if (listDsn[i].nama.equalsIgnoreCase(cari)) {
                posisi[jumlah]=i;
                jumlah++;
            }
        }
        int [] hasil = new int[jumlah];
        for (int i = 0; i < jumlah; i++) {
            hasil[i]=posisi[i];
        } return hasil;
    }
    int []pencarianDataBinary21(int cari, int left, int right){
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            if (cari == listDsn[mid].usia) {
                int[] temp = new int[idx];
                int jumlah = 0;
                int i = mid;
                while (i >= 0 && listDsn[i].usia == cari) {
                    temp[jumlah] = i;
                    jumlah++;
                    i--;
                }
                i = mid + 1;
                while (i < idx && listDsn[i].usia == cari) {
                    temp[jumlah] = i;
                    jumlah++;
                    i++;
                }
                int[] hasil = new int[jumlah];
                for (int j = 0; j < jumlah; j++) {
                    hasil[j] = temp[j];
                }
                return hasil;
            } else if (listDsn[mid].usia > cari) {
                return pencarianDataBinary21(cari, left, mid - 1);
            } else {
                return pencarianDataBinary21(cari, mid + 1, right);
            }
        }
        return new int[]{-1};
    }
    
    void tampilPosisi(String x,int[] pos){
        if (pos[0] != -1) {
            System.out.println("Data dosen dengan nama "+ x + " terletak pada index ");
            for (int i = 0; i < pos.length; i++) {
                System.out.println("index ke-"+ pos[i]);
            }
            if (pos.length > 1) {
                System.out.println("Terdapat lebih dari satu data dengan nama \"" + x + "\"");
            }
        } else {
            System.out.println("Data dosen " + x + " tidak ditemukan");
        }
    }
    void tampilPosisiUsia(double u, int[] pos) {
        if (pos[0] != -1) {
            System.out.println("Data dosen dengan usia " + u + " ditemukan pada index:");
            for (int i = 0; i < pos.length; i++) {
                System.out.println("Index ke-" + pos[i]);
            }
            if (pos.length > 1) {
                System.out.println("Peringatan: Terdapat lebih dari satu data dengan usia " + u);
            }
        } else {
            System.out.println("Data dosen dengan usia " + u + " tidak ditemukan");
        }
    }
    void tampilDataSearch(String x, int []pos){
        if (pos[0] != -1) {
            for (int i = 0; i < pos.length; i++) {
                System.out.println("kode\t\t : " + listDsn[i].kode);
                System.out.println("nama\t\t : "+ listDsn[i].nama);
                System.out.println("jenis kelamin \t: " + (listDsn[i].jenisKelamin ? "Pria" : "Wanita"));
                System.out.println("usia \t\t : "+ listDsn[i].usia);
            }
        } else {
            System.out.println("Data dosen dengan nama "+ x + " tidak ditemukan");
        }
    }
    void tampilDataSearchusia(double u, int []pos){
        if (pos[0] != -1) {
            for (int i = 0; i < pos.length; i++) {
                System.out.println("kode\t\t : " + listDsn[i].kode);
                System.out.println("nama\t\t : "+ listDsn[i].nama);
                System.out.println("jenis kelamin \t: " + (listDsn[i].jenisKelamin ? "Pria" : "Wanita"));
                System.out.println("usia \t\t : "+ listDsn[i].usia);
            }
        } else {
            System.out.println("Data dosen dengan nama "+ u + " tidak ditemukan");
        }
    }
}
