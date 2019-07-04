package oop.odtwarzacz;

public class Recorder {

    //przyjmuje nie wypalony dysk oraz liste utworow
    public Disc record(Disc disc, String[] tracklist) {
        //sprawdzam czy dostalem odpowiedni dysk (czy niewypalony)
        if (disc.isBurned()) {
            System.out.println("I can't record, disc is already recorded");
//            sprwdzam czy dostałem odpowiednia tablice ( rozmiar)
        } else if (tracklist.length != 20) {
            System.out.println("Wrong disc format");
        } else {
            //ustawiam wszystkie wolne miejsca na "NO_SONG" aby uniknac null pointer exception
            for (int i = 0; i < tracklist.length; i++) {
                if (tracklist[i] == null) {
                    tracklist[i] = "NO_SONG";
                }
            }
            //ustawiam na dysku przygotowane utwory i ustawiam ze dysk jest wypalony
            disc.setUtwory(tracklist);
            disc.setBurned(true);
        }
        return disc;
    }
}
