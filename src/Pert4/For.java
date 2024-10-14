package Pert4;
import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Penghitung Mundur Sederhana");
        System.out.print("Masukkan angka awal untuk menghitung mundur: ");
        
        int angkaAwal = scanner.nextInt();

        System.out.println("Menghitung mundur dari " + angkaAwal + ":");

        for (int i = angkaAwal; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Selesai!");

        scanner.close();
    }
}