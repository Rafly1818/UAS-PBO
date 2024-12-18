package Kuis4.Soal4.Mamalia;

import Kuis4.Soal4.Abstract.Animal;

public class Mamalia extends Animal {
    private String jalan;
    private Boolean bisaMelahirkan;
    private int jumlahAnak;

    public Mamalia(String nama, int ukuran) {
        super(nama, ukuran);
    }

    public void setJalan(String jalan) { this.jalan = jalan; }
    public String getJalan() { return jalan; }

    public void setBisaMelahirkan(Boolean bisaMelahirkan) { this.bisaMelahirkan = bisaMelahirkan; }
    public Boolean getBisaMelahirkan() { return bisaMelahirkan; }

    public void setJumlahAnak(int jumlahAnak) { this.jumlahAnak = jumlahAnak; }
    public int getJumlahAnak() { return jumlahAnak; }

    @Override
    public void setNama(String nama) { this.nama = nama; }
    @Override
    public String getNama() { return nama; }

    @Override
    public void setUkuran(int ukuran) { this.ukuran = ukuran; }
    @Override
    public int getUkuran() { return ukuran; }

    @Override
    public void setSifat(String sifat) { this.sifat = sifat; }
    @Override
    public String getSifat() { return sifat; }
}
