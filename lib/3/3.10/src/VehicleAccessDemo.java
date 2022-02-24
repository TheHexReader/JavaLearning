public class VehicleAccessDemo {
    public static void main(String[] args){
        Vehicle ferrari = new Vehicle(2, 4, 360, 12);
        double distance = ferrari.distance(0.5);
        System.out.println("Ferrari за полчаса проедет " + distance + " км.");
//        System.out.println("Скорость Ferrari: " + ferrari.maxspeed + " км/ч.");
    }
}

class Vehicle {
    int passangers;
    int wheels;
    private int maxspeed;
    int burnup;

    Vehicle(int passangers, int wheels, int maxspeed, int burnup){
        this.passangers = passangers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }

    double distance(double interval){
        double val = this.maxspeed * interval;
        return val;
    }
}
