package Zadania;

import java.util.Scanner;

public class Zadania2b {
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);
        System.out.println("Wprowadź pierwszą liczbę");
        int pliczba = skaner.nextInt();
        System.out.println("Wprowadź drugą liczbę");
        int dliczba = skaner.nextInt();
        System.out.println("Wprowadź trzecią liczbę");
        int tliczba = skaner.nextInt();


        if (pliczba > dliczba && pliczba > tliczba) {
            System.out.println("Najwieksza jest liczba: " + pliczba);
        } else {
            if (dliczba > pliczba && dliczba > tliczba) {
                System.out.println("Najwieksza jest liczba: " + dliczba);
            } else {
                System.out.println("Najwieksza jest liczba: " + tliczba);
            }





        }
    }
}
