package Kuis3.AlatTulis;

public class AlatTulis {
    private String nama;
    private int stok;
    private double hargaSatuan;
    private double hargaTotal;

    public AlatTulis(String nama, int stok, double hargaSatuan) {
        this.nama = nama;
        this.stok = stok;
        this.hargaSatuan = hargaSatuan;
        this.hargaTotal = hitungTotal();
    }

    public double hitungTotal() {
        return stok * hargaSatuan;
    }

    // Method untuk menampilkan data
    public void tampilkanData() {
        System.out.println("\nNama Alat Tulis : " + nama);
        System.out.println("Stok : " + stok);
        System.out.println("Harga Satuan : Rp. " + hargaSatuan);
        System.out.println("Harga Total : Rp. " + hargaTotal);
    }

    // Getter (Pengambil nilai)
    public String ambilNama() { return nama; }
    public int ambilStok() { return stok; }
    public double ambilHargaSatuan() { return hargaSatuan; }
    public double ambilHargaTotal() { return hargaTotal; }

    // Setter (Pengatur nilai)
    public void aturNama(String nama) { this.nama = nama; }
    public void aturStok(int stok) { 
        this.stok = stok;
        this.hargaTotal = hitungTotal();
    }
    public void aturHargaSatuan(double hargaSatuan) { 
        this.hargaSatuan = hargaSatuan;
        this.hargaTotal = hitungTotal();
    }
}
