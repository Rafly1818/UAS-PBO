package Kuis4.Soal2;

import Kuis4.Soal2.Inheritance.Bayar;
import Kuis4.Soal2.Inheritance.Gojek;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Gojek
        Gojek gojek = new Gojek();
        System.out.println("Informasi Gojek:");
        gojek.setData();
        gojek.tampil();

        System.out.println();

        // Membuat objek Bayar
        Bayar bayar = new Bayar();
        System.out.println("Informasi Pembayaran:");
        bayar.setData();
        bayar.tampil();
    }
}