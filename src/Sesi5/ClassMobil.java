package Sesi5;

class Mobil {
    String aktifitas;
    String warna;
    int kecepatan;

    public Mobil (String aktifitas, String warna, int kecepatan){
        this.aktifitas = aktifitas;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    public Mobil() {
        //TODO Auto-generated constructor stub
    }

    void cekKecepatan() {
        if (kecepatan==0)
        aktifitas="Parkir";
    }

    void cetakAtribut(){
        System.out.println("Aktifitas = " +aktifitas);
        System.out.println("Warna = " +warna);
        System.out.println("Kecepatan = " +kecepatan);

    }
}

public class ClassMobil {
    public static void main(String []args) {
        Mobil mobilku = new Mobil();
        mobilku.kecepatan=0;
        mobilku.warna="Merah";
        mobilku.cekKecepatan();
        mobilku.cetakAtribut();
    }
}