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
}
