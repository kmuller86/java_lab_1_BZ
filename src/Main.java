import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
        int wiek = 21;
        if(wiek%3==0) {
            System.out.println("Podzielny przez 3");
        } else {
            System.out.println("Niepodzielny przez 3");
        }

        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */

        int nrIndex = 56581;
        int czyParzysty = (nrIndex % 2 == 0) ? 0 : 1 ;
        System.out.println("3) Czy parzysty : " + czyParzysty);

        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj kwotę pieniężną jaką posiadasz: ");
        double money = scan.nextDouble();

        if (money < 50 )
        {
            System.out.println(" Nie wystarczy na dwie pizze");
        }else if(money == 55) {
            System.out.println("Idealnie na dwie pizze");
        }else if (money > 55) {
            System.out.println("Możesz kupić więcej niż dwie pizze ");
        }
    }
}
