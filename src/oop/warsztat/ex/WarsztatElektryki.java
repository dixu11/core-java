package oop.warsztat.ex;

public class WarsztatElektryki implements IWarsztat {
    @Override
    public void napraw(NewSamochod samochod) {
        if (samochod instanceof IElektryka) {
            IElektryka mojaRobota = (IElektryka) samochod;
            mojaRobota.wlaczSwiatla();
            mojaRobota.wlaczWycieraczki();
            mojaRobota.wylaczSwiatla();
            mojaRobota.wylaczWycieraczki();
            System.out.println("Jest dobrze.");
        } else {
            System.out.println("To nie dla mnie robota");
        }
    }
}
