public class Test {
    public static void main(String[] args) {
        Car car = new Car(4, 4, 3.000);
        Boat boat = new Boat(1.500 , 400);

        car.showVehicleDetails();
        car.doVehicleSound();

        boat.showVehicleDetails();
        boat.doVehicleSound();

        boat.getBoatWeightAndSpeed();
    }
}
