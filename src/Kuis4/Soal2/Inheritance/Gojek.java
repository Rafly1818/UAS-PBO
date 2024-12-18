package Kuis4.Soal2.Inheritance;

import Kuis4.Soal2.Interfaces.Transportasi;

public class Gojek implements Transportasi {
    protected int harga;
    protected int id;

    // Konstruktor default
    public Gojek() {
        this.harga = 0;
        this.id = 0;
    }

    // Implementasi metode tampil
    @Override
    public void tampil() {
        System.out.println("ID Gojek: " + id);
        System.out.println("Harga: " + harga);
    }

    // Implementasi metode setData
    @Override
    public void setData() {
        this.id = 101;
        this.harga = 50000;
    }

    // Implementasi metode getId
    @Override
    public int getId() {
        return id;
    }
}