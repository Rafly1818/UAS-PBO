package Kuis4.Soal1.Inheritance;

public class Rektor extends Dosen {
    private int tahunMasuk;

    // Konstruktor
    public Rektor(String nik, String nama, int tahunMasuk) {
        super(nik, nama);
        this.tahunMasuk = tahunMasuk;
    }

    // Method untuk mendapatkan Tahun Masuk
    public int getTahunMasuk() {
        return tahunMasuk;
    }

    // Method untuk menampilkan informasi Rektor
    public void viewRektor() {
        super.view();
        System.out.println("Tahun Masuk: " + tahunMasuk);
    }
}