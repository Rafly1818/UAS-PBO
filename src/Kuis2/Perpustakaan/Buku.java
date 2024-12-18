package Kuis3.Perpustakaan;

public class Buku {
    private String judul;
    private String penulis;
    private int stok;
    private String peminjam;
    
    public Buku(String judul, String penulis, int stok) {
        this.judul = judul;
        this.penulis = penulis;
        this.stok = stok;
        this.peminjam = "";
    }
    
    public String getJudul() { return judul; }
    public String getPenulis() { return penulis; }
    public int getStok() { return stok; }
    public String getPeminjam() { return peminjam; }
    
    public void setStok(int stok) { this.stok = stok; }
    public void setPeminjam(String peminjam) { this.peminjam = peminjam; }
    
    @Override
    public String toString() {
        return "Judul: " + judul + " | Penulis: " + penulis + " | Stok: " + stok +
               (peminjam.isEmpty() ? "" : " | Dipinjam oleh: " + peminjam);
    }
}
