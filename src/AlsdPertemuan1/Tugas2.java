package AlsdPertemuan1;
import java.util.Scanner;
public class Tugas2 {
    static void tempilanMenu(){
        System.out.println("PILIH MENU HITUNG");
        System.out.println("1. Volume\n2. Luas Permukaan\n3. Keliling\n4. Keluar");
    }
    static int volume(int rusuk){
        int vol = rusuk * rusuk * rusuk;
        return vol;
    }
    static int luasPermukaan(int rusuk){
        int lp = rusuk * rusuk * 6;
        return lp;
    }
    static int keliling(int rusuk){
        int kl = rusuk * 12;
        return kl;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang rusuk kubus: ");
        int rusuk = input.nextInt();

        while (true) {
        tempilanMenu();
        System.out.print("Pilih menu: ");
        int pilih = input.nextInt();

        if (pilih==1) {
            System.out.println("==========================");
            System.out.println(volume(rusuk));
            System.out.println("==========================");
        } else if (pilih==2) {
            System.out.println("==========================");
            System.out.println(luasPermukaan(rusuk));
            System.out.println("==========================");
        } else if (pilih==3) {
            System.out.println("==========================");
            System.out.println(keliling(rusuk));
            System.out.println("==========================");
        } else if (pilih==4) {
            break;
        }
        }
    }
}
