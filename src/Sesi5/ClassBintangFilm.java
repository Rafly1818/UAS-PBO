package Sesi5;

class BintangFilm {
    // Declare instance variables
    private String nama;
    private Boolean pria;

    public BintangFilm(String nama, Boolean pria) {
        this.nama = nama;
        this.pria = pria;
    }
    
    //Method tanpa return dengan parameter
    @SuppressWarnings("unused")
    private void Isikan(String nama, Boolean pria) {
        this.nama = nama; //This adalah objek sekarang
        this.pria = pria;
    }
    
    //Method dengan return tanpa parameter
    String perolehNama() {
        return nama;
    }
    
    //Memperoleh jenis kelamin dengan tanpa parameter
    String perolehJenisKelamin() {
        if (pria) {
            return "Pria";
        }
        else {
            return "Wanita";
        }
    }
}

public class ClassBintangFilm {
    public static void main(String[] args) {
        //Buat dua objek BintangFilm siA dan siB
        BintangFilm siA = new BintangFilm("Budi", true);    // Hapus nama: dan pria:
        BintangFilm siB = new BintangFilm("Hani", false);   // Hapus nama: dan pria:

        //Menampilkan objek siA dan siB
        System.out.println("siA => " + siA.perolehNama() + ", " + siA.perolehJenisKelamin());
        System.out.println("siB => " + siB.perolehNama() + ", " + siB.perolehJenisKelamin());
    }
}