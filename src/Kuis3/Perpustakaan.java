package Kuis3;

import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<Buku> daftarBuku;
    
    public Perpustakaan() {
        daftarBuku = new ArrayList<>();
    }
    
    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
        System.out.println("Buku \"" + buku.getJudul() + "\" berhasil ditambahkan");
    }
    
    public void pinjamBuku(String judul, String namaPeminjam) {
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                if (buku.getStok() > 0) {
                    buku.setStok(buku.getStok() - 1);
                    buku.setPeminjam(namaPeminjam);
                    System.out.println(namaPeminjam + " berhasil meminjam buku \"" + judul + "\"");
                    return;
                } else {
                    System.out.println("Maaf, stok buku \"" + judul + "\" habis");
                    return;
                }
            }
        }
        System.out.println("Buku \"" + judul + "\" tidak ditemukan");
    }
    
    public void kembalikanBuku(String judul, String namaPeminjam) {
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul) && 
                buku.getPeminjam() != null && 
                buku.getPeminjam().equalsIgnoreCase(namaPeminjam)) {
                buku.setStok(buku.getStok() + 1);
                buku.setPeminjam("");
                System.out.println(namaPeminjam + " berhasil mengembalikan buku \"" + judul + "\"");
                return;
            }
        }
        System.out.println("Data peminjaman tidak ditemukan");
    }
    
    public void tampilkanBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("\nPerpustakaan masih kosong");
            return;
        }
        
        System.out.println("\n=== Daftar Buku Perpustakaan ===");
        System.out.println("--------------------------------");
        for (Buku buku : daftarBuku) {
            System.out.println(buku);
        }
        System.out.println("--------------------------------");
    }
}

class Buku {
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
