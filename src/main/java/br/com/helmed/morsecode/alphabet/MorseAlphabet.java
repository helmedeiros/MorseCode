package br.com.helmed.morsecode.alphabet;

import java.util.HashMap;
import java.util.Map;

public class MorseAlphabet {
    public Map<String, String> encodeDictionary = new HashMap<String, String>();

    public MorseAlphabet(){
        this.encodeDictionary.put("A", ".-");
        this.encodeDictionary.put("B", "-...");
        this.encodeDictionary.put("C", "-.-.");
        this.encodeDictionary.put("D", "-..");
        this.encodeDictionary.put("E", ".");
        this.encodeDictionary.put("F", "..-.");
        this.encodeDictionary.put("G", "--.");
        this.encodeDictionary.put("H", "....");
        this.encodeDictionary.put("I", "..");
        this.encodeDictionary.put("J", ".---");
        this.encodeDictionary.put("K", "-.-");
        this.encodeDictionary.put("L", ".-..");
        this.encodeDictionary.put("M", "--");
        this.encodeDictionary.put("N", "-.");
        this.encodeDictionary.put("O", "---");
        this.encodeDictionary.put("P", ".--.");
        this.encodeDictionary.put("Q", "--.-");
        this.encodeDictionary.put("R", ".-.");
        this.encodeDictionary.put("S", "...");
        this.encodeDictionary.put("T", "-");
        this.encodeDictionary.put("U", "..-");
        this.encodeDictionary.put("V", "...-");
        this.encodeDictionary.put("W", ".--");
        this.encodeDictionary.put("X", "-..-");
        this.encodeDictionary.put("Y", "-.--");
        this.encodeDictionary.put("Z", "--..");

        this.encodeDictionary.put(" ", "");
        this.encodeDictionary.put(".", ".-.-.-");
        this.encodeDictionary.put(",", "--..--");
        this.encodeDictionary.put("?", "..--..");
        this.encodeDictionary.put("'", ".----.");
        this.encodeDictionary.put("!", "-.-.--");
        this.encodeDictionary.put("/", "-..-.");
        this.encodeDictionary.put("(", "-.--.");
        this.encodeDictionary.put(")", "-.--.-");
        this.encodeDictionary.put("[", "-.--.");
        this.encodeDictionary.put("]", "-.--.-");
        this.encodeDictionary.put("&", ".-...");
        this.encodeDictionary.put(":", "---...");
        this.encodeDictionary.put(";", "-.-.-.");
        this.encodeDictionary.put("=", "-...-");
        this.encodeDictionary.put("-", "-....-");
        this.encodeDictionary.put("_", "..--.-");
        this.encodeDictionary.put("\"", ".-..-.");
        this.encodeDictionary.put("$", "...-..-");
        this.encodeDictionary.put("@", ".--.-.");

        this.encodeDictionary.put("0", "-----");
        this.encodeDictionary.put("1", ".----");
        this.encodeDictionary.put("2", "..---");
        this.encodeDictionary.put("3", "...--");
        this.encodeDictionary.put("4", "....-");
        this.encodeDictionary.put("5", ".....");
        this.encodeDictionary.put("6", "-....");
        this.encodeDictionary.put("7", "--...");
        this.encodeDictionary.put("8", "---..");
        this.encodeDictionary.put("9", "----.");
    }

    /**
     * Search and return the correspondent {@link String} of the given letter.
     * @param letter - The {@link String} letter from who is needed the correspondent morse.
     * @return the correspondent {@link String} of the given letter.
     */
    public String get(String letter) {
        return encodeDictionary.get(letter);
    }
}