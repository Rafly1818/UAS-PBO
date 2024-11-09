package Sesi4;
import java.util.Scanner;

public class KonversiMataUang {
    public static double konversiMataUang(double jumlah, String dari, String ke) {
        // Kurs sederhana (dalam Rupiah)
        double rateUSD = 15000;
        double rateEUR = 17000;
        double rateJPY = 100;
        
        // Konversi ke Rupiah terlebih dahulu
        double nilaiIDR = 0;
        switch (dari.toUpperCase()) {
            case "USD": nilaiIDR = jumlah * rateUSD; break;
            case "EUR": nilaiIDR = jumlah * rateEUR; break;
            case "JPY": nilaiIDR = jumlah * rateJPY; break;
            case "IDR": nilaiIDR = jumlah; break;
            default: return -1;
        }
        
        // Konversi dari Rupiah ke mata uang tujuan
        switch (ke.toUpperCase()) {
            case "USD": return nilaiIDR / rateUSD;
            case "EUR": return nilaiIDR / rateEUR;
            case "JPY": return nilaiIDR / rateJPY;
            case "IDR": return nilaiIDR;
            default: return -1;
        }
    }
    
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Konversi Mata Uang");
            System.out.println("Mata uang yang tersedia: IDR, USD, EUR, JPY");
            
            System.out.print("Masukkan jumlah uang: ");
            double jumlah = input.nextDouble();
            input.nextLine(); // clear buffer
            
            System.out.print("Mata uang asal (IDR/USD/EUR/JPY): ");
            String dari = input.nextLine().toUpperCase();
            
            System.out.print("Mata uang tujuan (IDR/USD/EUR/JPY): ");
            String ke = input.nextLine().toUpperCase();
            
            double hasil = konversiMataUang(jumlah, dari, ke);
            
            if (hasil != -1) {
                System.out.printf("%.2f %s = %.2f %s%n", jumlah, dari, hasil, ke);
            } else {
                System.out.println("Mata uang tidak valid!");
            }
        }
    }
}
