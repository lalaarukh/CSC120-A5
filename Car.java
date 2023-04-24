import java.util.ArrayList;
//will be used as a container for `Passenger` objects
public class Car {

    public ArrayList<Passenger> passengersOnboard;
    private int currentCapacity;
    private int maxCapacity; 
    Passenger p;

    public Car(Passenger p, int seats){
        this.p = p;
        this.currentCapacity = seats;
        this.maxCapacity = seats;
    }

    public int getCapacity(){
        return this.currentCapacity;
    }

    public int seatsRemaining(){
        int seatsRemaining = maxCapacity - currentCapacity;
        return seatsRemaining;
    }

    public void addPassenger(Passenger p){
        // make sure seats are available before adding passengers, else, runtime exception
        if (this.passengersOnboard.size() < maxCapacity && !this.passengersOnboard.contains(p)){ 
            this.passengersOnboard.add(p);
        } else {
            throw new RuntimeException("No more seats!");
        }
    }

    public void removePassenger(Passenger p){
        // make sure passenger is on board before removing them, else, runtime exception
        if(this.passengersOnboard.contains(p)){
            this.passengersOnboard.remove(p);
        } else {
            throw new RuntimeException("Passenger not on board");
        }
    }

    public void printManifest(){
        //print all passengers on board
        System.out.println("Passengers on board:");
        for (Passenger p : passengersOnboard) {
            System.out.println(p.getName());
        }
    }

}