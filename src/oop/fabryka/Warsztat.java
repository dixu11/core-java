package oop.fabryka;

public class Warsztat {
    private int iloscMechanikow;

    public Warsztat(int iloscMechanikow) {
        this.iloscMechanikow = iloscMechanikow;
    }

    InstalacjaElektryczna zbudujInstalacjeElektryczna(Akumulator akumulator, Kierunkowskaz[] kierunkowskazy) {
        System.out.println("Warsztat buduje instalacje elektryczna ");
        return new InstalacjaElektryczna(kierunkowskazy,akumulator);
    }

    Nadwozie zbudujNadzwozie(Szyberdach szyberdach,Drzwi[] drzwi) {
        System.out.println("Warsztat buduje nadwozie");
        return new Nadwozie(szyberdach,drzwi);
    }

    Podwozie zbudujPodwozie(Kolo[] kola, SkrzyniaBiegow skrzyniaBiegow) {
        System.out.println("Warsztat buduje podwozie ");
        return new Podwozie(kola,skrzyniaBiegow);
    }

    Samochod zbudujSamochod(Podwozie podwozie, Nadwozie nadwozie, InstalacjaElektryczna instalacjaElektryczna) {
        System.out.println("Warsztat składa samochód");
        return new Samochod(podwozie, nadwozie, instalacjaElektryczna);
    }
}
