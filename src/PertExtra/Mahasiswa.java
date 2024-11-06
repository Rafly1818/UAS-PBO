package PertExtra;

import java.util.ArrayList;
import java.util.List;

// Kelas Mahasiswa
public class Mahasiswa {
    private String nama;
    private String nim;
    private Dosen dosenWali;
    private List<MataKuliah> mataKuliahList;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        this.mataKuliahList = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void addMataKuliah(MataKuliah mataKuliah) {
        if (!mataKuliahList.contains(mataKuliah)) {
            mataKuliahList.add(mataKuliah);
            mataKuliah.addMahasiswa(this); // Menjaga relasi dua arah
        }
    }

    public void displayInfo() {
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Dosen Wali: " + (dosenWali != null ? dosenWali.getNama() : "Belum Ada"));
        System.out.println("Mata Kuliah yang Diikuti:");
        for (MataKuliah mk : mataKuliahList) {
            System.out.println("- " + mk.getNama());
        }
    }
}
