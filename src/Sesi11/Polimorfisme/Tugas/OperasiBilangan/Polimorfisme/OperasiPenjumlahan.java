package Sesi11.Polimorfisme.Tugas.OperasiBilangan.Polimorfisme;

public class OperasiPenjumlahan extends OperasiBilangan {

    @Override
    protected void tampil() {
        c = a + b;
        System.out.println("Penjumlahan: " +a+ "+" +b+ "=" +c);
    }
}