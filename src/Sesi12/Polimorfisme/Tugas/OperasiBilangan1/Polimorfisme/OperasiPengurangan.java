package Sesi12.Polimorfisme.Tugas.OperasiBilangan1.Polimorfisme;

public class OperasiPengurangan extends OperasiBilangan {

    @Override
    protected void tampil() {
        c = a - b;
        System.out.println("Pengurangan: " +a+ "-" +b+ "=" +c);
    }
}