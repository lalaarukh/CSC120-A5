import java.util.ArrayList;
//will be used as a container for `Passenger` objects
public class Car {

    private ArrayList<Passenger> passengersOnboard;
    private int currentCapacity;
    private int maxCapacity; 

    public Car(Passenger p, int seats){
        this.p = p;
        this.currentCapacity = seats;
        this.maxCapacity = seats;
    }

    public int getCapacity(){
        return this.currentCapacity;
    }

    public int seatsRemaining(){
        seatsRemaining = maxCapacity - currentCapacity
    }

    public void addPassenger(Passenger){
        // make sure seats are available before adding passengers, else, runtime exception
        if (seatsRemaining >0){
            //add passenger
        } else {
            throw new RuntimeException("No more seats!");
        }
    }

    public void removePassenger(Passenger){
        // make sure passenger is on board before removing them, else, runtime exception
    }

    public void printManifest(){
        //print all passengers on board
    }

}