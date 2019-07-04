package oop.odtwarzacz;

public class Main {
    public static void main(String[] args) {
//        inicjuje pusta tablice odpowiedniej wielkosci
        String[] utwory = new String[20];
//        uzupelniam tablice stringami symbolizujacymi utwory
        utwory[0] = "Malgoska";
        utwory[1] = "Majteczki w kropeczki";
        utwory[2] = "Fear of the dark";
        utwory[3] = "Rock is dead";
        utwory[4] = "Vivaldi's winter";
        utwory[5] = "Kamien z napisem love";

//        tworze obiekt nagrywarki
        Recorder recorder = new Recorder();

//        tworze pusty dysk (bez utworow w konstruktorze)
        Disc myDisc = new Disc();

//        wypalam plyte poprzez odpalenie metody .record w nagrywarce i przekazanie dysku i listy utworow
        recorder.record(myDisc, utwory);

//        tworze obiekt odtwarzacza
        Player player = new Player();

//        umieszczam przygotowana plyte w odtwarzaczu, odpalam jego metode .putDisc
//        odtwarzacz czyta plyte i jesli plyta jest wlasciwa odpala od razu pierwszy utwor
//        udtwarzacz odczytuje liczbe utworow
        player.putDisc(myDisc);

//        przestawiam utwory do przodu i do tylu, odtwarzacz ma przerzucach tylko po utworach ktore
//        zostaly przekazane i pomijac puste pozycje
        player.play(8);
        player.play(3);
        player.playNext();
        player.playNext();
        player.playNext();
        player.playNext();
        player.playNext();
        player.playPrevious();
        player.playPrevious();
        player.playPrevious();
//        metoda .status pokazuje jaki utwor odtwarza odtwarzacz, jesli w ogole, oraz podaje ilosc utworow na plycie
        player.printStatus();
//        metoda removeDisc pozwala przerwac odtwarzanie i wyjac dysk
        Disc disc = player.removeDisc();
        player.printStatus();
//        mozna dodac - zmiane glosnosci, mozliwość odtwarzania w petli lub bez, mozliwosc odtwarzania wielu plyt
//        mozliwosc odpalenia radia, wyszukiwania radia po wpisaniu stacji lub automatycznie, programowania stacji

    }
}
