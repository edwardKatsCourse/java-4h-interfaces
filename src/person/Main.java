package person;

public class Main {

    public static void main(String[] args) {
        TruckDriver david = new TruckDriver();
        TruckDriver pavel = new TruckDriver();
        TruckDriver anna = new TruckDriver();

        Soldier maxim = new Soldier();

        Driver [] allDrivers = new Driver[] {
                david,
                pavel,
                anna,


                maxim
        };

        Worker [] workers = new Worker[] {
//            david,

            maxim
        };



        PoliceOfficer policeOfficer = new PoliceOfficer();
        policeOfficer.stopDriver(anna);

        policeOfficer.stopDriver(maxim);
    }
}

class PoliceOfficer {
    void stopDriver(Driver driver) {
    }
}

class UnemployedPerson {}

class TruckDriver implements Driver {
    public void drive() {
        System.out.println("Employee can drive");
    }
}

class Student {}

class Soldier implements Driver, Worker {
    public void drive() {
    }
    public void work() {
    }
}

class Retied {}

interface Driver {
    void drive();
}

interface Worker {
    void work();
}
