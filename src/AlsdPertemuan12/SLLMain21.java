package AlsdPertemuan12;

public class SLLMain21 {
    public static void main(String[] args) {
        SingleLinkedList21 sll = new SingleLinkedList21();

        Mahasiswa21 mhs1 = new Mahasiswa21("2211001", "Alvaro", "1A", 3.8);
        Mahasiswa21 mhs2 = new Mahasiswa21("2211002", "Budi", "2B", 3.6);
        Mahasiswa21 mhs3 = new Mahasiswa21("2211003", "Citra", "3C", 3.9);
        Mahasiswa21 mhs4 = new Mahasiswa21("2211004", "Dirga", "4D", 3.7);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.InsertAt(2, mhs2);
        sll.print();
    }
}
