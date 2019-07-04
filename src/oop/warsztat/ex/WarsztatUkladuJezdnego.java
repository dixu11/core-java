package oop.warsztat.ex;

public class WarsztatUkladuJezdnego implements IWarsztat {
    @Override
    public void napraw(NewSamochod samochod) {
        if (samochod instanceof IUkladJezdny) {
            IUkladJezdny mojaRobota = (IUkladJezdny) samochod;
            mojaRobota.odpalSilnik();
            mojaRobota.jedz();
            mojaRobota.hamuj();
            mojaRobota.zgasSilnik();
            System.out.println("Jest dobrze.");
        } else {
            System.out.println("To nie dla mnie robota");
        }
    }
}
