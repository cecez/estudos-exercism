class Proverb {

    private String[] words;

    public Proverb(String[] words) {
        this.words = words;
    }

    public String recite() {
        if (words.length == 0) return "";
        if (words.length == 1) return "And all for the want of a " + words[0] + ".";

        int firstIndex = 0;
        int secondIndex = 1;
        StringBuilder stringBuilder = new StringBuilder();

        while (true) {
            stringBuilder
                .append("For want of a ")
                .append(words[firstIndex])
                .append(" the ")
                .append(words[secondIndex])
                .append(" was lost.\n");

            if (secondIndex == words.length - 1) break;

            firstIndex++;
            secondIndex++;
        }
        stringBuilder
            .append("And all for the want of a ")
            .append(words[0])
            .append(".");

        return stringBuilder.toString();
    }

}