//will store information about an individual passenger
public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public void boardCar(Car c){
        c.addPassenger(this);

    }

    public void getoffCar(Car c){
        c.removePassenger(this);
    }
}
