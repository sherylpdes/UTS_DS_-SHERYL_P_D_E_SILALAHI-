public class Input {
    private Mahasiswa mahasiswa;
    private Input next;
    private Input prev;

    public Input( Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setEmployee(Mahasiswa mahasiswa ) {
        this.mahasiswa = mahasiswa;
    }

    public Input getNext() {
        return next;
    }

    public void setNext(Input next) {
        this.next = next;
    }

    public Input getPrev() {
        return prev;
    }

    public void setPrev(Input prev) {
        this.prev = prev;
    }
    public String toString(){
        return mahasiswa.toString();
    }
}
