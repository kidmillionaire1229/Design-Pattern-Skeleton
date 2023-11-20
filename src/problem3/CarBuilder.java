package problem3;

import problem2.factory.CarPartsFactory;

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
        return null;
    }

    @Override
    public Builder addWheels(int numWheels) {
        return null;
    }

    @Override
    public Builder setRoof() {
        return null;
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
