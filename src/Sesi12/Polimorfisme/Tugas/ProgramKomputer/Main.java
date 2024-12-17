package Sesi12.Polimorfisme.Tugas.ProgramKomputer;

import Sesi12.Polimorfisme.Tugas.ProgramKomputer.Abstracts.Komputer;
import Sesi12.Polimorfisme.Tugas.ProgramKomputer.Classes.Laptop;
import Sesi12.Polimorfisme.Tugas.ProgramKomputer.Classes.Netbook;
import Sesi12.Polimorfisme.Tugas.ProgramKomputer.Classes.PC;
import Sesi12.Polimorfisme.Tugas.ProgramKomputer.FinalClass.KomputerCetak;

public class Main {
    public static void main(String[] args) {
        Komputer[] komputerList = {
            new PC(),
            new Laptop(),
            new Netbook()
        };

        KomputerCetak cetak = new KomputerCetak();
        cetak.cetak(komputerList);
    }
}
