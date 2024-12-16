package Sesi11.Polimorfisme.Tugas.ProgramKomputer;

import Sesi11.Polimorfisme.Tugas.ProgramKomputer.Abstracts.Komputer;
import Sesi11.Polimorfisme.Tugas.ProgramKomputer.Classes.Laptop;
import Sesi11.Polimorfisme.Tugas.ProgramKomputer.Classes.Netbook;
import Sesi11.Polimorfisme.Tugas.ProgramKomputer.Classes.PC;
import Sesi11.Polimorfisme.Tugas.ProgramKomputer.FinalClass.KomputerCetak;

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
