package structural.for_beginners;

import java.util.Scanner;

public class Z4Podatek {
    //do 85.528 podatek wynosi 18% podstawy minus 556,02 PLN
    // od 85.528 podatek wynosi 14.839,02 zł 32% nadwyżki ponad 85.528,00

    public static void main(String[] args) {

        System.out.println("Powiedz ile zarabiasz a ja powiem ile zabiera Ci państwo.");
        Scanner input = new Scanner(System.in);
        double income = input.nextDouble();
        double tax;
        System.out.printf("Zarabiasz : %8.2fzł\n", income);
        if (income <= 85528) {
            tax = income * 0.18;
        } else {
            tax = (85528 * 0.18)+ ((income-85528)*0.32);
            System.out.println("wariant 2");
        }
        System.out.printf("Państwo zabiera Ci: %8.2fzł, i jak Ci z tym?\n", tax);
    }
}
