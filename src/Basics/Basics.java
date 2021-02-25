package Basics;

public class Basics {

    // to jest metoda glowna
    public static void main(String[] args) {

        // liczby calkowite
        int myIntA = 1;
        int myIntB = -32;
        int myIntC = 77;
        System.out.println("To jest zmienna integer A" + myIntA );
        System.out.println(myIntB);
        System.out.println(myIntC);

        // Dodawanie zmiennych
        int sum = myIntA + myIntB + myIntC;
        System.out.println("Dodawanie wynik: " + sum );

        // Odejmowanie zmiennych
        sum = myIntA - myIntB - myIntC;
        System.out.println("Odejmowanie wynik: " + sum);

        // Mnozenie zmiennych
        sum = myIntA * myIntB * myIntC;
        System.out.println("Mnozenie wynik: " + sum);

        // Dzielenie zmiennych
        sum = myIntB / 2;
        System.out.println("Dzielenie B przez 2: " + +sum);

        sum = myIntC / 2;
        System.out.println("Dzielenie C = 77 przez 2: " + sum);

        // float / double
        double myDoubleA = 1.65;
        double myDoubleB = 1.44;

        double sumDouble;
        sumDouble = myDoubleA * myDoubleB;
        System.out.println(sumDouble);


        // znaki ( characters )

        char myCharA = 'F';
        char myCharB = 'T';
        char myCharC = '$';

        System.out.println("Moja ulubiona literka to: " + myCharA);
        System.out.println("Moj ulubiony znak to: " + myCharC);

        int sumChar = myCharA + myCharB + myCharC;
        System.out.println("Suma znakow to : " + sumChar);

        // string ciagi znakow slowa i wyrazy

        String myStringA = "Marcin";
        String myStringB = "lubi placki";
        String myStringC = "z dzemem.";

        System.out.println(myStringA + " " + myStringB + " " + myStringC);
        System.out.println(myStringA + "\n\n\n\n\n" + myStringB + " " + myStringC);
        // boolean
        boolean myBoolean = true;

        System.out.println(!myBoolean);



    }
}
