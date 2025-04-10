import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
/*
    HybridSedan sedan = new HybridSedan("Honda Civic");
    HybridPickup pickup = new HybridPickup("Toyota Tacoma");
*/
    HybridVehicle car1 = new HybridSedan(null);
    car1.carName = "Honda Civic";
    HybridVehicle car2 = new HybridPickup(null);
    car2.carName = "Toyota Tacoma";

    ArrayList<HybridVehicle> cars = new ArrayList<>();
    cars.add(car1);
    cars.add(car2);

    CarWash wash = new CarWash();
/*
    ((HybridSedan) car1).disCharging();
    ((HybridSedan) car1).disfuelling();
    ((HybridPickup) car2).disfuelling();
    ((HybridPickup) car2).disCharging();
    
    System.out.println();
*/
    ((HybridSedan) car1).disCharging();
    ((HybridSedan) car1).disfuelling();
    wash.Washing(car1);

    System.out.println();

    ((HybridPickup) car2).disCharging();
    ((HybridPickup) car2).disfuelling();
    wash.Washing(car2);
        
    }
}
