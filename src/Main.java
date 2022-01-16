import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */

        /* miała być tablica double
        double tab1[] = new double[5];
        */
        int tab1[] = new int[5];
        tab1[0] = 5;
        tab1[1]=25;
        tab1[2]=50;
        tab1[3]=75;
        tab1[4]=100;
        System.out.println(tab1.length);
        for (int i = 0; i < tab1.length; i++){
            System.out.println(tab1[i] + " ");
        }

    }
}
