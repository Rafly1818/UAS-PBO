package Sesi12.Polimorfisme.Tugas.ProgramKomputer.Abstracts;

import Sesi12.Polimorfisme.Tugas.ProgramKomputer.Interfaces.Keyboard;
import Sesi12.Polimorfisme.Tugas.ProgramKomputer.Interfaces.Mouse;
import Sesi12.Polimorfisme.Tugas.ProgramKomputer.Interfaces.Printer;

public abstract class Komputer implements Mouse, Keyboard, Printer {
    public abstract void hidupkan_os();
    public abstract void matikan_os();
}