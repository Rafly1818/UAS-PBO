package Pert6;
import java.util.Scanner;

public class KalenderBulan {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan bulan (1-12): ");
            int bulan = scanner.nextInt();
            System.out.print("Masukkan tahun: ");
            int tahun = scanner.nextInt();

            tampilkanKalender(bulan, tahun);
        }
    }

    public static void tampilkanKalender(int bulan, int tahun) {
        String[] namaBulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        int[] hariPerBulan = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isTahunKabisat(tahun)) {
            hariPerBulan[1] = 29;
        }

        System.out.println("\nKalender Bulan " + namaBulan[bulan - 1] + " " + tahun);
        System.out.println("Minggu  Senin  Selasa  Rabu  Kamis  Jumat  Sabtu");

        int hariPertama = hitungHariPertama(bulan, tahun);
        for (int i = 0; i < hariPertama; i++) {
            System.out.print("       ");
        }

        for (int hari = 1; hari <= hariPerBulan[bulan - 1]; hari++) {
            System.out.printf("%-7d", hari);
            if ((hari + hariPertama) % 7 == 0) {
                System.out.println();
            }
        }
    }

    public static boolean isTahunKabisat(int tahun) {
        return (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0);
    }

    public static int hitungHariPertama(int bulan, int tahun) {
        int hari = 0;
        for (int i = 1; i < bulan; i++) {
            hari += i == 2 && isTahunKabisat(tahun) ? 29 : new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}[i - 1];
        }
        return (hari + tahun * 365 + tahun / 4 - tahun / 100 + tahun / 400) % 7;
    }
}
