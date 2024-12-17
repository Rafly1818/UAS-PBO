package Sesi13.StudiKasus;

import Sesi13.StudiKasus.Abstracts.Karyawan;
import Sesi13.StudiKasus.Classes.Freelancer;
import Sesi13.StudiKasus.Classes.Manager;
import Sesi13.StudiKasus.Classes.Staff;
import Sesi13.StudiKasus.Classes.StatistikKaryawan;
import Sesi13.StudiKasus.FinalClass.GajiKaryawanCetak;

public class Main {
    public static void main(String[] args) {
        Karyawan[] karyawanList = new Karyawan[3];

        karyawanList[0] = new Manager("Budi", 8000000, 2000000);
        karyawanList[1] = new Staff("Siti", 4000000, 500000);
        karyawanList[2] = new Freelancer("Joko", 50000, 160); // 160 jam kerja

        // Cetak rincian gaji setiap karyawan
        GajiKaryawanCetak.cetakGaji(karyawanList);

        // Hitung total gaji menggunakan static method
        double totalGaji = GajiKaryawanCetak.hitungTotalGaji(karyawanList);
        System.out.println("Total Gaji Semua Karyawan: " + totalGaji);

        // Hitung rata-rata gaji menggunakan static method dari StatistikKaryawan
        double rataRataGaji = StatistikKaryawan.hitungRataRataGaji(karyawanList);
        System.out.println("Rata-rata Gaji Karyawan: " + rataRataGaji);
    }
}