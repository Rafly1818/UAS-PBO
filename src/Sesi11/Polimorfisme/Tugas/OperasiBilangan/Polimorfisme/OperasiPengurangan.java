package Sesi11.Polimorfisme.Tugas.OperasiBilangan.Polimorfisme;

public class OperasiPengurangan extends OperasiBilangan {

    @Override
    protected void tampil() {
        c = a - b;
        System.out.println("Pengurangan: " +a+ "-" +b+ "=" +c);
    }
}