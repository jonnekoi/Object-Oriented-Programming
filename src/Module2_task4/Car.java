package Module2_task4;


public class Car {
    public float speed;
    private float gasolineLevel;
    private float tankCapacity;
    private float topSpeed;
    private String typeName;
    public int setSpeed;
    public int targetSpeed;

    public int maxTargetSpeed;
    public int minTargetSpeed;
    private boolean cruiseControlOn;


    public Car(String typeName) {
        speed = 0;
        gasolineLevel = 0;
        this.tankCapacity = 100;
        this.topSpeed = 100;
        this.typeName = typeName;
        this.maxTargetSpeed = 90;
        this.minTargetSpeed = 20;
        this.targetSpeed = 0;
        this.setSpeed = 0;
    }

    public void accelerate(int amount) {
        if (!cruiseControlOn || (cruiseControlOn && speed < targetSpeed)) {
            if (gasolineLevel > 0) {
                speed += 10;
                if (speed > topSpeed) {
                    speed = topSpeed;
                }
                System.out.println(getTypeName() + ": speed is " + getSpeed() + " km/h");
            } else {
                speed = 0;
            }
        }
    }
    public void decelerate(int amount) {
        if (!cruiseControlOn || (cruiseControlOn && speed > targetSpeed)) {
            if (gasolineLevel > 0 && amount > 0) {
                speed = Math.max(0, speed - amount);
                System.out.println(getTypeName() + ": speed is " + getSpeed() + " km/h");
            } else {
                speed = 0;
            }
        }
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
    public void turnCruiseControlOn() {
            System.out.println("Cruise control turned on!");
            cruiseControlOn = true;
    }
    public void turnCruiseControlOff() {
        cruiseControlOn = false;
    }
    public void setTargetSpeed(int targetSpeed) {
        if (cruiseControlOn) {
            if (targetSpeed >= minTargetSpeed && targetSpeed <= maxTargetSpeed) {
                this.targetSpeed = targetSpeed;
                adjustSpeedToTarget();
            } else {
                System.out.println("Target speed is out of range.");
            }
        } else {
            System.out.println("Cruise control needs to be turned on.");
        }
    }

    public int getTargetSpeed() {
        return targetSpeed;
    }
    private void adjustSpeedToTarget() {
        if (speed < targetSpeed) {
            while (speed < targetSpeed) {
                accelerate(10);
            }
        } else if (speed > targetSpeed) {
            while (speed > targetSpeed) {
                decelerate(10);
            }
        }
    }
}

