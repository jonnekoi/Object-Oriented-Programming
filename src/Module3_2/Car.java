package Module3_2;

public class Car implements Vehicle{

    String fuel, type, color;

    public Car(String fuel, String type, String color){
        this.fuel = fuel;
        this.type = type;
        this.color = color;
    }

    @Override
    public void start(){
        System.out.println("Car is starting...");
    }

    @Override
    public void stop(){
        System.out.println("Car is stopping...");
    }

    @Override
    public String getInfo(){
        return "Type: " + type + "\nFuel: " + fuel + "\nColor: " + color + "";
    }
}
