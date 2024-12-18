package Kuis3.Perpustakaan;

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

