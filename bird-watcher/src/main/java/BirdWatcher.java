
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        if (birdsPerDay.length == 0) {
            return 0;
        }
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int i : birdsPerDay) {
            if (i == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        for (int i = 0; i < numberOfDays && i < 7; i++) {
            sum += birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int sum = 0;
        for (int i : birdsPerDay) {
            if (i >= 5) {
                sum += 1;
            }
        }
        return sum;
    }
}
