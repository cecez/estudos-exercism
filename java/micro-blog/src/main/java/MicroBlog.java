class MicroBlog {
    public String truncate(String input) {
        String[] arr = input.replaceAll("\\p{So}|.", "$0\0").split("\0+");

        StringBuilder output = new StringBuilder("");
        for (int i=0; i < Math.min(5, arr.length); i++) {
            output.append(arr[i]);
        }

        return output.toString();
    }
}