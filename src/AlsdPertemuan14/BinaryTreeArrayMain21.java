package AlsdPertemuan14;

public class BinaryTreeArrayMain21 {
    public static void main(String[] args) {
        BinaryTreeArray21 bta = new BinaryTreeArray21();
        bta.add(new Mahasiswa21("244160121", "Ali", "A", 3.57));
        bta.add(new Mahasiswa21("244160185", "Candra", "C", 3.41));
        bta.add(new Mahasiswa21("244160221", "Badar", "B", 3.75));
        bta.add(new Mahasiswa21("244160220", "Dewi", "B", 3.35));
        bta.add(new Mahasiswa21("244160131", "Devi", "A", 3.48));
        bta.add(new Mahasiswa21("244160205", "Ehsan", "D", 3.61));
        bta.add(new Mahasiswa21("244160170", "Fizi", "B", 3.86));

        System.out.println("\nIn-order traversal mahasiswa:");
        bta.traverseInOrder(0);

        System.out.println("\nPre-order traversal mahasiswa:");
        bta.traversePreOrder(0);
    }
}
