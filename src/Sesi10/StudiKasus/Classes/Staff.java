package Sesi13.StudiKasus.Classes;

import Sesi13.StudiKasus.Abstracts.Karyawan;
import Sesi13.StudiKasus.Interfaces.Tunjangan;

public class Staff extends Karyawan implements Tunjangan {
    private double tunjanganTetap;

    public Staff(String nama, double gajiPokok, double tunjanganTetap) {
        super(nama, gajiPokok);
        this.tunjanganTetap = tunjanganTetap;
    }

    @Override
    public double hitungTunjangan() {
        return tunjanganTetap;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + hitungTunjangan();
    }
}
