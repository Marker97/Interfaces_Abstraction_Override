public class Car extends Vehicle {
    public int numbersOfDoors;
    public double carPrice;

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("The numbers of doors are " + numbersOfDoors);
    }

    @Override
    void doVehicleSound() {
        System.out.println("Vehicle sounds: Para para para");
    }

    public Car(int numbersOfWheels, int numbersOfDoors, double carPrice){
        super("Car", numbersOfWheels);
        this.numbersOfDoors = numbersOfDoors;
        this.carPrice = carPrice;
    }
}
