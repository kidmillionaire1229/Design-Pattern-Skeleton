package problem4;

import problem2.factory.CarPartsFactory;
import problem2.roof.Roof;
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
        Car car = super.getCar();
        if(!checkCarDoorsValid(car)) return null;
        if(!checkCarWheelsValid(car)) return null;
        if(!checkCarRoofValid(car)) return null;
        return car;
    }

    public static boolean checkCarDoorsValid(Car car) {
        int doorSize = car.getDoors().size();
        if (doorSize < 4 || doorSize > 6) {
            return false;
        }
        return true;
    }

    public static boolean checkCarWheelsValid(Car car) {
        int wheelSize = car.getWheels().size();
        if (wheelSize % 2 ==1){
            return false;
        }
        if (wheelSize <2 || wheelSize >6){
            return false;
        }
        return true;
    }

    public static boolean checkCarRoofValid(Car car){
        Roof roof = car.getRoof();
        if (roof == null){
            return false;
        }
        else{
            return true;
        }
    }

}
/**
 * ===============END===============
 */
