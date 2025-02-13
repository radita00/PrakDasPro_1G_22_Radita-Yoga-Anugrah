package AlsdPertemuan1;

public class PrakFungsi {
    static void tampilan (int [][] stock, int [] harga){
        for (int i = 0; i < harga.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < harga.length; j++) {
                totalPendapatan += stock[i][j] * harga [j];
            }
            System.out.println("Royal Garden " + (i+1) + " Rp: " + totalPendapatan);
        }
    }
    static void penguranganstock (String [] nama, int [][] stock,int [] pengurangan){
        for (int i = 3; i < stock.length; i++) {
            System.out.println("Royal Garden " + (i+1) + ": ");
            for (int j = 0; j < stock.length; j++) {
                stock[i][j] -= pengurangan[j]; 
                System.out.print(nama[j] + "= " + stock[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] stockBunga = {
            {10,5,15,7},
            {6,11,9,12},
            {2,10,10,5},
            {5,7,12,9}};
        String [] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        int [] hargaBunga = {75000,50000,60000,10000};

        System.out.println("=================================================");
        System.out.println("Pendapatan setiap cabang jika bunga habis terjual");
        System.out.println("=================================================");
       tampilan(stockBunga, hargaBunga);

       int [] bungamati = {1,2,0,5}; 

       System.out.println("=================================================");
       System.out.println("Jumlah Stock pada cabang 4");
       System.out.println("=================================================");
       penguranganstock(namaBunga, stockBunga, bungamati);
       System.out.println("=================================================");
    }
}
