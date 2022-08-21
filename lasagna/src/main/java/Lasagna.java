public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int timeElapsed) {
        return expectedMinutesInOven() - timeElapsed;
    }

    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    public int totalTimeInMinutes(int layers, int timeElapsed) {
        return preparationTimeInMinutes(layers) +
            timeElapsed;
    }
}
