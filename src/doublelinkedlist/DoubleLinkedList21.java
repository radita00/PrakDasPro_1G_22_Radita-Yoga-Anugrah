package doublelinkedlist;

public class DoubleLinkedList21 {
    Node21 head;
    int size;

    public DoubleLinkedList21(){
        head = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(int item){
        if (isEmpty()) {
            head = new Node21(null, item, null);
        } else {
            Node21 newNode21 = new Node21(null, item, head);
            head.prev = newNode21;
            head = newNode21;
        }
        size ++;
    }
    public void addLast (int item){
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node21 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node21 newNode21 = new Node21(current, item, null);
            current.next = newNode21;
            size ++;
        }
    }
    public void add (int item, int index)throws Exception{
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node21 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node21 newNode21 = new Node21(null, item, current);
                current.prev = newNode21;
                head = newNode21;
            } else {
                Node21 newNode21 = new Node21(current.prev, item, current);
                newNode21.prev = current.prev;
                newNode21.next = current;
                current.prev.next = newNode21;
                current.prev = newNode21;
            }
        }
        size++;
    }
    public int size(){
        return size;
    }
    public void clear(){
        head = null;
        size = 0;
    }
    public void print(){
        if (!isEmpty()) {
            Node21 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
        public void removeFirst () throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void removeLast () throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node21 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }
    public void remove (int index) throws Exception{
        if (isEmpty() || index >= size) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node21 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev=current.prev;
            }
            size--;
        }
    }
    public int getFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        return head.data;
    }
    public int getLast() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        Node21 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public int get(int index) throws Exception{
        if (isEmpty() || index >= size) {
            throw new Exception("Linked List Kosong");
        }
        Node21 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}
