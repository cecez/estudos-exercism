class RaindropConverter {

    String convert(int number) {
        StringBuilder output = new StringBuilder();

        boolean isDivisibleBy3 = number % 3 == 0;
        boolean isDivisibleBy5 = number % 5 == 0;
        boolean isDivisibleBy7 = number % 7 == 0;

        if (isDivisibleBy3) {
            output.append("Pling");
        }
        if (isDivisibleBy5) {
            output.append("Plang");
        }
        if (isDivisibleBy7) {
            output.append("Plong");
        }

        if (!isDivisibleBy3 && !isDivisibleBy5 && !isDivisibleBy7) {
            output.append(number);
        }

        return output.toString();
    }

}
