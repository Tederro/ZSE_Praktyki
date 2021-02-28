package Zadania;

import java.util.Scanner;

public class Zadania2c {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        System.out.println("Podaj login: ");

        String login = skaner.next();

        System.out.println("Podaj haslo: ");

        String haslo = skaner.next();

        if (login.equals("Dawid") && haslo.equals("Blonski")) {
            System.out.println("Pomyślnie zalogowano");
        } else {
            System.out.println("Nieautoryzwoany użytkownik");


        }
    }

}
