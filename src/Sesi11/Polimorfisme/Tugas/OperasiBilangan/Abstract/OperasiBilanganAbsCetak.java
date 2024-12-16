package Sesi11.Polimorfisme.Tugas.OperasiBilangan.Abstract;

public final class OperasiBilanganAbsCetak {
    public void cetakSemua(OperasiBilanganAbs[] OB, double a, double b) {
        for (OperasiBilanganAbs operasi : OB) {
            operasi.set_A(a);
            operasi.set_B(b);
            operasi.set_C();
            operasi.tampil();
        }
    }
}