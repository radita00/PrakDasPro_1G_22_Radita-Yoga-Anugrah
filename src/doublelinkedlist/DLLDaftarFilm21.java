package doublelinkedlist;

public class DLLDaftarFilm21 {
    NodeFilm21 head, tail;

    public void tambahAwal(Film21 film) {
        if (head == null) {
            head = tail = new NodeFilm21(null, film, null);
        } else {
            NodeFilm21 baru = new NodeFilm21(null, film, head);
            head.prev = baru;
            head = baru;
        }
    }

    public void tambahAkhir(Film21 film) {
        if (tail == null) {
            head = tail = new NodeFilm21(null, film, null);
        } else {
            NodeFilm21 baru = new NodeFilm21(tail, film, null);
            tail.next = baru;
            tail = baru;
        }
    }

    public void tambahIndex(int index, Film21 film) {
        if (index <= 0) {
            tambahAwal(film);
            return;
        }

        NodeFilm21 current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            tambahAkhir(film);
        } else {
            NodeFilm21 baru = new NodeFilm21(current, film, current.next);
            current.next.prev = baru;
            current.next = baru;
        }
    }

    public void hapusPertama() {
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void hapusTerakhir() {
        if (tail == null) return;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void hapusID(String id) {
        NodeFilm21 current = head;
        while (current != null && !current.film.id.equals(id)) {
            current = current.next;
        }

        if (current == null) return;

        if (current == head) {
            hapusPertama();
        } else if (current == tail) {
            hapusTerakhir();
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    public void cetak() {
        NodeFilm21 current = head;
        while (current != null) {
            current.film.tampilInformasi();
            System.out.println("----------------------------");
            current = current.next;
        }
    }

    public void cariID(String id) {
        NodeFilm21 current = head;
        while (current != null) {
            if (current.film.id.equals(id)) {
                System.out.println("Film ditemukan:");
                current.film.tampilInformasi();
                return;
            }
            current = current.next;
        }
        System.out.println("Film dengan ID " + id + " tidak ditemukan.");
    }

    public void urutRatingDesc() {
        if (head == null) return;

        for (NodeFilm21 i = head; i != null; i = i.next) {
            for (NodeFilm21 j = i.next; j != null; j = j.next) {
                if (i.film.rating < j.film.rating) {
                    Film21 temp = i.film;
                    i.film = j.film;
                    j.film = temp;
                }
            }
        }
    }
}
