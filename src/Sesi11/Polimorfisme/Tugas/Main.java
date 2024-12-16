package Sesi11.Polimorfisme.Tugas;

public class Main {
    public static void main(String[] args) {
        // Array of operation objects
        OperasiBilanganAbs[] operasiBilangan = {
            new OperasiPenjumlahan(),
            new OperasiPengurangan(),
            new OperasiPerkalian(),
            new OperasiPembagian()
        };

        // Cetak hasil operasi
        OperasiBilanganAbsCetak cetak = new OperasiBilanganAbsCetak();
        cetak.cetakSemua(operasiBilangan, 6.5, 0.5);
    }
}