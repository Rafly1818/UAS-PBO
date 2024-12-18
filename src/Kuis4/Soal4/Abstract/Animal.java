package Kuis4.Soal4.Abstract;

public abstract class Animal {
    protected String nama, sifat;
    protected int ukuran;

    public Animal(String nama, int ukuran) {
        this.nama = nama;
        this.ukuran = ukuran;
    }

    public abstract void setNama(String nama);
    public abstract String getNama();
    public abstract void setUkuran(int ukuran);
    public abstract int getUkuran();
    public abstract void setSifat(String sifat);
    public abstract String getSifat();
}