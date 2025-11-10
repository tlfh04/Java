package d.inheritance.Practice;

class Vehicle{
    String model;
    int dailyRate;
    public Vehicle(String model,int dailyRate){
        this.model=model;
        this.dailyRate=dailyRate;
    }
    public double calculateRentalCost(int days) {
        return dailyRate * days;
    }

    @Override
    public String toString() {
        return "model=" + model + ", dailyRate=" + dailyRate;
    }
}

class Car extends Vehicle{
    boolean hasGPS;
    public Car(String model,int dailyRate,boolean hasGPS){
        super(model,dailyRate);
        this.hasGPS=hasGPS;
    }
    @Override
    public double calculateRentalCost(int days) {
        double cost = super.calculateRentalCost(days);
        if (hasGPS) {
            cost += 10000 * days;
        }
        return cost;
    }
    @Override
    public String toString() {
        return "Car{model=" + model + ", dailyRate=" + dailyRate+", hasGPS=" + hasGPS+"}";
    }
}

class Truck extends Vehicle{
    double capacity;
    public Truck(String model,int dailyRate, double capacity){
        super(model,dailyRate);
        this.capacity = capacity;
    }
    @Override
    public double calculateRentalCost(int days) {
        return super.calculateRentalCost(days) + (capacity * 5000 * days);
    }
    @Override
    public String toString() {
        return "Truck{model=" + model + ", dailyRate=" + dailyRate+", capacity=" + capacity+"톤}";
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car("소나타", 50000, true);
        Truck truck = new Truck("포터", 70000, 1.5);

        System.out.println(car);
        System.out.println("3일 대여료: " + (int)(car.calculateRentalCost(3)) + "원");

        System.out.println(truck);
        System.out.println("5일 대여료: " + (int)(truck.calculateRentalCost(5)) + "원");
    }
}
