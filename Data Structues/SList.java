class SList<T> {
    private int size = 0;
    Node<T> head = null;
    Node<T> tail = null;

    // clear
    public void clear() {
        Node<T> trav = head;
        while (trav != null) {
            Node<T> next = trav.next;
            trav.data = trav.next = null;
            trav = next;
        }
        size = 0;
    }

    // size
    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // add
    public void add(T elem) {
        if (isEmpty()) {
            head = tail = new Node(elem);
        } else {
            tail.next = new Node(elem);
            tail = tail.next;
        }
        size++;
    }

    public void addFirst(T elem) {
        if (isEmpty()) {
            head = tail = new Node(elem);
        } else {
            Node temp = new Node(elem);
            temp.next = head;
            head = temp;
        }
        size++;
    }

    public T peekFirst() {
        if (isEmpty())
            throw new RuntimeException("Empty List");
        return head.data;
    }

    public T peekLast() {
        if (isEmpty())
            throw new RuntimeException("Empty List");
        return tail.data;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new RuntimeException("Empty List");

        head.next = head;
        --size;
        if (isEmpty())
            tail = null;
    }

    public void removeLast() {
        if (isEmpty())
            throw new RuntimeException("Empty List");
        Node trav = head;
        while (trav.next != tail)
            trav = trav.next;

        tail = null;
        tail = trav;
        --size;

    }
}

class Node<T> {
    T data;
    Node next;

    Node() {
    }

    Node(T data) {
        this.data = data;
    }

    Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
}