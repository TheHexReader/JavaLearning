public class VehicleConstrDemo {
    public static void main(String[] args){
        Vehicle car = new Vehicle(2, 4, 130, 30);
        Vehicle bus = new Vehicle(45, 4, 120, 25);

        double interval = 1;
        double distanceCar = car.distance(interval);
        double distanceBus = bus.distance(interval);

        System.out.println("Автомобиль с " + car.passangers + " пассажирами " + "проедет за 1 час " + distanceCar + " км.");
        System.out.println("Автобус с " + bus.passangers + " пассажирами " + "проедет за 1 час " + distanceBus + " км.");
    }
}

class Vehicle{
    int passangers;
    int wheels;
    int maxspeed;
    int burnup;

    Vehicle(int p, int w, int ms, int bu){
         passangers = p;
         wheels = w;
         maxspeed = ms;
         burnup = bu;
    }

    double distance(double interval) {
        double value = maxspeed * interval;
        return value;
    }
}
