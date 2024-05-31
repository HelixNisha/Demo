public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();

        vehicle.drive();
        car.drive();
        car.honk();
    }


}

class Vehicle{
    void drive(){
        System.out.println("Drive");
    }
}

class Car extends  Vehicle{
    void drive(){
        System.out.println("Car Drive");
    }

    void honk(){
        System.out.println("Honk");
    }
}