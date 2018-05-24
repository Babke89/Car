
public class Main {

    public static void main(String[] args) {
        
//        Car myCar = new Car();
//        myCar.printMainAttributes();

        Car companyCar = new Car(150, 30, 2000, false, "ERF-456", 'B', 3500, 6001);

        companyCar.changeModel("Fiat");
        companyCar.changeMaxFuel(150);
        companyCar.fuelUp();
        companyCar.changeConsumption(10);
        companyCar.travel(10);
        companyCar.printMainAttributes();

        Car audi = new Car();
        audi.fuelUp();
        audi.changeModel("Audi");
        audi.changeConsumption(20);
        audi.travel(20);
        audi.printMainAttributes();

    }
}
