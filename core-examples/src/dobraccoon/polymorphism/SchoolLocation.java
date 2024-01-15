package dobraccoon.polymorphism;

public abstract class SchoolLocation {
    int floorNumber;
    int freePeoplePlacesCount;

    public SchoolLocation(int floorNumber, int freePeoplePlacesCount) {
        this.floorNumber = floorNumber;
        this.freePeoplePlacesCount = freePeoplePlacesCount;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getFreePeoplePlacesCount() {
        return freePeoplePlacesCount;
    }

    public void setFreePeoplePlacesCount(int freePeoplePlacesCount) {
        this.freePeoplePlacesCount = freePeoplePlacesCount;
    }
}
