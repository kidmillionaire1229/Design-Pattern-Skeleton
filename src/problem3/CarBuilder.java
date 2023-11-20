package problem3;

import problem2.door.Door;
import problem2.factory.CarPartsFactory;
import problem2.roof.Roof;
import problem2.wheel.Wheel;

/**
 * ==============BEGIN==============
 * Complete the below code that requires your implementation
 * If necessary, you can make your own methods or classes so that the corresponding tests are passed
 */
public class CarBuilder implements Builder{

    Car car;
    CarPartsFactory factory;
    public CarBuilder(CarPartsFactory factory) {
        this.factory = factory;
    }

    @Override
    public Builder addDoors(int numDoors) {
        for (int i = 0; i < numDoors; i++) {
            Door door = factory.createDoor();
            this.car.setDoor(door);
        }
        return this;
    }

    @Override
    public Builder addWheels(int numWheels) {
        for (int i = 0; i < numWheels; i++) {
            Wheel wheel = factory.createWheel();
            this.car.setWheel(wheel);
        }
        return this;
    }

    @Override
    public Builder setRoof() {
        Roof roof = factory.createRoof();
        this.car.setRoofs(roof);
        return this;
    }

    @Override
    public Builder setColor(Color color) {
        this.car.setColor(color);
        return this;
    }

    @Override
    public Car getCar() {
        return car;
    }

    @Override
    public void reset() {

    }
}
/**
 * ===============END===============
 */
