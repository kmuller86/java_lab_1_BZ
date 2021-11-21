import java.util.Scanner;

public class Main {

    public static void main(String[] args){


    String imie = "Bartek";
    String nazwisko = "Zawadzki";
    int nrIndexu = 56581;
    int wiek = 21;
   //B boolean zmiennaBoolean = true;

    Scanner scan = new Scanner(System.in);

        System.out.print("Poodaj Imie: ");
        scan.next();

        System.out.print("Poodaj Nazwisko: ");
        scan.next();

        System.out.print("wiek: ");
        scan.nextInt();

        System.out.print("Podaj nr indeksu: ");
        scan.nextInt();

        System.out.printf("%s ,%s ",imie ,nazwisko);
        System.out.println("wiek: "+wiek);
        System.out.println("nr indeksu: "+nrIndexu);


}
}
