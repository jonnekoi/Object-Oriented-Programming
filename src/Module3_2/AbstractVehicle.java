package Module3_2;

public class AbstractVehicle implements Vehicle{
    String type;
    String fuel;

    public AbstractVehicle(String fuel, String type){
        this.fuel = fuel;
        this.type = type;
    }

    @Override
    public void start() {
        System.out.println("Vehicle is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Vehicle is stopping...");
    }

    @Override
    public String getInfo() {
        return "Type: " + type + "\nFuel: " + fuel;
    }
}
