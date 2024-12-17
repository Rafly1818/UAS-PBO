package Sesi13.StudiKasus.FinalClass;

import Sesi13.StudiKasus.Abstracts.Karyawan;

public final class GajiKaryawanCetak {

    public static void cetakGaji(Karyawan[] karyawanList) {
        for (Karyawan karyawan : karyawanList) {
            System.out.println("Nama: " + karyawan.getNama());
            System.out.println("Gaji: " + karyawan.hitungGaji());
            System.out.println("----------------------------");
        }
    }

    // Static method untuk menghitung total gaji
    public static double hitungTotalGaji(Karyawan[] karyawanList) {
        double total = 0;
        for (Karyawan karyawan : karyawanList) {
            total += karyawan.hitungGaji();
        }
        return total;
    }
}