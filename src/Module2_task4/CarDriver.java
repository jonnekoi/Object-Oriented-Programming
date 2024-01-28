package Module2_task4;

import java.util.Scanner;

public class CarDriver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car myCar;

        myCar = new Car("Toyota Corolla");
        myCar.fillTank();

        for (int i = 0; i < 6; i++) {
            myCar.accelerate(10);
        }

        while (myCar.getSpeed() > 0) {
            myCar.decelerate(10);
        }
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Set target speed");
            System.out.println("2. Read current cruise control speed");
            System.out.println("4. Turn on cruise control");
            System.out.println("5. Turn off cruise control");
            int selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    System.out.println("Set the speed: ");
                    int targetSpeed = scanner.nextInt();
                    myCar.setTargetSpeed(targetSpeed);
                    break;
                case 2:
                    System.out.println("Current cruise control speed is: " + myCar.getTargetSpeed() + " km/h");
                    break;
                case 3:
                    myCar.turnCruiseControlOff();
                    break;
                case 4:
                    myCar.turnCruiseControlOn();
                    break;
                case 5:
                    myCar.turnCruiseControlOff();
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
