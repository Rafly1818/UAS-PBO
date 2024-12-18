package Kuis3.Soal1.Inheritance;

public class Dosen {
    protected String nik;
    protected String nama;

    // Konstruktor
    public Dosen(String nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }

    // Method untuk mendapatkan NIK
    public String getNIK() {
        return nik;
    }

    // Method untuk mendapatkan Nama
    public String getNama() {
        return nama;
    }

    // Method untuk menampilkan informasi Dosen
    public void view() {
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
    }
}