package Module2_1;

public class Car {
    private float speed;
    private float gasolineLevel;
    private float tankCapacity;
    private float topSpeed;
    private String typeName;

    public Car(String typeName) {
        speed = 0;
        gasolineLevel = 0;
        this.tankCapacity = 100;
        this.topSpeed = 100;
        this.typeName = typeName;
    }

    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }
    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - topSpeed);
        } else
            speed = 0;
    }
    float getSpeed() {
        return speed;
    }
    String getTypeName() {
        return typeName;
    }
    void fillTank() {
        gasolineLevel = tankCapacity;
    }
    float getGasolineLevel() {
        return gasolineLevel;
    }
}