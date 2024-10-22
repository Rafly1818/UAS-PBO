package Pert6;
import java.util.Scanner;

public class DataSiswa {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah siswa: ");
            int jumlahSiswa = input.nextInt();
            input.nextLine(); // clear buffer
            
            String[] nama = new String[jumlahSiswa];
            double[] nilai = new double[jumlahSiswa];
            
            // Input data
            for (int i = 0; i < jumlahSiswa; i++) {
                System.out.println("\nData Siswa ke-" + (i+1));
                System.out.print("Nama: ");
                nama[i] = input.nextLine();
                
                System.out.print("Nilai: ");
                nilai[i] = input.nextDouble();
                input.nextLine(); // clear buffer
            }
            
            // Hitung rata-rata
            double total = 0;
            double nilaiTertinggi = nilai[0];
            double nilaiTerendah = nilai[0];
            String siswaTertinggi = nama[0];
            String siswaTerendah = nama[0];
            
            for (int i = 0; i < jumlahSiswa; i++) {
                total += nilai[i];
                
                if (nilai[i] > nilaiTertinggi) {
                    nilaiTertinggi = nilai[i];
                    siswaTertinggi = nama[i];
                }
                
                if (nilai[i] < nilaiTerendah) {
                    nilaiTerendah = nilai[i];
                    siswaTerendah = nama[i];
                }
            }
            
            double rataRata = total / jumlahSiswa;
            
            // Tampilkan hasil
            System.out.println("\nHasil Analisis Data Siswa");
            System.out.println("=========================");
            System.out.printf("Rata-rata nilai: %.2f%n", rataRata);
            System.out.println("Nilai tertinggi: " + nilaiTertinggi + " (" + siswaTertinggi + ")");
            System.out.println("Nilai terendah: " + nilaiTerendah + " (" + siswaTerendah + ")");
        }
    }
}