package Kuis2;
import java.util.Scanner;

public class SimulasiATM {
    private static int saldo = 500000;
    private static final String PIN = "1234";

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan PIN: ");
        String inputPin = scanner.nextLine();

        if (!inputPin.equals(PIN)) {
            System.out.println("PIN salah. Akses ditolak.");
            return;
        }

        boolean keluar = false;
        while (!keluar) {
            System.out.println("\nMenu:");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Setor Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    cekSaldo();
                    break;
                case 2:
                    tarikTunai(scanner);
                    break;
                case 3:
                    setorTunai(scanner);
                    break;
                case 4:
                    keluar = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static void cekSaldo() {
        System.out.println("Saldo anda: Rp" + saldo);
    }

    public static void tarikTunai(Scanner scanner) {
        System.out.print("Masukkan jumlah yang ingin ditarik: Rp");
        int jumlah = scanner.nextInt();
        if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi.");
        } else {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil. Saldo sekarang: Rp" + saldo);
        }
    }

    public static void setorTunai(Scanner scanner) {
        System.out.print("Masukkan jumlah yang ingin disetor: Rp");
        int jumlah = scanner.nextInt();
        saldo += jumlah;
        System.out.println("Setor tunai berhasil. Saldo sekarang: Rp" + saldo);
    }
}
