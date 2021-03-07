package Zadania;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;


public class ZadaniaTablice {
    public static void main(String[] args) {

        //Zadanie 1
        char[] array1 = {'z','k','l','p','s','o','i','q','b','c'};
        Arrays.sort(array1);
        System.out.println("Tablica posortowana w porzadku rosnacym: " + Arrays.toString(array1));

        //Zadanie 2

        String[] array2 = {"hdsa","wss","dew","psad","eee","fsaff","graf","lraf","osf","trew"};

        Arrays.sort(array2, Collections.reverseOrder());
        System.out.println("Tablica posortowana w porzadku malejacym: " + Arrays.toString(array2));

        //Zadanie 3

        String pies[] = {"Reksio", "Fafik", "Kłapouch"};
        Random rand = new Random();
        int pies2 = rand.nextInt(pies.length);
        System.out.println("Imie psa brzmi: " +pies[pies2]);

        //Zadanie 4

        String śniadanie[] = {"Jajecznica", "Tosty", "Kanapka z serem"};
        Random rand1 = new Random();
        int śniadanie2 = rand.nextInt(śniadanie.length);

        String obiad[] = {"Schabowe", "Pierogi", "Pizza"};
       Random rand2 = new Random();
        int obiad2 = rand.nextInt(obiad.length);
        String kolacja[] = {"Chipsy", "Cola", "Nic"};
        Random rand3 = new Random();
        int kolacja2 = rand.nextInt(kolacja.length);

        System.out.println("Na sniadanie: " + śniadanie[śniadanie2] + "\t" + "Na obiad: " + obiad[obiad2] + "\t" + "Na kolacje: " + kolacja[kolacja2]);

        //Zadanie 5

        Integer[] Intarray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        Arrays.sort(Intarray, 0,9);
        Arrays.sort(Intarray, 10,20, Collections.reverseOrder());
        System.out.println("Posortowana tablica z zadania 5: " + Arrays.toString(Intarray));


















    }
}
