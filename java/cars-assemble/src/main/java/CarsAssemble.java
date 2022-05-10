public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double successRate = this.successRate(speed);
        int carsProducedPerHour = 221;

        return speed * carsProducedPerHour * successRate;
    }

    private double successRate(int speed) {
        return switch (speed) {
            case 1, 2, 3, 4 -> 1;
            case 5, 6, 7, 8 -> 0.9;
            case 9 -> 0.8;
            case 10 -> 0.77;
            default -> 0.0;
        };
    }

    public int workingItemsPerMinute(int speed) {
        double carsProducedPerMinute = this.productionRatePerHour(speed) / 60;
        return (int) carsProducedPerMinute;
    }
 
}
