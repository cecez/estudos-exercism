class Lasagna
{
    const int ONE_LAYER_PREPARATION_IN_MINUTES = 2;

    public int ExpectedMinutesInOven() => 40;
   

    public int RemainingMinutesInOven(int actualMinutesInTheOven)
    {
        return ExpectedMinutesInOven() - actualMinutesInTheOven;
    }

    public int PreparationTimeInMinutes(int numberOfLayers)
    {
        return ONE_LAYER_PREPARATION_IN_MINUTES * numberOfLayers;
    }

    public int ElapsedTimeInMinutes(int numberOfAddedLayers, int numberOfMinutesInTheOven)
    {
        return PreparationTimeInMinutes(numberOfAddedLayers) + numberOfMinutesInTheOven;
    }
}
