package P2Jobsheet10;

public class AntrianPersetujuanKRS21 {
    Mahasiswa21 [] data;
    int front;
    int rear;
    int size;
    int max;
    int terverif;
    
    public AntrianPersetujuanKRS21 (int max){
        this.max = max;
        this.data = new Mahasiswa21[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.terverif = 0;
    }
    public boolean isEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isFull(){
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    public void lihatDuaTerdepan(){
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
            data[front+1].tampilkanData();
        }
    }
    public void tampilkanSemua(){
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }
    public void clear(){
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }
    public void enqueue(Mahasiswa21 mhs){
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa");
        } else {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk ke antrian");
        }
    }
    public Mahasiswa21 dequeue(){
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        Mahasiswa21 mhs = data[front];
        front = (front + 1) % max;
        size--;
        terverif++;
        return mhs;
    }
    public int getJumlahAntrian(){
        return size;
    }
    public void lihatPalingbelakang(){
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa paling belakang: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }
    public void layaniDuaMahasiswa(){
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa, tidak dapat memanggil 2 mahasiswa sekaligus.");
            return;
        }
        
        System.out.println("Memanggil 2 mahasiswa untuk proses KRS:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
    
        Mahasiswa21 mhs1 = dequeue();
        mhs1.tampilkanData();
    
        Mahasiswa21 mhs2 = dequeue();
        mhs2.tampilkanData();
    }
    public int jumlahTerverif(){
        return terverif;
    }
    public int jumlahBelumTerverif(){
        int jmlMahasiswa = (30 - terverif);
        return jmlMahasiswa;
    }
}
