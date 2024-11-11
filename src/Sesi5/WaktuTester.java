package Sesi5;

class Waktu {
    private int menitWaktu; // Menyimpan total waktu dalam menit

    // Constructor
    public Waktu() {
        this.menitWaktu = 0;
    }

    // Menambahkan jam ke waktu (j * 60 menit)
    public void tambahJam(int j) {
        this.menitWaktu += j * 60;
    }

    // Menambahkan menit ke waktu
    public void tambahMenit(int m) {
        this.menitWaktu += m;
    }

    // Menambahkan jam dan menit ke waktu
    public void tambahWaktu(int j, int m) {
        this.menitWaktu += (j * 60) + m;
    }

    // Menampilkan waktu dalam format jam dan menit
    public void tampilWaktu() {
        int jam = menitWaktu / 60;
        int menit = menitWaktu % 60;
        System.out.println(jam + " jam " + menit + " menit");
    }
}

public class WaktuTester {
    public static void main(String[] args) {
    }
}
