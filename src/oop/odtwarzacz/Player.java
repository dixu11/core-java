package oop.odtwarzacz;

public class Player {
    private Disc disc;
    private int discSize;
    private int songInPlay;

    public void putDisc(Disc disc) {
        if (this.disc != null) {
            System.out.println("No space for another disc");
        } else if (!isBurned(disc)) {
            this.disc = disc;
            printStatus();
        } else {
            System.out.println("Odczytuje dysk...");
            this.disc = disc;
            countTracks();
            play(1);
        }
    }

    public Disc removeDisc() {
        if (disc == null) {
            System.out.println("Error: there are no disc!");
            return null;
        } else {
            discSize = 0;
            songInPlay = 0;
            Disc temp = disc;
            disc = null;
            return temp;
        }
    }

    public void play(int songNumber) {
        if (isBurned(disc)) {
            if (songNumber <= discSize) {
                songInPlay = songNumber;
                printStatus();
            } else {
                System.out.println("Error: There are no song nr: " + songNumber);
            }
        }
    }

    public void playNext() {
        if (isBurned(disc)) {
            if (songInPlay + 1 <= discSize) {
                songInPlay++;
            } else {
                songInPlay = 1;
            }
            printStatus();
        }
    }

    public void playPrevious() {
        if (isBurned(disc)) {
            if (songInPlay > 1) {
                songInPlay--;
            } else {
                songInPlay = discSize;
            }
            printStatus();
        }
    }


    public void printStatus() {
        if (this.disc == null) {
            System.out.println("Status: no disc");
        } else if (!isBurned(disc)) {
            System.out.println("Status: no songs on disc");
        } else {
            System.out.printf("Playing song: %d. %s\n",songInPlay,disc.getTracks()[songInPlay -1] );
            System.out.printf("Songs on disc: %d\n",discSize);
        }
    }
    private Boolean isBurned(Disc disc) {
        if (disc != null && disc.isBurned()) {
            return true;
        } else {
            return false;
        }
    }

    private void countTracks() {
        if (!isBurned(disc)) {
            System.out.println("Track counter error: disc is not burned");
        } else {
            int counter = 0;
            for (String track : disc.getTracks()) {
                if (!track.equals("NO_SONG")) {
                    counter++;
                }
            }
            discSize = counter;
        }
    }
}

