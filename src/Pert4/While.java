package Pert4;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Tebak Angka");
        System.out.println("Saya memikirkan sebuah angka antara 1 dan 10.");
        System.out.println("Coba tebak angka tersebut!");

        int angkaRahasia = (int) (Math.random() * 10) + 1;
        int tebakan;
        int jumlahTebakan = 0;

        while (true) {
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = scanner.nextInt();
            jumlahTebakan++;

            if (tebakan == angkaRahasia) {
                System.out.println("Selamat! Anda berhasil menebak angka " + angkaRahasia);
                System.out.println("Anda menebak sebanyak " + jumlahTebakan + " kali.");
                break;
            } else if (tebakan < angkaRahasia) {
                System.out.println("Terlalu rendah. Coba lagi!");
            } else {
                System.out.println("Terlalu tinggi. Coba lagi!");
            }
        }

        scanner.close();
    }
}