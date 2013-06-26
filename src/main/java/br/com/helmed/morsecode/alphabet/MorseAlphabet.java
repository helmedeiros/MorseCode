package br.com.helmed.morsecode.alphabet;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents the Morse Alphabet.
 * User: helmed
 * Date: 6/23/13
 * Time: 12:53 PM
 */
public class MorseAlphabet implements Alphabet {
    private Map<String, String> morseAlphabetMap = new HashMap<String, String>();

    private Map<String, String> morseLettersMap = new HashMap<String, String>();
    private Map<String, String> morseCharactersMap = new HashMap<String, String>();
    private Map<String, String> morseNumbersMap = new HashMap<String, String>();

    public MorseAlphabet(){
        defineMorseLettersMap();
        this.morseAlphabetMap.putAll(morseLettersMap);

        defineMorseCharactersMap();
        this.morseAlphabetMap.putAll(morseCharactersMap);

        defineMorseNumbersMap();
        this.morseAlphabetMap.putAll(morseNumbersMap);
    }

    private void defineMorseNumbersMap() {
        this.morseNumbersMap.put("0", "-----");
        this.morseNumbersMap.put("1", ".----");
        this.morseNumbersMap.put("2", "..---");
        this.morseNumbersMap.put("3", "...--");
        this.morseNumbersMap.put("4", "....-");
        this.morseNumbersMap.put("5", ".....");
        this.morseNumbersMap.put("6", "-....");
        this.morseNumbersMap.put("7", "--...");
        this.morseNumbersMap.put("8", "---..");
        this.morseNumbersMap.put("9", "----.");
    }

    private void defineMorseCharactersMap() {
        this.morseCharactersMap.put(" ", "");
        this.morseCharactersMap.put(".", ".-.-.-");
        this.morseCharactersMap.put(",", "--..--");
        this.morseCharactersMap.put("?", "..--..");
        this.morseCharactersMap.put("'", ".----.");
        this.morseCharactersMap.put("!", "-.-.--");
        this.morseCharactersMap.put("/", "-..-.");
        this.morseCharactersMap.put("(", "-.--.");
        this.morseCharactersMap.put(")", "-.--.-");
        this.morseCharactersMap.put("[", "-.--.");
        this.morseCharactersMap.put("]", "-.--.-");
        this.morseCharactersMap.put("&", ".-...");
        this.morseCharactersMap.put(":", "---...");
        this.morseCharactersMap.put(";", "-.-.-.");
        this.morseCharactersMap.put("=", "-...-");
        this.morseCharactersMap.put("-", "-....-");
        this.morseCharactersMap.put("_", "..--.-");
        this.morseCharactersMap.put("\"", ".-..-.");
        this.morseCharactersMap.put("$", "...-..-");
        this.morseCharactersMap.put("@", ".--.-.");
    }

    private void defineMorseLettersMap() {
        this.morseLettersMap.put("A", ".-");
        this.morseLettersMap.put("B", "-...");
        this.morseLettersMap.put("C", "-.-.");
        this.morseLettersMap.put("D", "-..");
        this.morseLettersMap.put("E", ".");
        this.morseLettersMap.put("F", "..-.");
        this.morseLettersMap.put("G", "--.");
        this.morseLettersMap.put("H", "....");
        this.morseLettersMap.put("I", "..");
        this.morseLettersMap.put("J", ".---");
        this.morseLettersMap.put("K", "-.-");
        this.morseLettersMap.put("L", ".-..");
        this.morseLettersMap.put("M", "--");
        this.morseLettersMap.put("N", "-.");
        this.morseLettersMap.put("O", "---");
        this.morseLettersMap.put("P", ".--.");
        this.morseLettersMap.put("Q", "--.-");
        this.morseLettersMap.put("R", ".-.");
        this.morseLettersMap.put("S", "...");
        this.morseLettersMap.put("T", "-");
        this.morseLettersMap.put("U", "..-");
        this.morseLettersMap.put("V", "...-");
        this.morseLettersMap.put("W", ".--");
        this.morseLettersMap.put("X", "-..-");
        this.morseLettersMap.put("Y", "-.--");
        this.morseLettersMap.put("Z", "--..");
    }

    /**
     * Search and return the correspondent {@link String} of the given letter.
     * @param letter - The {@link String} letter from who is needed the correspondent morse.
     * @return the correspondent {@link String} of the given letter.
     */
    @Override
    public String fromLetter(String letter) {
        return morseAlphabetMap.get(letter.toUpperCase());
    }

    @Override
    public String toLetter(String morse) {
        String letter = "";
        for (Map.Entry<String, String> cod : morseAlphabetMap.entrySet()) {
            if (cod.getValue().equals(morse)){
                letter = cod.getKey();
            }
        }
        return letter;
    }
}