package Sesi11.Inheritance.Karyawan;

public class Koki extends Pegawai {
    
    // Tambahkan @Override diatas fungsi void menampilkan ().
    // Override sendiri berfungsi sebagai pembuatan ulang method dari superclass untuk subclass.
    @Override

    public void menampilkan()
    {
        // Untuk nilai dari void menampilkan bisa berbeda dari nilai yang ada pada superclass.
        System.out.println("Nama: " + nama);
        System.out.println("Id_Pegawai: " + id_pegawai);
        System.out.println("Gaji: " + gaji);
    }

    public void tugas()
    {
        // Fungsi dari void tugas() merupakan fungsi spesifik yang hanya dimiliki oleh class
        System.out.println("Tugas: Memasak makanan dan membuat minuman");
        System.out.println("========================================================");
    }
}