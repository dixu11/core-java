package collections.basics.zadanie1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dictionary slowniczku = new Dictionary();
        slowniczku.addWord("mysz", "mouse");
        slowniczku.addWord("mysz", "ratón");
        slowniczku.addWord("mysz", "maus");
        slowniczku.addWord("mycie", "washing");
        slowniczku.addWord("kot", "cat");
        slowniczku.addWord("kot", Arrays.asList("katze","gato"));
        List<String> inneTlumaczeniaOsiol = new ArrayList<>();
        inneTlumaczeniaOsiol.add("burro");
        inneTlumaczeniaOsiol.add("donkey");
        inneTlumaczeniaOsiol.add("esel");
        slowniczku.addWord("osiol", inneTlumaczeniaOsiol);
        slowniczku.addWord("zwyciezca", "winner");
        slowniczku.addWord("zwierze", "animal");
        slowniczku.addWord("mozg", "brain");
        slowniczku.addWord("facet", "man");
        slowniczku.addWord("facet", "man");
        System.out.println("*********************************");
        slowniczku.printTranslation("mysz");
        slowniczku.printTranslation("kot");
        slowniczku.printTranslation("zwyciezca");
        slowniczku.printTranslation("zwierze");
        slowniczku.printTranslation("mozg");
        slowniczku.printTranslation("facet");
        slowniczku.printTranslation("zbyszek");
        slowniczku.printTranslation("osiol");
        System.out.println("*********************************");
        slowniczku.remove("mozg");
        slowniczku.remove("zbyszek");
        System.out.println("*********************************");
        List<String> zabieram = slowniczku.getAll();
 /*       for (String s : zabieram) {
            System.out.println(s);
        }*/
        System.out.println("*********************************");
        slowniczku.printAllTranslations();
        System.out.println("*********************************");
        slowniczku.printTranslation("my");
        List<String> znalezione = slowniczku.getWords("my");
        System.out.println(znalezione);
    }
}
