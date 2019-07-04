package oop.fabryka;

public class FabrykaSamochodow {

    public static void main(String[] args) {
        Akumulator akumulator = new Akumulator(12);
        SkrzyniaBiegow skrzyniaBiegow = new SkrzyniaBiegow(6);
        Szyberdach szyberdach = new Szyberdach("automatyczny");
        Kierunkowskaz[] kierunkowskazy = {new Kierunkowskaz("lewy")
                , new Kierunkowskaz("prawy")};
        Drzwi[] drzwi = {
                new Drzwi("lewe"),
                new Drzwi("prawe")};
        Kolo[] kola = {
                new Kolo(220, "przednie"),
                new Kolo(220, "przednie"),
                new Kolo(200, "tylne"),
                new Kolo(200, "tylne")};

    ///////////////////////////
        Warsztat warsztatFabryki = new Warsztat(5);
       InstalacjaElektryczna instalacjaElektryczna = warsztatFabryki.zbudujInstalacjeElektryczna(akumulator, kierunkowskazy);
        Podwozie podwozie = warsztatFabryki.zbudujPodwozie(kola, skrzyniaBiegow);
        Nadwozie nadwozie = warsztatFabryki.zbudujNadzwozie(szyberdach, drzwi);

        Samochod matiz = warsztatFabryki.zbudujSamochod(podwozie, nadwozie, instalacjaElektryczna);
        matiz.jedz();
    }


}
