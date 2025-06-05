package AlsdPertemuan14;

public class BinaryTreeArray21 {
    Mahasiswa21[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray21(){
        this.dataMahasiswa = new Mahasiswa21[10];
        this.idxLast = -1;
    }

    public void add(Mahasiswa21 data) {
        if (idxLast == dataMahasiswa.length - 1) {
            System.out.println("Array sudah penuh, tidak bisa menambah data");
            return;
        }
        idxLast++;
        dataMahasiswa[idxLast] = data;
    }

    void populateData (Mahasiswa21 dataMhs[], int idxLast){
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart){
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2*idxStart+1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2*idxStart+2);
            }
        }
    }

    public void traversePreOrder(int idxStart) {
    if (idxStart <= idxLast) {
        if (dataMahasiswa[idxStart] != null) {
            dataMahasiswa[idxStart].tampilInformasi();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
}
}
