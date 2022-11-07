public class Boat extends Vehicle {

    public double maxKnotsSpeed;
    public int boatKilosWeight;

    @Override
    void doVehicleSound() {
        System.out.println("Vehicle sounds: Pooooooow");
    }

    public Boat(double maxKnotsSpeed, int boatKilosWeight){
        super("Boat", 0);
        this.maxKnotsSpeed = maxKnotsSpeed;
        this.boatKilosWeight = boatKilosWeight;
    }
    public void getBoatWeightAndSpeed(){
        System.out.println("The Boat weight is  " + boatKilosWeight + " kilos."  + "\nThe max speed is : " + maxKnotsSpeed + " knots.");
    }


}
