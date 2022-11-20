public class Mahasiswa {
    private int id;
    private String Nama;
    private String Kelas;
    private int tglMasuk;

    public Mahasiswa(int id, String Nama, String Kelas, int tglMasuk) {
        //constructor//
        this.id = id;
        this.Nama = Nama;
        this.Kelas = Kelas;
        this.tglMasuk = tglMasuk;
    }


    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getKelas() {
        return Kelas;
    }

    public void setKelas(String Kelas) {
        this.Kelas = Kelas;
    }

    public int getTglMasuk() {
        return tglMasuk;
    }

    public void setTglMasuk(int tglMasuk) {
        this.tglMasuk = tglMasuk;
    }

    public String toString() {
        return "Mahasiswa{" +
                "id ='" + id + '\'' +
                ", Nama ='" + Nama + '\'' +
                ", Kelas ='" + Kelas + '\'' +
                ", Tanggal Masuk ='" + tglMasuk + '\'' +
                '}';

    }

}
