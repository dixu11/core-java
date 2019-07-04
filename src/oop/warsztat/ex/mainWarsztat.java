package oop.warsztat.ex;

public class mainWarsztat {
    public static void main(String[] args) {
        //       zadanie 3 - kompozycja, interface
        NewSamochod nowyWoz = new NewSamochod();
        WarsztatElektryki warsztat1 = new WarsztatElektryki();
        WarsztatNadwozia warsztat2 = new WarsztatNadwozia();
        WarsztatUkladuJezdnego warsztat3 = new WarsztatUkladuJezdnego();
        warsztat1.napraw(nowyWoz);
        warsztat2.napraw(nowyWoz);
        warsztat3.napraw(nowyWoz);


    }
}
