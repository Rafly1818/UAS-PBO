package Kuis;

public class Main {
    public static void main(String[] args) {
        // Bagian 1: Alat Tulis
        // Membuat objek alat tulis sesuai soal
        AlatTulis bolpoint = new AlatTulis("Bolpoint", 10, 2000);
        AlatTulis pensil = new AlatTulis("Pensil", 10, 1000);
        AlatTulis penghapus = new AlatTulis("Penghapus", 10, 500);

        // Menampilkan header
        System.out.println("\n===============Alat Tulis===============\n");

        // Menampilkan data masing-masing alat tulis
        bolpoint.tampilkanData();
        pensil.tampilkanData();
        penghapus.tampilkanData();

        // Menghitung dan menampilkan total keseluruhan
        double totalInventaris = bolpoint.ambilHargaTotal() + 
                               pensil.ambilHargaTotal() + 
                               penghapus.ambilHargaTotal();

        System.out.println("\nTotal Nilai Inventaris: Rp. " + totalInventaris);

        // Bagian 2: Perpustakaan
        System.out.println("\n=================Perpustakaan===================\n");
        Perpustakaan perpus = new Perpustakaan();
        
        // Menambah buku
        perpus.tambahBuku(new Buku("Harry Potter", "J.K. Rowling", 3));
        perpus.tambahBuku(new Buku("Lord of the Rings", "J.R.R. Tolkien", 2));
        perpus.tambahBuku(new Buku("Sherlock Holmes", "Arthur Conan Doyle", 4));
        
        // Menampilkan daftar buku awal
        perpus.tampilkanBuku();
        
        // Meminjam buku
        perpus.pinjamBuku("Harry Potter", "John");
        perpus.pinjamBuku("Lord of the Rings", "Jane");
        
        // Menampilkan daftar setelah peminjaman
        perpus.tampilkanBuku();
    }
}