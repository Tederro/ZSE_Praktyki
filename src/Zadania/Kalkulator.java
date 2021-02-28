package Zadania;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę");
        double a = skaner.nextDouble();
        System.out.println("Podaj drugą liczbę");
        double b = skaner.nextDouble();

        System.out.println("Którą operację chcesz wykonać? (+, -, *, /)");

        char x = skaner.next().charAt(0);

        switch (x) {
            case '+':
                double p = a + b;
                System.out.println("Wynik dodwania: " + p );
                break;
            case '-':
                double m = a - b;
                System.out.println("Wynik odejmowania: " + m);
                break;
            case '*':
                double mn = a * b;
                System.out.println("Wynik mnozenia: " + mn);
                break;
            case '/':
                double dz = a/b;
                System.out.println("Wynik dzielenia: " + dz);
                break;
            default:
                System.out.println("Nie wybrano żadnego działania");
                break;





    }
}
    }
