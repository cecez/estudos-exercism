import java.util.regex.Pattern;

class SqueakyClean {
    static String clean(String identifier) {
        char[] caracteres = identifier.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        boolean convertToUpper = false;
        for (Character caractere : caracteres) {

            if (Pattern.matches("[α-ω]", caractere.toString())) {
                continue;
            }

            if (Pattern.matches("[-]", caractere.toString())) {
                convertToUpper = true;
                continue;
            }

            if (Character.isWhitespace(caractere)) {
                stringBuilder.append("_");
            } else if (Character.isISOControl(caractere)) {
                stringBuilder.append("CTRL");
            } else if (Character.isLetter(caractere)) {

                if (convertToUpper) {
                    stringBuilder.append(Character.toUpperCase(caractere));
                    convertToUpper = false;
                } else {
                    stringBuilder.append(caractere);
                }

            }
        }

        return stringBuilder.toString();
    }
}
