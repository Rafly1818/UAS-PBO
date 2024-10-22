package Pert6;
import java.util.Scanner;

public class NilaiSiswa {
    public static String hitungGrade(double nilai) {
        if (nilai >= 90) return "A";
        else if (nilai >= 80) return "B";
        else if (nilai >= 70) return "C";
        else if (nilai >= 60) return "D";
        else return "E";
    }
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama siswa: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan nilai: ");
        double nilai = input.nextDouble();
        
        System.out.println("\nHasil Perhitungan Grade");
        System.out.println("Nama: " + nama);
        System.out.println("Nilai: " + nilai);
        System.out.println("Grade: " + hitungGrade(nilai));
    }
}