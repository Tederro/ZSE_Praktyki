package Zadania;

 class Dziedziczenieprzyklad {

    public static class Vehicle {
        protected final int tankCapacity = 60;
        protected int fuelLevel = 40;

        public void fillTank() {
            int toFill = tankCapacity - fuelLevel;
            fillTank(toFill);
        }

        public void fillTank(int toFill){
            if (toFill + fuelLevel > tankCapacity){
                System.out.println("Nie można napełnić baku " + toFill + " litrami paliwa.");
            }
            else{
                fuelLevel += toFill;
                System.out.println("Napełniono bak " + toFill + " litrami paliwa.");
            }
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        System.out.println("Maksymalny poziom paliwa w baku: " + vehicle.tankCapacity);
        System.out.println("Poziom paliwa w baku: " + vehicle.fuelLevel);
        vehicle.fillTank();
        System.out.println("Poziom paliwa w baku: " + vehicle.fuelLevel);
        vehicle.fillTank(10);

    }

}
