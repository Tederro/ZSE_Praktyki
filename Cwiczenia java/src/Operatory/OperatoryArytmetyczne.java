package Operatory;

public class OperatoryArytmetyczne {

    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int suma = a + b;
        System.out.println(suma);

        int c = 30;
        int d = 15;
        int roznica = c - d;
        System.out.println(roznica);

        //Tu nie bedzie ulamkow

        int g = 10;
        int h = 8;
        int dzielenie = g/h;
        System.out.println(dzielenie);

        //Tu beda ulamki

        double d1 = 10;
        double d2 = 8;
        double dzielenied = d1/d2;
        System.out.println(dzielenied);

        int m1 = 10;
        int m2 = 5;
        int Mnozenie = m1 * m2;
        System.out.println(Mnozenie);

        //Tu wypisze resztę z dzielenia

        int k1 = 29;
        int k2 = 10;
        int dzieleniepr = k1 % k2;
        System.out.println(dzieleniepr);

        //Kolejnosc wykonywania dzialan zostaje zachowana
        int kol = 2 + 2 * 2;
        System.out.println(kol);
        int kol2 = (2+2) * 2;
        System.out.println(kol2);

        //Pierwiastek

        double pw = Math.sqrt(4);
        System.out.println(pw);
        double pw2 = Math.sqrt(16);
        System.out.println(pw2);
        double pw3 = Math.sqrt(8);
        System.out.println(pw3);

        //Potega

        double pot = Math.pow(2, 3);
        System.out.println(pot);

        //Wartosc bezwzgledna

        double bzw = Math.abs(-50);

        System.out.println(bzw);

        //Inkrementacja
        int x = 1
        x++; //Liczba jest zwiekszona o 1

        //Dekrementacja
        int z = 2;
        z--  //Liczba jest zmniejszona o 1





    }
}
