package problem3;

import problem2.CompanyName;
import problem2.door.Door;
import problem2.roof.Roof;
import problem2.wheel.Wheel;

import java.util.ArrayList;
import java.util.List;

/**
 * ==============BEGIN==============
 * Complete the below code that requires your implementation
 * If necessary, you can make your own methods or classes so that the corresponding tests are passed
 */
public class Car {
    private List<Door> doors;
    private List<Wheel> wheels;
    private List<Roof> roofs;
    private Color color;

    public Car setDoor(Door door) {
        this.doors.add(door);
        return this;
    }

    public Car setWheel(Wheel wheel) {
        this.wheels.add(wheel);
        return this;
    }

    public Car setRoofs(Roof roof) {
        this.roofs.add(roof);
        return this;
    }

    private CompanyName companyName;

    public Car() {
        this.doors = new ArrayList<>();
        this.wheels = new ArrayList<>();
        this.roofs = new ArrayList<>();
        this.color = Color.BLACK;
    }

    public int numWheels() { return wheels.size(); }

    public int numDoors() {
        return doors.size();
    }

    public int numRoofs() {
        return roofs.size();
    }

    public Car setColor(Color color) {
        this.color = color;
        return this;
    }

    public Color getColor() {
        return color;
    }

    public CompanyName getCompanyName() {
        return null;
    }

    public List<Door> getDoors() {
        return null;
    }

    public List<Wheel> getWheels() {
        return null;
    }

    public Roof getRoof() {
        return null;
    }
}
/**
 * ===============END===============
 */
