package Pert3;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Selamat datang di Program Pengecekan Nilai!");
        
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan nilai Anda (0-100): ");
        int nilai = scanner.nextInt();
        
        System.out.println("\nHasil evaluasi untuk " + nama + ":");
        
        if (nilai >= 0 && nilai <= 100) {
            if (nilai >= 90) {
                System.out.println("Nilai A - Luar biasa!");
            } else if (nilai >= 80) {
                System.out.println("Nilai B - Sangat baik!");
            } else if (nilai >= 70) {
                System.out.println("Nilai C - Baik!");
            } else if (nilai >= 60) {
                System.out.println("Nilai D - Cukup, tingkatkan lagi!");
            } else {
                System.out.println("Nilai E - Maaf, Anda harus lebih giat belajar.");
            }
            
            if (nilai >= 60) {
                System.out.println("Selamat, Anda lulus!");
            } else {
                System.out.println("Maaf, Anda belum lulus. Tetap semangat!");
            }
        } else {
            System.out.println("Nilai tidak valid. Harap masukkan nilai antara 0-100.");
        }
        
        scanner.close();
    }
}    