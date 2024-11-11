package Sesi6;

class Mahasiswa {
    public String nama;              // Public: bisa diakses dari mana saja
    protected int usia;              // Protected: bisa diakses dari dalam package dan subclass
    private String jurusan;          // Private: hanya bisa diakses dalam kelas ini

    // Constructor
    public Mahasiswa(String nama, int usia, String jurusan) {
        this.nama = nama;
        this.usia = usia;
        this.jurusan = jurusan;
    }

    // Getter untuk atribut private jurusan
    public String getJurusan() {
        return jurusan;
    }

    // Setter untuk atribut private jurusan
    public void setJurusan(String jurusanBaru) {
        this.jurusan = jurusanBaru;
    }

    // Metode untuk menampilkan informasi
    public void tampilkanInfo() {
        System.out.println("NAMA : " + nama);
        System.out.println("USIA : " + usia);
        System.out.println("JURUSAN : " + jurusan);
    }
}

// Kelas utama untuk menjalankan program
public class MhsTester {
    public static void main(String[] args) {

        
    }
}