import java.util.HashSet;
import java.util.Set;

class IsogramChecker {
    boolean isIsogram(String phrase) {
        Set<Character> caracteres = new HashSet<>();
        int caracteresValidos = 0;

        for (int i = 0; i < phrase.length(); i++) {
            Character caracter = Character.toLowerCase(phrase.charAt(i));
            if (isValidCharacter(caracter)) {
                caracteres.add(caracter);
                caracteresValidos++;
            }
        }

        return caracteres.size() == caracteresValidos;
    }

    boolean isValidCharacter(Character character) {
        boolean isSpace = character.toString().equals(" ");
        boolean isHyphen = character.toString().equals("-");

        return !isSpace && !isHyphen;
    }
}