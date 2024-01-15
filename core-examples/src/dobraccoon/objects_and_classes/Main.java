package dobraccoon.objects_and_classes;

public class Main {
    public static void main(String[] args) {
        SteeringWeel sparcSteeringWeel = new SteeringWeel("sparc", "red");
        Car toyota = new Car("supra", "yellow", sparcSteeringWeel);
        Garage tobysGarage = new Garage(toyota);
    }
}
