package Pert6;
import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        boolean lanjut = true;
        
        while (lanjut) {
            System.out.println("\nKalkulator Sederhana");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");
            
            System.out.print("\nPilih operasi (1-5): ");
            int pilihan = input.nextInt();
            
            if (pilihan == 5) {
                lanjut = false;
                System.out.println("Terima kasih telah menggunakan kalkulator!");
                continue;
            }
            
            System.out.print("Masukkan angka pertama: ");
            double a = input.nextDouble();
            System.out.print("Masukkan angka kedua: ");
            double b = input.nextDouble();
            
            switch (pilihan) {
                case 1:
                    System.out.printf("%.2f + %.2f = %.2f%n", a, b, (a + b));
                    break;
                case 2:
                    System.out.printf("%.2f - %.2f = %.2f%n", a, b, (a - b));
                    break;
                case 3:
                    System.out.printf("%.2f * %.2f = %.2f%n", a, b, (a * b));
                    break;
                case 4:
                    if (b != 0) {
                        System.out.printf("%.2f / %.2f = %.2f%n", a, b, (a / b));
                    } else {
                        System.out.println("Error: Pembagian dengan nol!");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}