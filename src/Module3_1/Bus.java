package Module3_1;

import Module2_1.Car;

public class Bus extends Car {
    private int passengerCount;

    public Bus(String typeName){
        super(typeName);
        passengerCount = 0;
    }

    public void setPassenger() {
        passengerCount = passengerCount + 1;
    }
    public void setPassengerExit() {
        passengerCount = passengerCount - 1;
    }
}


