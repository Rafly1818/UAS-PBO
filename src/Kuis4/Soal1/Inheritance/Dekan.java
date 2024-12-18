package Kuis4.Soal1.Inheritance;

public class Dekan extends Dosen {
    private String fakultas;

    // Konstruktor
    public Dekan(String nik, String nama, String fakultas) {
        super(nik, nama);
        this.fakultas = fakultas;
    }

    // Method untuk mendapatkan Fakultas
    public String getFakultas() {
        return fakultas;
    }

    // Method untuk menampilkan informasi Dekan
    public void viewDekan() {
        super.view();
        System.out.println("Fakultas: " + fakultas);
    }
}