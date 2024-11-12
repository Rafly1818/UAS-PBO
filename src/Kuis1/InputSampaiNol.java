package Kuis1;

import java.util.Scanner;

public class InputSampaiNol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka;

        do {
            System.out.print("Masukkan sebuah angka (0 untuk berhenti): ");
            angka = scanner.nextInt();
            
            if (angka != 0) {
                System.out.println("Anda memasukkan: " + angka);
            }
        } while (angka != 0);

        System.out.println("Program berhenti. Terima kasih!");
        scanner.close();
    }
}
