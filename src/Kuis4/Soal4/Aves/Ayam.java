package Kuis4.Soal4.Aves;

public final class Ayam extends Aves {
    private String jenisAyam;
    private Boolean bisaDiadu;

    public Ayam(String nama, int ukuran) {
        super(nama, ukuran);
    }

    public void setJenisAyam(String jenisAyam) { this.jenisAyam = jenisAyam; }
    public String getJenisAyam() { return jenisAyam; }

    public void setBisaDiadu(Boolean bisaDiadu) { this.bisaDiadu = bisaDiadu; }
    public Boolean getBisaDiadu() { return bisaDiadu; }
}
