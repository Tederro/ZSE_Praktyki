package Zadania;

public class ZadaniaTablice2 {
    public static void main(String[] args) {

        //Zadanie 1

        int[][] twoDarray = new int[5][5];
        int value = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                twoDarray[i][j] = value;
                value = value + 5;
                System.out.print(twoDarray[i][j] + "\t");
            }
            System.out.println();
        }

        //Zadanie 2

        int[][][][] fourDarray = new int[3][3][3][3];
        int value2 = 0;
        for (int x = 0; x < 3; x++) {

            for (int y = 0; y < 3; y++) {
                for (int k = 0; k < 3; k++) {
                    for (int o = 0; o < 3; o++) {
                        fourDarray[x][y][k][o] = value2;
                        value2 += 1;
                        System.out.print("[" + x + "][" + y + "][" + k + "][" + o + "] = " + fourDarray[x][y][k][o] + "\t");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
