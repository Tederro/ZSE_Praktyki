package Statements;

import java.util.Scanner;

public class Lekcja_statements {


    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

//        boolean stan = false;
//
//        if (stan) {
//            System.out.println("Wykonała sie instrukcja if");
//        }
//        else {
//            System.out.println("Wykonała sie instrukcja else");
//        }
//
//        Scanner skaner = new Scanner(System.in);
//        System.out.println("Podaj swój wiek: ");
//        int wiek = skaner.nextInt();
//
//        if(wiek >= 18){
//            System.out.println("Jesteś pełnoletni");
//        }
//        else {
//            System.out.println("Jesteś niepełnoletni");
//        }

//        System.out.println("Podaj liczbę: ");
//        int liczba = skaner.nextInt();
//
//        if (10 < liczba && liczba < 20) {
//            System.out.println("Liczba mieści się w zakresie.");
//        } else {
//            System.out.println("Liczba nie mieści się w zakresie.");
//        }
//
//        System.out.println("Podaj liczbę całkowitą A: ");
//        int a = skaner.nextInt();
//
//        System.out.println("Podaj liczbe całkowita B: ");
//        int b = skaner.nextInt();
//
//        if (a > b) {
//            System.out.println("A jest wieksze od B");
//        }
//        if (a < b) {
//            System.out.println("A jest mniejsze od B");
//        }
//        if (a == b) {
//            System.out.println("A jest równe B");
//        }
//
//        if (a > b) {
//            System.out.println("A jest wieksze od B");
//        }
//        else {
//            if (a < b) {
//                System.out.println("A jest mniejsze od B");
//            }
//            else {
//                System.out.println("A jest równe B");
//            }
//        }

//        char charA = 'A';
//        char charB = 'B';
//
//        if (charA > charB){
//            System.out.println("charA ma wieksza wartosc od charB w tabeli ASCII");
//        }
//        else{
//            System.out.println("charA ma mniejsza wartosc od charB w tabeli ASCII");
//        }

//



//        System.out.println("Podaj swój wybór (1, 2, A, B): ");
//        String y = skaner.next();
//
//        switch (y) {
//            case "1":
//                System.out.println("Przypadek pierwszy.");
//                break;
//            case "2":
//                System.out.println("Przypadek drugi.");
//                break;
//            case "A":
//                System.out.println("Przypdek A.");
//                break;
//            case "B":
//                System.out.println("Przypadek B.");
//                break;
//            default:
//                System.out.println("Nie wybrano poprawnej opcji.");
//                break;
//
//
//        }

        System.out.println("Podaj swój wybór (1, 2, A, B): ");
        char z = skaner.next().charAt(0);

        switch (z) {
            case '1':
                System.out.println("Przypadek pierwszy.");
                break;
            case '2':
                System.out.println("Przypadek drugi.");
                break;
            case 'A':
                System.out.println("Przypdek A.");
                break;
            case 'B':
                System.out.println("Przypadek B.");
                break;
            default:
                System.out.println("Nie wybrano poprawnej opcji.");
                break;


        }
    }

}
