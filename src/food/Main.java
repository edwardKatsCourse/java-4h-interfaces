package food;

public class Main {


    //Real object will be passed-in in Compile Time
    public static void aaa(Milky obj) { //GoatCheese extends Object
        obj.toString();
    }


    public static void main(String[] args) {
        PorkMeat pork = new PorkMeat();

        BeefMeat beef = new BeefMeat();

        Milky cheese = generateCheese();
//        cheese.goatCheeseMethod();

        cheese.milky();


        Fish fish = new Fish();

        Meaty[] meatRestaurant = new Meaty[] {
                new BeefMeat(),
                new ChickenMeat()
        };

        haveSomeFood(fish);
    }

    public static Milky generateCheese() {
        if (true) {
            return new Cheese();
        } else {
            return new GoatCheese();
        }
    }

    public static void haveSomeFood(Kosher kosherFood) {
    }
}

interface Kosher {}

interface Parve {}

interface Milky {
    void milky();
}
interface Meaty {}

class Cheese implements Kosher, Milky {
    public void regularCheeseMethod() {
    }

    public void milky() {
        System.out.println("regular cheese");
    }
}

class GoatCheese implements Milky, Kosher {

    public void milky() {
        System.out.println("goat cheese");
    }

    public void goatCheeseMethod() {
    }
}


class Fish implements Kosher, Parve {}
class Bread implements Kosher, Parve {}

class PorkMeat {}

class BeefMeat implements Kosher, Meaty {}
class ChickenMeat implements Kosher, Meaty {}
