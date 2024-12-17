package Sesi13.StudiKasus.Classes;

import Sesi13.StudiKasus.Abstracts.Karyawan;
import Sesi13.StudiKasus.Interfaces.Tunjangan;

public class Manager extends Karyawan implements Tunjangan {
    private double tunjanganJabatan;

    public Manager(String nama, double gajiPokok, double tunjanganJabatan) {
        super(nama, gajiPokok);
        this.tunjanganJabatan = tunjanganJabatan;
    }

    @Override
    public double hitungTunjangan() {
        return tunjanganJabatan;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + hitungTunjangan();
    }
}
