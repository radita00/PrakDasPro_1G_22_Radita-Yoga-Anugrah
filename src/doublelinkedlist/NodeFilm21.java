package doublelinkedlist;

public class NodeFilm21 {
    Film21 film;
    NodeFilm21 next,prev;

    public NodeFilm21(NodeFilm21 prev, Film21 film, NodeFilm21 next){
        this.prev = prev;
        this.film = film;
        this.next = next;
    }
}
