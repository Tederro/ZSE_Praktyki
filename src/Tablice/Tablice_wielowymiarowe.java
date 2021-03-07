package Tablice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Tablice_wielowymiarowe {
    public static void main(String[] args) {

        int[][] twoDarray = new int[10][20]; //10 * 20 = 200 elementow

        int[][][] threeDarray = new int[5][10][20]; //5 * 10 * 20 = 1000 elementow

        twoDarray[0][0] = 1;

        System.out.println("twoDarray = " + twoDarray[0][0]);

//        int[][] array2 = new int[10][10];
//        int value = 1;
//        for (int i = 0; i < 10; i++){
//            for(int j = 0; j < 10; j++){
//                array2[i][j] = value;
//                value++;
//                System.out.print(array2[i][j] + "\t");
//
//            }
//            System.out.println();
//        }

//        int[][][] array3 = new int[3][3][3];
//        int value2 = 0;
//        for (int i = 0; i < 3; i++){
//            for(int j = 0; j < 3; j++){
//                for (int n = 0; n < 3; n++){
//                    array3[i][j][n] = value2;
//                    value2 += 3;
//                    System.out.print("[" + 1 + "][" + j + "][" + n + "] = " + array3[i][j][n] + "\t" );
//                }
//                System.out.println();
//
//
//            }
//            System.out.println();
//        }
        System.out.println("Wypisywanie tablicy: ");
        String[] owoce = new String[3];
        owoce[0] = "Mango";
        owoce[1] = "Banan";
        owoce[2] = "Truskawka";
        System.out.println(Arrays.toString(owoce));
        System.out.println(owoce[0] = ", " + owoce[1] + ", " + owoce[2]);

        System.out.println("Wypisywanie listy: ");
        ArrayList<String> lista_owocow = new ArrayList<>();
        lista_owocow.add("Mango");
        lista_owocow.add("Banan");
        lista_owocow.add("Trsukawka");


        ArrayList<String> lista_owocow2 = new ArrayList<>();
        lista_owocow2.add("Mango");
        lista_owocow2.add("Banan");
        lista_owocow2.add("Trsukawka");
        lista_owocow2.add("Jabłko");
        System.out.println(lista_owocow2);

        lista_owocow2.add(1, "Maracuja");
        System.out.println(lista_owocow2);


        lista_owocow2.remove("Banan");
        lista_owocow2.remove(2);
        System.out.println(lista_owocow2);

        lista_owocow2.set(0, "Arbuz");
        System.out.println(lista_owocow2);

        Collections.sort(lista_owocow2);
        System.out.println(lista_owocow2);

        lista_owocow2.clear();
        System.out.println(lista_owocow2);





    }




}
