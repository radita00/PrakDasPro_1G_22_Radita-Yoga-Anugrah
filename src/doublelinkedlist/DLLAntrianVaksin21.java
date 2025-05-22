package doublelinkedlist;

public class DLLAntrianVaksin21 {
    NodeVaksin21 head,tail;
    int size;

    public DLLAntrianVaksin21(){
        head = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void enqueue (int nomor, String nama){
        NodeVaksin21 newNodeVaksin21 = new NodeVaksin21(null, nomor, nama, null);
        if (isEmpty()) {
            head = tail = newNodeVaksin21;
        } else {
            tail.next = newNodeVaksin21;
            head.prev = tail;
            tail = newNodeVaksin21;
        }
        size ++;
    }
    public void dequeue(){
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println(head.nama + " telah selesai divaksinasi");
            head = head.next;
            if (head!=null) {
                head.prev = null;
            } else {
                tail = null;
            }
            size--;
        }
    }
    public void print(){
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("++++++++++++++++++++++++++");
            System.out.println("Daftar Pengantir Vaksin");
            System.out.println("++++++++++++++++++++++++++");
            System.out.println("|No.\t" + "|Nama\t|"  );
            NodeVaksin21 current = head;
            while (current != null) {
                System.out.println("|"+ current.nomor+"\t|"+current.nama+"\t|");
                current = current.next;
            }
            System.out.println("Sisa Antrian: " + size);
        }
    }
}
