# LAPORAN HASIL UAS

**PEMROGRAMAN BERORIENTASI OBJEK**

**CR002**

Dosen Pengampu: Arief Ichwani

Disusun oleh:

- Rafly Akbar Ravsanjani 20230801401
- Kurniawan 20230801054
- Idham Kholid Nur Azizi 20230801192

**PROGRAM STUDI TEKNIK INFORMATIKA**

**FAKULTAS ILMU KOMPUTER**

**UNIVERSITAS ESA UNGGUL TANGERANG**

**2024**

---

# Laporan Sistem Manajemen Cafe

## A. Cafe Shop Management System

**Nama Proyek:**  
Sistem Manajemen Cafe dengan Java NetBeans

## B. Pendahuluan

### 1. Latar Belakang

Cafe Shop merupakan sebuah cafe yang menawarkan berbagai makanan dan minuman serta tempat yang nyaman untuk berkumpul. Untuk meningkatkan efisiensi operasional dan layanan pelanggan, dibutuhkan sistem manajemen yang memungkinkan pengelolaan produk, transaksi, dan laporan secara efektif. Oleh karena itu, sistem ini dikembangkan menggunakan Java dengan platform NetBeans dan alat bantu lainnya.

### 2. Tujuan

- Mengembangkan sistem yang dapat mempermudah administrasi cafe.
- Meningkatkan akurasi dan kecepatan dalam pemrosesan transaksi.
- Menyediakan laporan yang informatif untuk pengambilan keputusan.
- Memastikan keamanan data pengguna melalui sistem login untuk admin.

## C. Metodologi

### 1. Alat dan Bahan

- **Bahasa Pemrograman:** Java
- **IDE:** NetBeans
- **Database:** MySQL
- **Framework:**
  - **JDBC:** untuk koneksi database
  - **FXML:** Untuk desain antarmuka pengguna berbasis JavaFX
  - **Jasper Reports:** Untuk menghasilkan laporan professional dan dinamis
  - **Scene Builder:** Alat untuk mendesain antarmuka pengguna secara visual menggunakan FXML

### 2. Langkah Pengembangan

- **Analisis Kebutuhan Pengguna:** Mengumpulkan informasi mengenai kebutuhan sistem dari pengguna potensial.
- **Desain Sistem:** Membuat flowchart dan wireframe menggunakan FXML dan Scene Builder.
- **Pengembangan:** Mengimplementasikan fitur dengan Java, menggunakan JDBC untuk interaksi database dan Jasper Reports untuk laporan.
- **Pengujian:** Melakukan pengujian fungsionalitas, termasuk login admin, pengelolaan produk, transaksi, dan laporan.
- **Implementasi dan Pelatihan Pengguna:** Mengadakan sesi pelatihan untuk staff cafe mengenai penggunaan sistem.

## D. Deskripsi Sistem

### 1. Fitur Utama

#### a. Sistem Login

- **Login Admin:**
  - Fitur untuk admin cafe agar dapat masuk ke dalam sistem menggunakan username dan password.
  - Keamanan ditingkatkan dengan hashing password dan sesi manajemen.

#### b. Manajemen Produk

- **CRUD (Create, Read, Update, Delete):**
  - Menambahkan produk baru (makanan/minuman), mengedit informasi produk, dan menghapus produk yang tidak lagi tersedia.
  - Menampilkan daftar produk dengan opsi pencarian dan filter berdasarkan kategori.

#### c. Transaksi Penjualan

- **Pemrosesan Pemesanan:**
  - Fitur untuk membuat pesanan baru, menghitung total biaya, dan memproses pembayaran (tunai/kartu).
  - Menyediakan struk transaksi yang dapat dicetak menggunakan Jasper Reports.

#### d. Laporan Keuangan

- **Pembuatan Laporan:**
  - Menghasilkan laporan penjualan harian, mingguan, dan bulanan, serta analisis menu terlaris.
  - Menampilkan grafik dan statistik untuk pemantauan kinerja cafe.

### 2. Antarmuka Pengguna

- Desain antarmuka menggunakan FXML dan Scene Builder untuk tampilan yang intuitif dan responsif.
- Screenshots dari setiap layar (login, manajemen produk, transaksi).

## E. Hasil dan Pembahasan

### 1. Hasil Pengujian

- Pengujian fungsionalitas login admin berhasil dengan sistem keamanan yang memadai.
- Pengelolaan produk dapat dilakukan dengan mudah dan cepat.
- Proses transaksi berjalan lancar dan laporan dihasilkan dengan akurat.

### 2. Kendala yang Dihadapi

- Beberapa bug awal dalam koneksi database berhasil diatasi.
- Penggunaan laporan Jasper membutuhkan pemahaman yang lebih dalam tentang pengaturannya.

## F. Kesimpulan dan Saran

### 1. Kesimpulan

Sistem Manajemen Cafe yang dikembangkan telah berhasil memenuhi kebutuhan operasional dan memberikan kemudahan dalam pengelolaan cafe. Fitur login untuk admin menjamin keamanan data dan akses terbatas pada informasi sensitif.

### 2. Saran

- Perbaikan antarmuka pengguna agar lebih menarik dan mudah digunakan.
- Menambahkan fitur untuk manajemen inventaris dan analisis lebih mendalam terkait preferensi pelanggan.
- Menerapkan pelatihan rutin bagi staff untuk meningkatkan pemahaman teknologi dan penggunaan sistem.

## G. Lampiran

- Kode sumber program.
- Dokumentasi penggunaan sistem, termasuk manual pemakaian dan troubleshooting.
- Diagram alur sistem dan model database.

---

### Gambar 1.2 Menu Admin

![Menu Admin](images/menu_admin.png)

### Gambar 1.3 Menu Makanan & Minuman

![Menu Makanan & Minuman](images/menu_makanan_minuman.png)

### Gambar 1.4 Menu Pembayaran

![Menu Pembayaran](images/menu_pembayaran.png)

### Gambar 1.5 Menu Laporan

![Menu Laporan](images/menu_laporan.png)