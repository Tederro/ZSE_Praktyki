package Zadania;

public class ZadaniaPetle {
    public static void main(String[] args) {

        //Zadanie 1

        int x;
        for (x = 0; x <= 20; x+=2) {
            System.out.println("x to =" + x);
        }

        //Zadanie 2

        int z;
        for (z = 30; z >= 0 ; z-=3) {
            System.out.println("z to =" + z);
        }

        //Zadanie 3




        for (int i = 1; i < 10; i++) {
            System.out.println(i + " Przejscie petli");
            for (int j = 1; j < 10; j++) {
                int d = i * j;
                if (d % 2 == 0) {
                    System.out.println(" [i:" + i + "]" + "[j:" + i + "]\t " + i + " * " + i + " = " + d + "\t");
                }
                else {
                    System.out.println(" [i:" + i + "]" + "[j:" + i + "]\t " + i + " * " + i + " = X " + "\t");
                }
            }
        }

        //Zadanie 4

        int o;
        for (o=-40;o<=40;o++){
            if (o%4==0){
                System.out.println("Liczba = " + o);
            }
        }










    }

}
