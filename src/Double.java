public class Double {
    private Input head;
    private Input tail;
    private int size;

    public void addToFront(Mahasiswa mahasiswa) {
        Input node = new Input(mahasiswa);

        if (head == null) {
            tail = node;
        }
        else {
            head.setPrev(node);
            node.setNext(head);
        }

        head = node;
        size++;
    }

    public void addToEnd(Mahasiswa mahasiswa) {
        Input node = new Input(mahasiswa);
        if (tail == null) {
            head = node;
        }
        else {
            tail.setNext(node);
            node.setPrev(tail);
        }

        tail = node;
        size++;
    }

    public Input removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        Input removedNode = head;

        if (head.getNext() == null) {
            tail = null;
        }
        else {
            head.getNext().setPrev(null);
        }

        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public Input removeFromEnd() {
        if (isEmpty()) {
            return null;
        }

        Input removedNode = tail;

        if (tail.getPrev() == null) {
            head = null;
        }
        else {
            tail.getPrev().setNext(null);
        }

        tail = tail.getPrev();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        Input current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}