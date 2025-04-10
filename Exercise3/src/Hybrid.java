public class Hybrid implements Electric, InternalCombustion{

    @Override
    public void chargeBattery() {
        System.out.println("Charging Battery");
    }

    @Override
    public void fillGas() {
        System.out.println("Refueling Gas");
        
    }
}
