import java.util.ArrayList;
//tie them all together
public class Train{
    private final Engine engine;
    private ArrayList<Car> cars;
    public FuelType fuelType;
    public int nCars;
    private int maxCapacity;
    int totalCapacity = 0;
    int seatsRemaining;
    public Car car = new Car(new Passenger("p"), 5);
    
    //constructor
    public Train(FuelType f, int nCars, int maxCapacity){
        this.engine = new Engine(f, 100);
        this.fuelType = f;
        this.nCars = nCars;
        this.maxCapacity = maxCapacity;
    }

    public Engine getEngine(){
        //return FuelType + fuelCapacity;
        return this.engine;
    }

    public Car getCar(int i){
        //return i car
        return this.cars.get(i);
    }
    
    public int getMaxCapacity(){
        //return max total capacity of all cars 
        for(Car c : this.cars){
            totalCapacity += c.getCapacity();
        }
        return totalCapacity;
    }

    public int seatsRemaining(){
        //return seatsReamining of all cars
        this.seatsRemaining = maxCapacity - totalCapacity;
        return this.seatsRemaining();
    }

    public void printManifest(){
        //print a roster of all passengers on it
        System.out.println("Passengers on board:");
        for (Passenger p : car.passengersOnboard) {
            System.out.println(p.getName());
        }   
    }

}
