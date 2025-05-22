package doublelinkedlist;

public class Film21 {
    String id;
    String judul;
    float rating;

    public Film21 (String id, String judul, float rating){
        this.id = id;
        this.judul = judul;
        this.rating = rating;
    }
    public void tampilInformasi(){
        System.out.println("Cetak Data");
        System.out.println("ID: " + id);
        System.out.println("Judul Film: " + judul);
        System.out.println("Rating: " + rating);
    }
}
