package Pert6;
import java.util.Scanner;

public class KalkulatorKesehatan {
    public static double hitungBMI(double beratKg, double tinggiM) {
        return beratKg / (tinggiM * tinggiM);
    }
    
    public static String kategoriBMI(double bmi) {
        if (bmi < 18.5) return "Kurus";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Gemuk";
        else return "Obesitas";
    }
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        
        System.out.println("Kalkulator BMI");
        System.out.println("==============");
        
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan berat badan (kg): ");
        double berat = input.nextDouble();
        
        System.out.print("Masukkan tinggi badan (m): ");
        double tinggi = input.nextDouble();
        
        double bmi = hitungBMI(berat, tinggi);
        
        System.out.println("\nHasil Perhitungan BMI");
        System.out.println("Nama: " + nama);
        System.out.printf("BMI: %.2f%n", bmi);
        System.out.println("Kategori: " + kategoriBMI(bmi));
    }
}
