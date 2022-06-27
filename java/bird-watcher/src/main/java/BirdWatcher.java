
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeekCounts = {0, 2, 5, 3, 7, 8, 4};
        return lastWeekCounts;
    }

    public int getToday() {
        if (this.birdsPerDay.length == 0) {
            return 0;
        }

        int lastDayIndex = this.birdsPerDay.length - 1;
        return this.birdsPerDay[lastDayIndex];
    }

    public void incrementTodaysCount() {
        int todayCount = this.getToday();
        todayCount++;
        int lastDayIndex = this.birdsPerDay.length - 1;
        this.birdsPerDay[lastDayIndex] = todayCount;
    }

    public boolean hasDayWithoutBirds() {
        for (int i = 0; i < this.birdsPerDay.length; i++) {
            if (this.birdsPerDay[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        if (numberOfDays > this.birdsPerDay.length) {
            numberOfDays = this.birdsPerDay.length;
        }

        int birdsCounted = 0;
        for (int i = 0; i < numberOfDays; i++) {
            birdsCounted += this.birdsPerDay[i];
        }
        return birdsCounted;
    }

    public int getBusyDays() {
        int busyDaysCount = 0;
        for (int birdCount : this.birdsPerDay) {
            if (birdCount >= 5) {
                busyDaysCount++;
            }
        }
        return busyDaysCount;
    }
}
