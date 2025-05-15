package AlsdPertemuan12;
import java.util.Scanner;
public class SLLMain21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList21 sll = new SingleLinkedList21();

        System.out.println("== Linked List ==");
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i+1)+": ");
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = Double.parseDouble(sc.nextLine());

            Mahasiswa21 mhs = new Mahasiswa21(nim, nama, kelas, ipk);
            sll.addLast(mhs);
        }
        sll.print();
    }
}
