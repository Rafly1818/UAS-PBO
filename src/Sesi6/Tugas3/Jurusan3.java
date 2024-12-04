package Sesi6.Tugas3;

public class Jurusan3 {
    private String nama;
    private String kode;

    // Constructor
    public Jurusan3(String nama, String kode) {
        this.nama = nama;
        this.kode = kode;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    // Metode untuk menampilkan info Jurusan
    public void displayInfo() {
        System.out.println("Nama Jurusan: " + nama);
        System.out.println("Kode Jurusan: " + kode);
    }
}

