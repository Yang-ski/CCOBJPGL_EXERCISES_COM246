public class HybridPickup extends HybridVehicle{

    public HybridPickup(String carName) {
        super(carName);
    }

    public void disfuelling(){
        System.out.print("Your " + carName + " is ");
        fillGas();
    }
}
