package structural.for_beginners;

import java.util.Scanner;

public class Z14Choinka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hight = -1;
        boolean isInputIncorrect = true;
        System.out.println("Przyszedłeś kupić choinkę, tak?");
        while (isInputIncorrect) {
            System.out.println("Jaka wysoka ma być?");
            if (input.hasNextInt()) {
                hight = input.nextInt();
                if (hight > 0) {
                    isInputIncorrect = false;
                }
            } else {
                input.next();
            }
        }
        System.out.println("Była tu gdzieś taka, zaraz wracam, przyniosę.");
        System.out.println("Oto ona: \n");
        for (int i = 0; i < hight; i++) {
            for (int j = i; j < hight; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = hight-i; k<hight;k++) {
                System.out.print("**");
            }
            System.out.println();
        }
        System.out.println("\n Prawda, że idealna?");
    }
}
// zadanie wykonane w 14 min