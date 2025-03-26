package Praktikum05;

public class MahasiswaPrestasi21 {
    Mahasiswa21 [] listMhs;
    int idx;

    MahasiswaPrestasi21(int jumlah) {
        listMhs = new Mahasiswa21[jumlah];
    }
    void tambah (Mahasiswa21 m){
        if (idx<listMhs.length) {
            listMhs[idx]=m;
            idx++;
        }else {
            System.out.println("data sudah penuh");
        }
    }
    void tampil (){
        for (Mahasiswa21 m : listMhs) {
            m.tampilInformasi();
            System.out.println("-----------------------------------");
        }
    }
    void bubbleSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length-i; j++) {
                if (listMhs[j].ipk>listMhs[j-1].ipk) {
                    Mahasiswa21 tmp=listMhs[j];
                    listMhs[j]=listMhs[j-1];
                    listMhs[j-1]=tmp;
                }
            }
        }
    }
    void selectionSort(){
        for (int i = 0; i < listMhs.length; i++) {
            int idxMin=i;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[j].ipk<listMhs[idxMin].ipk) {
                    idxMin=j;
                }
            }
            Mahasiswa21 tmp = listMhs[idxMin];
            listMhs[idxMin]=listMhs[i];
            listMhs[i]=tmp;
        }
    }
    void insertionSort(){
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa21 temp = listMhs[i];
            int j=i;
            while (j>0 && listMhs[j-1].ipk<temp.ipk) {
                listMhs[j]=listMhs[j-1];
                j--;
            }
            listMhs[j]=temp;
        }   
    }
    int sequentialSearching(Double cari){
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk==cari) {
                posisi=j;
                break;
            }
        }
        return posisi;
    }
    void tampilPosisi(double x, int pos){
        if (pos != -1) {
            System.out.println("Data mahasiswa dengan ipk: " + x + " ditemukan pada index " + pos);
        } else {
            System.out.println("Data " + x +" tidak ditemukan");
        }
    }
    void tampilDataSearch(double x, int pos){
        if (pos != -1) {
            System.out.println("nim\t : "+ listMhs[pos].nim);
            System.out.println("nama\t : "+listMhs[pos].nama);
            System.out.println("kelas\t : " + listMhs[pos].kelas);
            System.out.println("ipk\t : " + listMhs[pos].ipk);
        } else{
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }
    int findBinarySearch(double cari, int left, int right){
        int mid;
        if (right>=left) {
            mid = (right+left)/2;
            if (cari == listMhs[mid].ipk) {
                return(mid);
            } else if (listMhs[mid].ipk<cari) {
                return findBinarySearch(cari, left, mid -1);
            }else{
                return findBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
}
