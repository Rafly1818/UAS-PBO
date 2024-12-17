package Sesi12.Polimorfisme.Tugas.OperasiBilangan1.Polimorfisme;

public class PrintOperasi {
    public void cetakSemua(OperasiBilangan[] OB, double a, double b) {
        for (OperasiBilangan operasi : OB) {
            operasi.set_A(a);
            operasi.set_B(b);
            operasi.tampil();
        }
    }
}