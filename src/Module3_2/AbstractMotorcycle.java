package Module3_2;

public class AbstractMotorcycle extends AbstractVehicle{
    private String color;
    public AbstractMotorcycle(String fuel, String type, String color){
        super(fuel, type);
        this.color = color;
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}