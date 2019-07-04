package oop.odtwarzacz;

public class Disc {
    private boolean isBurned;
    private String[] tracks = new String[20];

    public Disc(String[] tracks) {
//        tworzymy dysk z lista trackow czyli dysk jest juz wypalony, nalezy uzupenic puste
//        miejsca na liscie aby zapobiedz blędom oraz ustawic plyte jako wypalona
        this.tracks = tracks;
        for (int i = 0; i < tracks.length; i++) {
            if (tracks[i] == null) {
                tracks[i] = "NO_SONG";
            }
            isBurned = true;
        }
    }

    public Disc() {
//        tworzymy plyte bez listy trackow wiec bedzie mozna ja wypalić, skoro tak - ustawiamy że
//        nie jest wypalona, lista tracków zawiera teraz same nulle
        isBurned = false;
    }

    public String[] getTracks() {
        return tracks;
    }

    public void setUtwory(String[]tracks) {
        this.tracks = tracks;
    }

    public boolean isBurned() {
        return isBurned;
    }

    public void setBurned(boolean burned) {
        isBurned = burned;
    }
}
