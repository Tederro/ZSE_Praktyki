package Zadania;

import java.util.Scanner;

public class Zadania2d {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        int pliczba = skaner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int dliczba = skaner.nextInt();
        System.out.println("Podaj trzecią liczbę");
        int tliczba = skaner.nextInt();


        if (pliczba < dliczba && dliczba < tliczba) {
            System.out.println("Podaje liczby są w kolejności rosnącej");
        } else {
            if (pliczba > dliczba && dliczba > tliczba) {
                System.out.println("Podane liczby są w kolejności malejącej");
            } else {
                System.out.println("Brak kolejności");
            }


        }

    }
}

