package dobraccoon.objects_and_classes;

public class SteeringWeel {
    String model;
    String color;

    public SteeringWeel(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void rotate() {
        System.out.println("com.dobraccoon.car_example.SteeringWeel has been rotated");
    }
}
