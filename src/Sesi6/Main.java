package Sesi6;

public class Main {
    public static void main(String[] args) {
        System.out.println("========= DEMONSTRASI VERSI 1: PROGRAM DASAR =========");
        // Membuat objek Mahasiswa1
        Mahasiswa1 mahasiswa1 = new Mahasiswa1("Ahmad", "12345678", 21);
        
        // Mengakses dan menampilkan data Mahasiswa1
        System.out.println("Data awal mahasiswa:");
        mahasiswa1.displayInfo();
        
        // Mengubah data Mahasiswa1
        mahasiswa1.setNama("Budi");
        mahasiswa1.setNim("87654321");
        mahasiswa1.setUsia(22);
        
        // Menampilkan data setelah diubah
        System.out.println("\nData setelah diubah:");
        mahasiswa1.displayInfo();

        System.out.println("\n========= DEMONSTRASI VERSI 2: PROGRAM DENGAN RELASI HAS-A =========");
        // Membuat objek Jurusan2
        Jurusan2 jurusanInformatika = new Jurusan2("Informatika", "IF123");
        
        // Membuat objek Mahasiswa2 dengan Jurusan
        Mahasiswa2 mahasiswa2 = new Mahasiswa2("Ahmad", "12345678", 21, jurusanInformatika);
        
        // Menampilkan data Mahasiswa2 beserta Jurusannya
        System.out.println("Data mahasiswa dengan jurusan Informatika:");
        mahasiswa2.displayInfo();
        
        // Mengubah data Jurusan Mahasiswa2
        Jurusan2 jurusanSistemInformasi = new Jurusan2("Sistem Informasi", "SI456");
        mahasiswa2.setJurusan(jurusanSistemInformasi);
        
        // Menampilkan data setelah perubahan
        System.out.println("\nData setelah pindah jurusan:");
        mahasiswa2.displayInfo();

        System.out.println("\n========= DEMONSTRASI VERSI 3: PROGRAM DENGAN RELASI MANY TO MANY =========");
        // Membuat objek Jurusan3
        Jurusan3 jurusanIF = new Jurusan3("Informatika", "IF123");
        
        // Membuat objek Mahasiswa3
        Mahasiswa3 mahasiswa3_1 = new Mahasiswa3("Ahmad", "12345678", 21, jurusanIF);
        Mahasiswa3 mahasiswa3_2 = new Mahasiswa3("Budi", "87654321", 22, jurusanIF);
        
        // Membuat objek Kelas3
        Kelas3 kelasPemrograman = new Kelas3("Pemrograman Java", "PJ101");
        Kelas3 kelasBasisData = new Kelas3("Basis Data", "BD102");
        
        // Menambahkan Mahasiswa3 ke dalam Kelas3
        kelasPemrograman.addMahasiswa(mahasiswa3_1);
        kelasPemrograman.addMahasiswa(mahasiswa3_2);
        kelasBasisData.addMahasiswa(mahasiswa3_1);
        
        // Menampilkan data Kelas3 dan Mahasiswa3
        System.out.println("Informasi Mahasiswa:");
        mahasiswa3_1.displayInfo();
        System.out.println();
        mahasiswa3_2.displayInfo();
        
        System.out.println("\nInformasi Kelas:");
        kelasPemrograman.displayInfo();
        System.out.println();
        kelasBasisData.displayInfo();
    }
}
