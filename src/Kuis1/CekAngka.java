package Kuis1;

import java.util.Scanner;

public class CekAngka {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan sebuah angka
        System.out.print("Masukkan sebuah angka: ");
        double angka = input.nextDouble();

        // Memeriksa apakah angka positif, negatif, atau nol
        if (angka > 0) {
            System.out.println("Angka tersebut positif.");
        } else if (angka < 0) {
            System.out.println("Angka tersebut negatif.");
        } else {
            System.out.println("Angka tersebut adalah nol.");
        }

        // Menutup objek Scanner
        input.close();
    }
}
