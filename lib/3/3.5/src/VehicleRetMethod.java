public class VehicleRetMethod {
    public static void main(String[] args){
        Vehicle car = new Vehicle();
        car.passangers = 2;
        car.wheels = 4;
        car.maxspeed = 130;
        car.burnup = 30;

        Vehicle bus = new Vehicle();
        bus.passangers = 45;
        bus.wheels = 4;
        bus.maxspeed = 100;
        bus.burnup = 25;

        double time = 0.5;
        double distanceCar = car.distance(time);
        double distanceBus = bus.distance(time);

        System.out.print("автомобиль с " + car.passangers + " пассажирами ");
        System.out.println("пройдёт за пол часа путь " + distanceCar + " км.");

        System.out.print("автобус с " + bus.passangers + " пассажирами ");
        System.out.println("пройдёт за пол часа путь " + distanceBus + " км.");
    }
}

class Vehicle {
    int passangers;
    int wheels;
    int maxspeed;
    int burnup;

    double distance(double interval){
        double value = maxspeed * interval;
        return value;
    }
}

