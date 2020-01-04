public class Vehicle {
public static void printVehicles(Vehicle[] vehicles){
    for (int i = 0; i < vehicles.length; i++) {
        Vehicle tempVehicle = vehicles[i];
        if(tempVehicle instanceof Car) {
            System.out.println("Car model is: " + ((Car) tempVehicle).model + ", Car number is: " + ((Car) tempVehicle).carNumber + ".");
        } else if (tempVehicle instanceof Train){
            System.out.println("Train number is: " + ((Train) tempVehicle).trainNumber + ", Number of carts is: " + ((Train) tempVehicle).numberOfCarts + ".");
        }
    }
}
}
