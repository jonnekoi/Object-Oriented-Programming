package Module3_2;

public class AbstractBus extends AbstractVehicle{
    private int capacity;
    public AbstractBus(String fuel, String type, int capacity){
        super(fuel, type);
        this.capacity = capacity;
    }

    @Override
    public String getInfo() {
        return String.format ("Type: " + this.type + "Fuel: " + this.fuel + "Capacity: " + this.capacity);
    }
}
