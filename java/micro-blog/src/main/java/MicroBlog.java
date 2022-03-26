class MicroBlog {
    private static final int MAX_POST_LENGTH = 5;

    public String truncate(String input) {
        StringBuilder truncatedInput = new StringBuilder();

        input
            .codePoints()
            .limit(MAX_POST_LENGTH)
            .forEach(truncatedInput::appendCodePoint);
        
        return truncatedInput.toString();
    }
}