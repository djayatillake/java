public class ElonsToyCar {
    private int battery = 100;
    private int driven;
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + driven + " meters";
    }

    public String batteryDisplay() {
        if (battery > 0) {
            return "Battery at " + battery + "%";
        }
        return "Battery empty";
    }

    public void drive() {
        if (battery > 0) {
            driven += 20;
            battery --;    
        }    
    }
}
