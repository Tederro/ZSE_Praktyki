package Loops;

public class LekcjaPetle {

    public static void main(String[] args) {

      //  int i;

      //  i = 0;

      //  System.out.println("Pierwsza Petla");

      //  for ( i = 0; i <=0 ; i++ ) {
      //      System.out.println("I to = " + i);
       // }

      //  for (i =10; i >= 0 ; i-=5 ) {
       //     System.out.println("I to = " + 1);
       // }




      //  System.out.println("Druga petla");

      //  for ( int number1 = 0, number2 = 9; number1 <= 9; number1++,number2-- ) {
       //     System.out.println("Number1: = " + number1 + " " + "Number2: " + number2);
      //  }





       // System.out.println("Trzecia petla");

      //  int x = 0;
      //  int y = 0;

      //  while (x != 10) {
      //      x++;
       //     System.out.println(x);
      //  }

      //  while ( x < 20){
      //      x+=2;
      //      y = y+2;
      //      System.out.println(x + " " + y);
      //  }


        System.out.println("Czwarta petla");


        int numberC = 10;

        do {
            System.out.println("Zmienna =" + numberC);
            numberC++;
        } while ( numberC < 12);

        System.out.println("Tabliczka mnozenia");

        for (int i = 1; i < 11; i++){
            System.out.println(i + "przejscie pętli");
            for ( int j = 1; j < 11; j++){
                System.out.println(i * j);
            }

        }

        System.out.println("Kolejna petla");

        for (int x = 0; x <= 20 ; x++) {
            for ( int y = 0 ; y <=5; y ++){
                System.out.println(" x+y = " + (x+y) );
            }
        }







    }



}
