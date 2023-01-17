class TwelveDays {

    private static final String[] cardinalName = {
            "",
            "first",
            "second",
            "third",
            "fourth",
            "fifth",
            "sixth",
            "seventh",
            "eighth",
            "ninth",
            "tenth",
            "eleventh",
            "twelfth"
    };

    private static final String[] numeralGifts = {
            "",
            "a Partridge in a Pear Tree",
            "two Turtle Doves",
            "three French Hens",
            "four Calling Birds",
            "five Gold Rings",
            "six Geese-a-Laying",
            "seven Swans-a-Swimming",
            "eight Maids-a-Milking",
            "nine Ladies Dancing",
            "ten Lords-a-Leaping",
            "eleven Pipers Piping",
            "twelve Drummers Drumming"
    };

    String verse(int verseNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append("On the ")
                .append(cardinalName[verseNumber])
                .append(" day of Christmas my true love gave to me: ");

        stringBuilder.append(gifts(verseNumber));
        stringBuilder.append(".\n");

        return stringBuilder.toString();
    }

    private String gifts(int verseNumber) {
        if (verseNumber == 1) return numeralGifts[1];

        StringBuilder stringBuilder = new StringBuilder();
        for (int v = verseNumber; v > 1; v--) {
            stringBuilder
                    .append(numeralGifts[v])
                    .append(", ");
        }
        stringBuilder
                .append("and ")
                .append(numeralGifts[1]);

        return stringBuilder.toString();
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int v = startVerse; v <= endVerse; v++) {
            stringBuilder.append(verse(v));
            if (v != endVerse) stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    
    String sing() {
        return verses(1, 12);
    }
}
