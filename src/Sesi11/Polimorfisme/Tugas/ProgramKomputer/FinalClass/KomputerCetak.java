package Sesi11.Polimorfisme.Tugas.ProgramKomputer.FinalClass;

import Sesi11.Polimorfisme.Tugas.ProgramKomputer.Abstracts.Komputer;

public class KomputerCetak  { // Jika method final tidak bisa di override
    public final void cetak(Komputer[] obj) {
        for(Komputer komputer : obj) {
            komputer.hidupkan_os();
            komputer.matikan_os();
            komputer.klik_kanan();
            komputer.klik_kiri();
            komputer.tekan_enter();
            komputer.cetak_data();
            System.out.println();
        }
    }
}