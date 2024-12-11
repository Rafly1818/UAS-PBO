package Sesi11.Polimorfisme.PolimorfismeDinamis.Gambar;

public class Lingkaran extends Bentuk {
    protected void gambar() {
        System.out.println("subclass -> Menggambar LIngkaran");
    }
    protected void hapus() {
        System.out.println("subclass -> Menghapus Gambar Lingkaran");
    }
}