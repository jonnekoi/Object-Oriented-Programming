package Module3_2;

public class Bus implements Vehicle{

    String fuel, type;
    int capacity;

    public Bus(String fuel, String type, int capacity){
        this.fuel = fuel;
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public void start(){
        System.out.println("Bus is starting...");
    }

    @Override
    public void stop(){
        System.out.println("Bus is stopping...");
    }

    @Override
    public String getInfo(){
        return "Type: " + type + "\nFuel: " + fuel + "\nCapacity: " + capacity + "";
    }
}