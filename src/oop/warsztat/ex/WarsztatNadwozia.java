package oop.warsztat.ex;

public class WarsztatNadwozia implements IWarsztat {
    @Override
    public void napraw(NewSamochod samochod) {
        if (samochod instanceof IElektryka) {
            INadwozie mojaRobota = (INadwozie) samochod;
            mojaRobota.otworzDrzwi();
            mojaRobota.zamknijDrzwi();
            mojaRobota.otworzBagaznik();
            mojaRobota.zamknijBagaznik();
            System.out.println("Jest dobrze.");
        } else {
            System.out.println("To nie dla mnie robota");
        }
    }
}
