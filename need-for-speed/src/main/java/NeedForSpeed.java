class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    
    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery == 0;
    }

    public int driven;
    public int battery = 100;

    public int distanceDriven() {
        return driven;
    }

    public void drive() {
        if (!batteryDrained()) {
            driven += this.speed;
            battery -= this.batteryDrain;    
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while (car.battery > 0) {
            car.drive();
        }
        return car.driven >= this.distance;
    }
}
