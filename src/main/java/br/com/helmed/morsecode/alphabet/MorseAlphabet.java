package br.com.helmed.morsecode.alphabet;

import java.util.HashMap;
import java.util.Map;

public class MorseAlphabet {
    public Map<String, String> morseAlphabetMap = new HashMap<String, String>();

    public MorseAlphabet(){
        this.morseAlphabetMap.put("A", ".-");
        this.morseAlphabetMap.put("B", "-...");
        this.morseAlphabetMap.put("C", "-.-.");
        this.morseAlphabetMap.put("D", "-..");
        this.morseAlphabetMap.put("E", ".");
        this.morseAlphabetMap.put("F", "..-.");
        this.morseAlphabetMap.put("G", "--.");
        this.morseAlphabetMap.put("H", "....");
        this.morseAlphabetMap.put("I", "..");
        this.morseAlphabetMap.put("J", ".---");
        this.morseAlphabetMap.put("K", "-.-");
        this.morseAlphabetMap.put("L", ".-..");
        this.morseAlphabetMap.put("M", "--");
        this.morseAlphabetMap.put("N", "-.");
        this.morseAlphabetMap.put("O", "---");
        this.morseAlphabetMap.put("P", ".--.");
        this.morseAlphabetMap.put("Q", "--.-");
        this.morseAlphabetMap.put("R", ".-.");
        this.morseAlphabetMap.put("S", "...");
        this.morseAlphabetMap.put("T", "-");
        this.morseAlphabetMap.put("U", "..-");
        this.morseAlphabetMap.put("V", "...-");
        this.morseAlphabetMap.put("W", ".--");
        this.morseAlphabetMap.put("X", "-..-");
        this.morseAlphabetMap.put("Y", "-.--");
        this.morseAlphabetMap.put("Z", "--..");

        this.morseAlphabetMap.put(" ", "");
        this.morseAlphabetMap.put(".", ".-.-.-");
        this.morseAlphabetMap.put(",", "--..--");
        this.morseAlphabetMap.put("?", "..--..");
        this.morseAlphabetMap.put("'", ".----.");
        this.morseAlphabetMap.put("!", "-.-.--");
        this.morseAlphabetMap.put("/", "-..-.");
        this.morseAlphabetMap.put("(", "-.--.");
        this.morseAlphabetMap.put(")", "-.--.-");
        this.morseAlphabetMap.put("[", "-.--.");
        this.morseAlphabetMap.put("]", "-.--.-");
        this.morseAlphabetMap.put("&", ".-...");
        this.morseAlphabetMap.put(":", "---...");
        this.morseAlphabetMap.put(";", "-.-.-.");
        this.morseAlphabetMap.put("=", "-...-");
        this.morseAlphabetMap.put("-", "-....-");
        this.morseAlphabetMap.put("_", "..--.-");
        this.morseAlphabetMap.put("\"", ".-..-.");
        this.morseAlphabetMap.put("$", "...-..-");
        this.morseAlphabetMap.put("@", ".--.-.");

        this.morseAlphabetMap.put("0", "-----");
        this.morseAlphabetMap.put("1", ".----");
        this.morseAlphabetMap.put("2", "..---");
        this.morseAlphabetMap.put("3", "...--");
        this.morseAlphabetMap.put("4", "....-");
        this.morseAlphabetMap.put("5", ".....");
        this.morseAlphabetMap.put("6", "-....");
        this.morseAlphabetMap.put("7", "--...");
        this.morseAlphabetMap.put("8", "---..");
        this.morseAlphabetMap.put("9", "----.");
    }

    /**
     * Search and return the correspondent {@link String} of the given letter.
     * @param letter - The {@link String} letter from who is needed the correspondent morse.
     * @return the correspondent {@link String} of the given letter.
     */
    public String fromLetter(String letter) {
        return morseAlphabetMap.get(letter);
    }
}