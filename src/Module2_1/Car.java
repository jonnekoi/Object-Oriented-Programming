package Module2_1;

public class Car {
    public float speed;
    public float gasolineLevel;
    public float tankCapacity;
    public float topSpeed;
    public String typeName;

    public Car() {
        speed = 0;
        gasolineLevel = 0;
        this.tankCapacity = 100;
        this.topSpeed = 100;
        this.typeName = typeName;
    }
    public Car(String typeName) {
        this.speed = 0;
        this.gasolineLevel = 0;
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
    public void setGasolineLevel(float gasolineLevel){
        this.gasolineLevel = gasolineLevel;
    }

    public float getGasolineLevel() {
        return gasolineLevel;
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
}