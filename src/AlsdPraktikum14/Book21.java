package AlsdPraktikum14;

public class Book21 {
    public String isbn;
    public String title;

    public Book21(){

    }

    public Book21(String isbn, String title){
        this.isbn = isbn;
        this.title = title;
    }

    public String toString(){
        return "ISBN: " + this.isbn + " Title: " + this.title;
    }
}
