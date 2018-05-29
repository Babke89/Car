
public class Car {

    int maxSpeed = 120;
    int minSpeed = 10;
    double weight = 1000;
    boolean isTheCarOn = false;
    String license = "ABC-123";
    char condition = 'A';
    double currentPrice = 3000;
    int mileagePassed = 50000;

    String model;
    int maxFuel;
    int currentFuel;
    int consumption;

    int currentPassengers;
    int maxPassengers;

    public Car() {
        this.model = "default";
        this.currentFuel = 0;
        this.maxFuel = 100;
        this.currentPassengers = 1;
        this.maxPassengers = 5;
    }

    public Car(int maxSpeed, int minSpeed, double weight, boolean isTheCarOn,
            String license, char condition, double currentPrice, int mileagePassed) {

        this.maxSpeed = maxSpeed;
        this.minSpeed = minSpeed;
        this.weight = weight;
        this.isTheCarOn = isTheCarOn;
        this.license = license;
        this.condition = condition;
        this.currentPrice = currentPrice;
        this.mileagePassed = mileagePassed;

    }

    public void printMainAttributes() {
        System.out.println("Model: " + this.model);
        System.out.println("Kapacitet rezervoara: " + this.maxFuel);
        System.out.println("Trenutno gorivo je: " + this.currentFuel);
        System.out.println("Predjena kilometraza: " + this.mileagePassed);
        System.out.println("Trenutno putnika:" + this.currentPassengers + ", maksimalno:" + this.maxPassengers);

    }

    public void printAttributes() {
        System.out.println("Maksimalna brzina je: " + this.maxSpeed);
        System.out.println("Minimalna brzina je: " + this.minSpeed);
        System.out.println("Registracioni broj je: " + this.license);
        System.out.println("Tezina: " + this.condition);
        System.out.println("Trenutna cena: " + this.currentPrice);
        System.out.println("Predjena kilometraza: " + this.mileagePassed);
    }

    public void changeModel(String customModel) {
        this.model = customModel;
    }

    public void changeMaxFuel(int customMaxFuel) {
        this.maxFuel = customMaxFuel;
    }

    public void fuelUp() {
        this.currentFuel = this.maxFuel;

    }

    public void changeConsumption(int customConsumption) {
        this.consumption = customConsumption;

    }

    public void travel(int distance) {

        if (this.currentFuel > distance * this.consumption) {
            this.mileagePassed = this.mileagePassed + distance;
            this.currentFuel = this.currentFuel - distance * this.consumption;
            System.out.println("Putovali ste: " + distance);
        } else {
            System.out.println("Nema dovoljno goriva");

        }

    }

    public void getIn() {
        // Da li ima mesta u automobilu?
        // Ako ima (true)
        //          povecaj broj putnika za jedan
        //          ispisi poruku da je neko usao u au.
        // Ako nema mesta (false)
        //           ispisi poruku da nema mesta

        if (this.currentPassengers < this.maxPassengers) {
            this.currentPassengers = this.currentPassengers + 1;

            System.out.println("Usao jedan putnik, trenutno putnika" + this.currentPassengers);

        } else {

            System.out.println("Dostignut je maksimalan broj putnika");

        }

    }

    public void getOut() {
        if (this.currentPassengers > 0) {
            this.currentPassengers = this.currentPassengers - 1;

            System.out.println("Izasao jedan putnik, trenutno putnika" + this.currentPassengers);

        } else {

            System.out.println("Nema vise putnika");

        }

    }
    
    public void getIn(int numberOfPassengers){
    
    }
    
    public void getOut(int numberOfPassengers){
    
    }
    
    public void changeMaxPassengers(int newMax){
    this.maxPassengers = newMax;
    }
}

