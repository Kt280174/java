
class Vehicles {}
class Car extends Vehicles {}

public class Main {
    public static void main(String[] args) {
        Vehicles myCar = new Car();

        if (myCar instanceof Car) {
            System.out.println("myCar является экземпляром Car.");
        } else {
            System.out.println("myCar не является экземпляром Car.");
        }

        if (myCar instanceof Vehicles) {
            System.out.println("myCar является экземпляром Vehicles.");
        }
    }
}