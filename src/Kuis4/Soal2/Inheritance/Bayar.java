package Kuis4.Soal2.Inheritance;

public class Bayar extends Gojek {
    private int jarak;
    private int total;
    private String nama;

    // Konstruktor default
    public Bayar() {
        this.jarak = 0;
        this.total = 0;
        this.nama = "";
    }

    // Konstruktor dengan parameter
    public Bayar(int id, int jarak, int total, String nama) {
        this.id = id;
        this.jarak = jarak;
        this.total = total;
        this.nama = nama;
    }

    // Override metode tampil
    @Override
    public void tampil() {
        System.out.println("ID Gojek: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Jarak: " + jarak + " km");
        System.out.println("Total Pembayaran: " + total + " IDR");
    }

    // Override metode setData
    @Override
    public void setData() {
        this.jarak = 10;
        this.total = 100000;
        this.nama = "Budi Santoso";
    }

    // Override metode getId
    @Override
    public int getId() {
        return id;
    }
}
