package Sesi11.Polimorfisme.Tugas.OperasiBilangan.Polimorfisme;

public class OperasiPerkalian extends OperasiBilangan {

    @Override
    protected void tampil() {
        c = a * b;
        System.out.println("Perkalian: " +a+ "*" +b+ "=" +c);
    }
}