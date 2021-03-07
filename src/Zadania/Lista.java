package Zadania;

import java.util.ArrayList;
import java.util.Collections;

public class Lista {
    public static void main(String[] args) {
        ArrayList<String> lista_gierkomp = new ArrayList<>();
        lista_gierkomp.add("LeagueOfLegends");
        lista_gierkomp.add("WorldOfTanks");
        lista_gierkomp.add("CallOfDuty");
        lista_gierkomp.add("Minecraft");
        System.out.println(lista_gierkomp);

        //Dodanie obiektu
        lista_gierkomp.add("\n" + "Farcry");

        System.out.println(lista_gierkomp);

        //Dodanie obiektu na pozycje z przesunieciem
        lista_gierkomp.add(1,"Terraria");
        System.out.println("\n" + lista_gierkomp);

        //Usuwanie obiektu

        lista_gierkomp.remove("Minecraft");
        System.out.println("\n" + lista_gierkomp);

        //Usuwanie za pomocą indeksu

        lista_gierkomp.remove(2);
        System.out.println("\n" + lista_gierkomp);

        //Zamienianie i nadpisywanie

        lista_gierkomp.set(0, "Dota2");
        System.out.println("\n" + lista_gierkomp);

        //Sortowanie

        Collections.sort(lista_gierkomp);
        System.out.println("\n" + lista_gierkomp);

        //Czyszczenie listy

        lista_gierkomp.clear();
        System.out.println("\n" + lista_gierkomp);





    }
}
