package Module3_2;

public class AbstractCar extends AbstractVehicle{
    private String color;
    public AbstractCar(String fuel, String type, String color){
        super(fuel, type);
        this.color = color;
    }
}
