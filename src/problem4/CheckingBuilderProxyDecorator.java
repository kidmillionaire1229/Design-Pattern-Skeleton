package problem4;

import problem2.factory.CarPartsFactory;
import problem3.Builder;
import problem3.Car;

/**
 * ==============BEGIN==============
 * Complete the below code that requires your implementation
 * If necessary, you can make your own methods or classes so that the corresponding tests are passed
 */
public class CheckingBuilderProxyDecorator extends BaseBuilderProxyDecorator {
    public CheckingBuilderProxyDecorator(Builder builder) {
        super(builder);
    }

    public CheckingBuilderProxyDecorator(CarPartsFactory factory) {
        super(factory);
    }

    @Override
    public Car getCar() {
        Car car = builder.getCar();
        if(!checkCarDoorsValid(car)) return null;
        return car;
    }

    public static boolean checkCarDoorsValid(Car car) {
        int doorSize = car.getDoors().size();
        if (doorSize < 4 || doorSize > 6) {
            return false;
        }
        return true;
    }

}
/**
 * ===============END===============
 */
