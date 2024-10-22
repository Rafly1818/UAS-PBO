package Pert6;
import java.util.Scanner;

public class TebakAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angkaRandom = (int) (Math.random() * 100) + 1; // Menghasilkan angka acak antara 1-100
        int tebakan = 0;
        int jumlahTebakan = 0;

        System.out.println("Selamat datang di permainan Tebak Angka!");
        System.out.println("Saya telah memilih angka antara 1 hingga 100. Cobalah untuk menebaknya!");

        while (tebakan != angkaRandom) {
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = scanner.nextInt();
            jumlahTebakan++;

            if (tebakan < angkaRandom) {
                System.out.println("Tebakan Anda terlalu rendah. Coba lagi!");
            } else if (tebakan > angkaRandom) {
                System.out.println("Tebakan Anda terlalu tinggi. Coba lagi!");
            } else {
                System.out.println("Selamat! Anda berhasil menebak angka " + angkaRandom + " setelah " + jumlahTebakan + " tebakan.");
            }
        }

        scanner.close();
    }
}
