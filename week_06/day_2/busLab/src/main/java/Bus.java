import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getDestination() {
        return this.destination;
    }

    public int getNumberOfPassengers(){
        return this.passengers.size();
    }

    public void addPassenger(Person person){
            this.passengers.add(person);
    }

    public void removePassenger(){
        this.passengers.remove(0);
    }

    public void pickUpPassenger(Person person, BusStop busstop){
        if (getCapacity() > getNumberOfPassengers()) {
            addPassenger(person);
            busstop.removeFromQueue();
        }

    }

}
