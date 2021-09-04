import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Przykłady wprowadzania tekstu z klawiatury */
        /* Ta komenda inicjuje strumień wejsciomy danych */
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj teks: ");
        /* wprowadzanie tekstu */
        String tekst = scan.next();

        System.out.print("Podaj liczbę: ");
        /* wprowadzanie znaków liczbowych calkowitych */
        int liczba = scan.nextInt();

        /* 2 sposoby wyświetlania tekstu printf i print/println */
        System.out.printf("Twój tekst to %s i liczba to %d \n", tekst, liczba);
        System.out.println("Twój tekst to " + tekst + " i liczba zwiększona o 1 to " + (liczba + 1));

        /*  Uwaga wtym wypadku gdy podamy liczbę np. 4 to konsola nie wypisze nam licz-by 5 tylko liczbę 41
            bo będzie łączyla każdy znak od lewej do typu tekstowego */
        System.out.println("Twój tekst to " + tekst + " i liczba zwiększona o 1 to " + liczba + 1);
    }
}
