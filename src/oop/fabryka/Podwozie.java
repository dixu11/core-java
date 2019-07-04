package oop.fabryka;

public class Podwozie {
    Kolo[] kola;
    SkrzyniaBiegow skrzyniaBiegow;

    public Podwozie(Kolo[] kola, SkrzyniaBiegow skrzyniaBiegow) {
        System.out.println("Buduje podwozie");
        this.kola = kola;
        this.skrzyniaBiegow = skrzyniaBiegow;
    }
}
