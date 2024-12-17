package Sesi12.Polimorfisme.Tugas.OperasiBilangan1.Polimorfisme;

public class OperasiPenjumlahan extends OperasiBilangan {

    @Override
    protected void tampil() {
        c = a + b;
        System.out.println("Penjumlahan: " +a+ "+" +b+ "=" +c);
    }
}