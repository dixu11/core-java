package oop.warsztat.ex;

public class NewSamochod implements IElektryka,INadwozie,IUkladJezdny{

    @Override
    public void wlaczWycieraczki() {
        System.out.println("Wycieraczki ON");
    }

    @Override
    public void wylaczWycieraczki() {
        System.out.println("Wycieraczki OFF");
    }

    @Override
    public void wlaczSwiatla() {
        System.out.println("Swiatla ON");
    }

    @Override
    public void wylaczSwiatla() {
        System.out.println("Swiatla OFF");
    }

    @Override
    public void otworzDrzwi() {
        System.out.println("Drzwi OPEN");
    }

    @Override
    public void zamknijDrzwi() {
        System.out.println("Drzwi CLOSED");
    }

    @Override
    public void otworzBagaznik() {
        System.out.println("Bagaznik OPEN");
    }

    @Override
    public void zamknijBagaznik() {
        System.out.println("Bagaznik CLOSED");
    }

    @Override
    public void odpalSilnik() {
        System.out.println("Silnok ON");
    }

    @Override
    public void zgasSilnik() {
        System.out.println("Silnik OFF");
    }

    @Override
    public void hamuj() {
        System.out.println("STOP!!");
    }

    @Override
    public void jedz() {
        System.out.println("Go!");
    }
}
