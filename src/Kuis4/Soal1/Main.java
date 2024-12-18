package Kuis4.Soal1;

import Kuis4.Soal1.Inheritance.Dekan;
import Kuis4.Soal1.Inheritance.Rektor;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Rektor
        Rektor rektor = new Rektor("12345", "Dr. Budi", 2015);
        System.out.println("Informasi Rektor:");
        rektor.viewRektor();

        System.out.println();

        // Membuat objek Dekan
        Dekan dekan = new Dekan("67890", "Prof. Sari", "Teknik Informatika");
        System.out.println("Informasi Dekan:");
        dekan.viewDekan();
    }
}