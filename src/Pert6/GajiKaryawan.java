package Pert6;
import java.util.Scanner;

public class GajiKaryawan {
    public static double hitungGaji(int jamKerja, double gajiPerJam) {
        double gajiNormal = jamKerja * gajiPerJam;
        double gajiLembur = 0;
        
        if (jamKerja > 40) {
            int jamLembur = jamKerja - 40;
            gajiLembur = jamLembur * (gajiPerJam * 1.5);
            gajiNormal = 40 * gajiPerJam;
        }
        
        return gajiNormal + gajiLembur;
    }
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama karyawan: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan jumlah jam kerja: ");
        int jamKerja = input.nextInt();
        
        System.out.print("Masukkan gaji per jam: ");
        double gajiPerJam = input.nextDouble();
        
        double totalGaji = hitungGaji(jamKerja, gajiPerJam);
        
        System.out.println("\nPerhitungan Gaji Karyawan");
        System.out.println("Nama: " + nama);
        System.out.println("Jam Kerja: " + jamKerja + " jam");
        System.out.println("Gaji per Jam: Rp" + gajiPerJam);
        System.out.println("Total Gaji: Rp" + totalGaji);
    }
}
