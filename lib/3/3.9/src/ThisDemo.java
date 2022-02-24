class Vehicle {
    int passangers;
    int wheels;
    int maxspeed;
    int burnup;

    Vehicle(int passangers, int wheels, int maxspeed, int burnup){
        this.passangers = passangers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }

    double distance(double interval){
        double value = this.maxspeed * interval;
        return value;
    }
}
