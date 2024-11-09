package Sesi2;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int angka;
        
        System.out.println("Program Penjumlahan Angka");
        System.out.println("Masukkan angka-angka positif untuk dijumlahkan.");
        System.out.println("Masukkan angka 0 atau negatif untuk mengakhiri.");

        do {
            System.out.print("Masukkan sebuah angka: ");
            angka = scanner.nextInt();
            
            if (angka > 0) {
                total += angka;
                System.out.println("Total saat ini: " + total);
            }
        } while (angka > 0);

        System.out.println("Program selesai.");
        System.out.println("Total akhir: " + total);

        scanner.close();
    }
}