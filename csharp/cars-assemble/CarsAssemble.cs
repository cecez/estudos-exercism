using System;

static class AssemblyLine
{
    private const int CARS_PRODUCED_PER_HOUR = 221;

    public static double SuccessRate(int speed) =>
        speed switch
        {
            < 1 => 0,
            <= 4 => 1,
            <= 8 => 0.9,
            9 => 0.8,
            10 => 0.77,
            _ => 0
        };

    public static double ProductionRatePerHour(int speed)
    {
        return speed * CARS_PRODUCED_PER_HOUR * SuccessRate(speed);
    }

    public static int WorkingItemsPerMinute(int speed)
    {
        return (int)(ProductionRatePerHour(speed) / 60);
    }
}
