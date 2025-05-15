package AlsdPertemuan12;

public class AntrianLayanan21 {
    NodeAntrian21 head, tail;
    int max;

    boolean IsEmpty() {
        return (head == null);
    }
    boolean isFull() {
        return size() >= max;
    }
    public void clear() {
        head = null;
        tail = null;
        System.out.println("Antrian telah dikosongkan");
    }
    public int size() {
        int count = 0;
        NodeAntrian21 tmp = head;
        while (tmp != null) {
            count++;
            tmp = tmp.next;
        }
        return count;
    }
    public void enqueue(Mahasiswa21 input) {
        if (isFull()) {
            System.out.println("Antrian penuh");
            return;
        }
        NodeAntrian21 ndInput = new NodeAntrian21(input, null);
        if (IsEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }
    public void dequeue() {
        NodeAntrian21 tmp = head;
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Mahasiswa keluar antrian " + tmp.data.nama);
        tmp = tmp.next;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }
    public void peekHead() {
        NodeAntrian21 tmp = head;
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa terdepan: " + tmp.data.nama);
        }
    }
    public void peekTail() {
        NodeAntrian21 tmp = tail;
        if (IsEmpty()) {
            System.out.println("Antrian Kosong");
        } else {
            System.out.println("Mahasiswa terakhir: " + tmp.data.nama);
        }
    }
    public void print() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Isi antrian: ");
        NodeAntrian21 tmp = head;
        while (tmp != null) {
            tmp.data.tampilInformasi();
            tmp = tmp.next;
        }
        System.out.println("");
    }
}