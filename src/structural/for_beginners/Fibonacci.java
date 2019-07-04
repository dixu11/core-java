package structural.for_beginners;
/*Due 7.11.
        Please write a program that prints "n" elements of the Fibonacci sequence (or up to the value of "n").
        Please write code that verifies that a given String is a valid email address*/
public class Fibonacci {
    public static void main(String[] args) {
       fibonacci(13);
       // ciag fibonaciego zaczyna się od 0 i 1 a potem każda liczba to suma 2 poprzednich.
        System.out.println("Valid mail: " + isItValidEmail("dixu@o2.pl"));
        System.out.println("Valid mail: " + isItValidEmail("dixu@o2@pl"));
        System.out.println("Valid mail: " + isItValidEmail("dixu.o2.pl"));
    }

    static private void fibonacci(int n){
        // ustalenie na sztywno dla n=0 i n=1
        if (n == 0 || n == 1) {
            System.out.println(n);
            return;
        }
        //dla pozostałych wyświetlamy pierwsze 2 i dalsze iterujemy
        System.out.println("0\n1");
        int prevPrev = 0;
        int prev = 1;
        int result = 0;
        for (int i = 2; i <= n; i++) {
            // aktualny wynik to poprzedni i jeszcze wczesniejszy
            result = prev + prevPrev;
            // uaktualniamy o jedna liczbe do przodu
            prevPrev = prev;
            prev = result;
            System.out.println(result);
        }
    }

    // ta metoda sprawdza maila czy na pewno mamy dokładnie jeden znak @
    static private boolean isItValidEmail(String mail) {
        String[] prefixAndSufix = mail.split("@");
        //jeśli metoda split podzieli tekst na 2 części - poprawny mail
        if (prefixAndSufix.length == 2) {
            return true;
        } else {
            return false;
        }
    }
}
