package Pert6;
import java.util.Scanner;

public class UrutMahasiswa {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah mahasiswa: ");
            int n = scanner.nextInt();
            scanner.nextLine();  // Kosongkan buffer

            String[] nama = new String[n];
            double[] ipk = new double[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Nama mahasiswa " + (i + 1) + ": ");
                nama[i] = scanner.nextLine();
                System.out.print("IPK mahasiswa " + (i + 1) + ": ");
                ipk[i] = scanner.nextDouble();
                scanner.nextLine();  // Kosongkan buffer
            }

            bubbleSort(nama, ipk);

            System.out.println("Data mahasiswa setelah diurutkan berdasarkan IPK:");
            for (int i = 0; i < n; i++) {
                System.out.println(nama[i] + " - " + ipk[i]);
            }
        }
    }

    public static void bubbleSort(String[] nama, double[] ipk) {
        int n = nama.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ipk[j] < ipk[j + 1]) {
                    double tempIpk = ipk[j];
                    ipk[j] = ipk[j + 1];
                    ipk[j + 1] = tempIpk;

                    String tempNama = nama[j];
                    nama[j] = nama[j + 1];
                    nama[j + 1] = tempNama;
                }
            }
        }
    }
}
