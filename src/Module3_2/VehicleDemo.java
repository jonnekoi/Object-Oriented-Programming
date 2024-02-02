package Module3_2;

public class VehicleDemo {
    public static void main(String [] args){
        Car car = new Car("Petrol", "Car", "Red");
        Motorcycle motorcycle = new Motorcycle("Gasoline", "Motorcycle", "Black");
        Bus bus = new Bus("Diesel", "Bus", 40);
        System.out.println("Vehicle Demonstration");
        car.start();
        car.stop();
        System.out.println(car.getInfo());
        System.out.println("");
        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo());
        System.out.println("");
        bus.start();
        bus.stop();
        System.out.println(bus.getInfo());
    }
}
