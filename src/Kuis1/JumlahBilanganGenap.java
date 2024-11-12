package Kuis1;

public class JumlahBilanganGenap {
    public static void main(String[] args) {
        int jumlah = 0;
        
        System.out.println("Bilangan genap antara 1 sampai 100:");
        
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                jumlah += i;
            }
        }
        
        System.out.println("\n\nJumlah bilangan genap antara 1 sampai 100 adalah: " + jumlah);
    }
}
