

package Zadania;

public class Piec {

    interface piecPiekacz {
        void pieczenieChleba();
        void pieczenieCiastek();
    }
    interface piecGrill{
        void grillKurczak();
    }
    public static class Piecyki implements piecPiekacz,piecGrill {
        private int temp;
        private int czas;

        @Override
        public void pieczenieChleba() {
            temp = 250;
            czas = 180;
            wlaczPiec();
        }

        @Override
        public void pieczenieCiastek() {
            temp = 120;
            czas = 350;
            wlaczPiec();
        }

        @Override
        public void grillKurczak() {
            temp = 450;
            czas = 400;
            wlaczPiec();
        }

        private void wlaczPiec() {
            System.out.println("Włączenie pieca " +
                    "Jaką ustawić remperaturę?: " +
                    temp + " Stopni, " + "Czas na: " +
                    czas + " Minut");
        }

        public static void main(String[] args) {
            Piecyki Piece = new Piecyki();
            piecGrill piecGrill=Piece;
            piecPiekacz piecPiekacz=Piece;

            piecPiekacz.pieczenieChleba();
            piecPiekacz.pieczenieCiastek();
            piecGrill.grillKurczak();

        }
    }
}