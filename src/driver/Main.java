package driver;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();

        Drivable[] drivers = new Drivable[] {
            new Marry(),
            new Peter(),
            new Maxim(),
            new Slava()
        };





        for (int i = 0; i < drivers.length; i++) {
            car.driverPlace(drivers[i]);
        }

//        car.driverPlace(new Marry());
    }
}

class Car {
    void driverPlace(Drivable drivable) {
        drivable.driveCar();
    }
}
interface Drivable {
    void driveCar();
}
class UnderageKid {
}

class David {
    public void driveCar() {
        System.out.println("David is driving...");
    }
}
class Marry implements Drivable {
    public void driveCar() {
        System.out.println("Marry is driving a car");
    }
}

class Peter implements Drivable {
    public void driveCar() {
        System.out.println("Peter is driving a car");
    }
}

class Slava implements Drivable {
    public void driveCar() {
        System.out.println("Slava is driving a car");
    }
}

class Maxim implements Drivable {
    public void driveCar() {
        System.out.println("Maxim is driving a car");
    }
}

