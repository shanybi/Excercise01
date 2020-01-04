public class Main {
    public static void main(String[] args) {

        Vehicle[] allVehicles = new Vehicle[10];

        allVehicles[0] = new Car("Porsche", 1234567);
        allVehicles[1] = new Train(01, 12);
        allVehicles[2] = new Car("Mazda", 1425836);
        allVehicles[3] = new Train(05, 7);
        allVehicles[4] = new Car("Mercedes", 8945615);
        allVehicles[5] = new Train(03, 3);
        allVehicles[6] = new Car("Suzuki", 9685274);
        allVehicles[7] = new Train(21, 20);
        allVehicles[8] = new Car("ferrari", 3216598);
        allVehicles[9] = new Train(101, 9);

        Vehicle.printVehicles(allVehicles);
    }
}
