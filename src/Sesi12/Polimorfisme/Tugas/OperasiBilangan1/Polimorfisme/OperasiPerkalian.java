package Sesi12.Polimorfisme.Tugas.OperasiBilangan1.Polimorfisme;

public class OperasiPerkalian extends OperasiBilangan {

    @Override
    protected void tampil() {
        c = a * b;
        System.out.println("Perkalian: " +a+ "*" +b+ "=" +c);
    }
}