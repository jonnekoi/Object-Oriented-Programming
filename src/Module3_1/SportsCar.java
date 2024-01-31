package Module3_1;


import Module2_1.Car;

public class SportsCar extends Car {
    public SportsCar(String typeName) {
        super(typeName);
    }

    @Override
    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 20;
            setGasolineLevel(getGasolineLevel() - 10);
        }else
            speed = 0;
    }

    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - topSpeed);
        } else
            speed = 0;
    }
}
