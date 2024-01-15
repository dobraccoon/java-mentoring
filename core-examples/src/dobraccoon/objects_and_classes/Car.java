package dobraccoon.objects_and_classes;

public class Car {
    String name;
    String color;
    SteeringWeel steeringWeel;

    public Car(String newName, String newCalor, SteeringWeel steeringWeel) {
        name = newName;
        color = newCalor;
        this.steeringWeel = steeringWeel;
    }

    public SteeringWeel getSteeringWeel() {
        return steeringWeel;
    }

    public String getColor() {
        return color;
    }

    public void drive() {
        System.out.println("drive 60km/h");
    }

    public void drive(int speed) {
        System.out.println(String.format("drive %skm/h", speed));
    }

    public void drive(String color) {
        System.out.println(String.format("drive 60km/h in %s car", color));
    }

    public void drive(String color, int speed) {
        System.out.println(String.format("drive %skm/h in %s car", speed, color));
    }

    public void drive(int speed, String color) {
        System.out.println(String.format("drive on %s car %skm/h", color, speed));
    }

}
