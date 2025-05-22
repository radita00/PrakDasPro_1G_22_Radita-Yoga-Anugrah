package doublelinkedlist;

public class NodeVaksin21 {
    int nomor;
    String nama;
    NodeVaksin21 prev,next;

    NodeVaksin21 (NodeVaksin21 prev, int nomor, String nama, NodeVaksin21 next){
        this.prev = prev;
        this.nomor = nomor;
        this.nama = nama;
        this.next = next;
    }
}
