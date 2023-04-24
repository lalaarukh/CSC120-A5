//will represent the locomotive engine, storing information about its fuel type, level, etc
public class Engine {

    private FuelType f;
    double currentFuelLevel;
    double maxFuelLevel;

    //accessors
    public double getFuelLevel(){
        return currentFuelLevel;
    }
    //constructor
    public Engine(FuelType f, double fuel){
        this.f = f;
        this.currentFuelLevel = fuel;
        this.maxFuelLevel = fuel;
    }

    //method
    public void refuel(){
        //resets fuel level to max
        this.currentFuelLevel = this.maxFuelLevel;
    }

    public void go(){
        //decrease current fuel level and print remaining fuel if >=0 else runtimeexception
        if(this.currentFuelLevel >= 5){
            //assume 5 is the fuel consumed every time this method is called
            this.currentFuelLevel -= 5;
            System.out.println("The train has" + currentFuelLevel + "remaining.");
        } else {
            throw new RuntimeException("Out of Fuel!");
        }
        
    }
}
