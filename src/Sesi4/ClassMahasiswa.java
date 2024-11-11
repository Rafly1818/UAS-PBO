package Sesi4;

import java.util.Scanner;

class Mahasiswa {
    String aktivitas;
    String jurusan;
    double ipk;
    
    public Mahasiswa(String aktivitas, String jurusan, double ipk) {
        this.aktivitas = aktivitas;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }
    
    public Mahasiswa() {
        //TODO Auto-generated constructor stub
    }
    
    void cekStatus() {
        if (ipk < 2.0)
            aktivitas = "Dalam Masa Percobaan";
        else if (ipk >= 2.0 && ipk <= 3.0)
            aktivitas = "Status Normal";
        else if (ipk > 3.0 && ipk <= 3.5)
            aktivitas = "Mahasiswa Berprestasi";
        else if (ipk > 3.5)
            aktivitas = "Mahasiswa Cumlaude";
    }
    
    void cetakAtribut() {
        System.out.println("\n=== Data Mahasiswa ===");
        System.out.println("Aktivitas = " + aktivitas);
        System.out.println("Jurusan = " + jurusan);
        System.out.println("IPK = " + ipk);
        System.out.println("====================");
    }
}

public class ClassMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa mahasiswaku = new Mahasiswa();
        
        System.out.println("=== Input Data Mahasiswa ===");
        System.out.print("Masukkan Jurusan: ");
        mahasiswaku.jurusan = input.nextLine();
        
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Masukkan IPK (0.0 - 4.0): ");
                mahasiswaku.ipk = input.nextDouble();
                if (mahasiswaku.ipk >= 0.0 && mahasiswaku.ipk <= 4.0) {
                    validInput = true;
                } else {
                    System.out.println("Error: IPK harus antara 0.0 - 4.0!");
                }
            } catch (Exception e) {
                System.out.println("Error: Masukkan IPK dalam format angka (misal: 3.5)!");
                input.nextLine(); // Clear buffer
            }
        }
        
        mahasiswaku.cekStatus();
        mahasiswaku.cetakAtribut();
        
        input.close();
    }
}