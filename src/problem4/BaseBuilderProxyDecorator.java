package problem4;

import problem2.factory.CarPartsFactory;
import problem3.Builder;
import problem3.Car;
import problem3.Color;

/**
 * ==============BEGIN==============
 * Complete the below code that requires your implementation
 * If necessary, you can make your own methods or classes so that the corresponding tests are passed
 */
public class BaseBuilderProxyDecorator implements Builder {
    private Builder builder;

    private CarPartsFactory carPartsFactory;

    public BaseBuilderProxyDecorator(Builder builder) {
        this.builder = builder;
    }

    public BaseBuilderProxyDecorator(CarPartsFactory factory){
        this.carPartsFactory = factory;
    }

    @Override
    public Builder addDoors(int numDoors) {
        return builder.addDoors(numDoors);
    }

    @Override
    public Builder addWheels(int numWheels) {
        return builder.addWheels(numWheels);
    }

    @Override
    public Builder setRoof() {
        return builder.setRoof();
    }

    @Override
    public Builder setColor(Color color) {
        return builder.setColor(color);
    }

    @Override
    public Car getCar() {
        return null;
    }

    @Override
    public void reset() {

    }
}
/**
 * ===============END===============
 */
