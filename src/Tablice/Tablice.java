package Tablice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Tablice {
    public static void main(String[] args) {

//        //1 sposob
//        int[] array = {1, 45, 56, -23};
//        //2 sposob
//        int array2[] = {-7, 6, 52, 2, 100, 0, 777};
//
//        System.out.println("Element pierwszy tablicy array[0]: " + array[0]);
//        System.out.println("Długość tablicy array: " + array.length);
//        System.out.println("Element pierwszy tablicy array2[0]: " + array2[0]);
//        System.out.println("Długość tablicy array2: " + array2.length);
//
//        System.out.println("Tablica array przed zmianą: " + Arrays.toString(array));
//
//        array[0] = 15;
//        array[1] = 10;
//        array[2] = 5;
//        array[3] = 0;
//
//        System.out.println("Tablica array po zamianie: " + Arrays.toString(array));

//        //Wypisywanie wszystkich elementów tablicy za pomocą pętli FOR
//        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println("\n\narray3 = {");
//        for (int i = 0; i < array3.length; i++){
//            if(i == array3.length - 1){
//                System.out.println(array3[i] + "};");
//
//            }
//            else{
//                System.out.println(array3[i] + ", ");
//            }
//        }

        int[] intArray = {6, 1, 5, 2, 8, 10, 4, 3, 7, 9};
        Arrays.sort(intArray);
        System.out.println("Sortowanie w porządku rosnącym: " + Arrays.toString(intArray));

        Integer[] intArray2 = {6, 1, 5, 2, 8, 10, 4, 3, 7, 9};

        Arrays.sort(intArray2, Collections.reverseOrder());
        System.out.println("Sortowanie w porzadku malejacym: " + Arrays.toString(intArray2));

        /*
        Składnia funkcji sort()
        sort(nazwaTablicy, poczatkowyIndex, koncowyIndex)
        poczatkowyIndex - (Wlacznie)
        koncowyIndex - (Bez niego)
         */

        Arrays.sort(intArray2, 2, 8);
        System.out.println("Sortowanie z zakresem: " + Arrays.toString(intArray));

        char[] charArray = {'z', 'w', 'j', 'e', 'g', 's', 'p' ,'q', 'm', 'a', 'c', 'o',
                'f'};
        Arrays.sort(charArray);
        System.out.println("Sortowanie w porzadku rosnacym " + Arrays.toString(charArray));

        Character[] charArray2 = {'z', 'w', 'j', 'e', 'g', 's', 'p' ,'q', 'm', 'a', 'c', 'o',
                'f'};
        Arrays.sort(charArray2, Collections.reverseOrder());

        System.out.println("Sortowanie w porzadku malejacym " + Arrays.toString(charArray2));

        String[] stringArray = {"~", "Ala", "ma", "kota", ",", "a", "pies",};
        Arrays.sort(stringArray);
        System.out.println("Sortowanie w porzadku rosnacym: " + Arrays.toString(stringArray));

        Arrays.sort(stringArray, Collections.reverseOrder());
        System.out.println("Sortowanie w porzadku malejacym: " + Arrays.toString(stringArray));

        Random rand = new Random();

        int rand_int1 = rand.nextInt(10); //od 0 do 9

        System.out.println("Wartość rand_int1: " + rand_int1);

        int rand_int2 = rand.nextInt(10) + 1; // od 1 do 10

        System.out.println("Wartosc rand_int2: " + rand_int2);

        int rand_int3 = rand.nextInt(10000);

        System.out.println("Wartosc rand_int3: " + rand_int3);

        double rand_double1 = rand.nextDouble();

        System.out.println("Wartosc rand_double1: " + rand_double1); //Liczba pomiedzy 0.0 a 1.0

        boolean rand_boolean1 = rand.nextBoolean();

        System.out.println("Wartosc rand_boolean1: " + rand_boolean1); //randomowo true or false



    }
}
