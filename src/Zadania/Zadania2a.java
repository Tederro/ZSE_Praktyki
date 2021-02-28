package Zadania;

import java.util.Scanner;

public class Zadania2a {
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
       int liczba = skaner.nextInt();

       if(liczba>0)
           System.out.println("Twoja liczba jest większa od 0");
       if(liczba==0)
           System.out.println("Twoja liczba jest równa 0");
       if(liczba<0)
           System.out.println("Twoja liczba jest mniejsza od 0"); }
}

