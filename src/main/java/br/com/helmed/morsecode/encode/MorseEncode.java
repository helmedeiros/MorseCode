package br.com.helmed.morsecode.encode;

import java.util.HashMap;
import java.util.Map;

/**
 * Utility class to encode morse.
 * User: helmed
 * Date: 5/26/13
 * Time: 9:46 PM
 */
public class MorseEncode {
    private static Map<String,String> encodeDictionary = new HashMap<String, String>();

    static{
        encodeDictionary.put("A", ".-");
        encodeDictionary.put("B", "-...");
        encodeDictionary.put("C", "-.-.");
        encodeDictionary.put("D", "-..");
        encodeDictionary.put("E", ".");
        encodeDictionary.put("F", "..-.");
        encodeDictionary.put("G", "--.");
        encodeDictionary.put("H", "....");
        encodeDictionary.put("I", "..");
        encodeDictionary.put("J", ".---");
        encodeDictionary.put("K", "-.-");
        encodeDictionary.put("L", ".-..");
        encodeDictionary.put("M", "--");
        encodeDictionary.put("N", "-.");
        encodeDictionary.put("O", "---");
        encodeDictionary.put("P", ".--.");
        encodeDictionary.put("Q", "--.-");
        encodeDictionary.put("R", ".-.");
        encodeDictionary.put("S", "...");
        encodeDictionary.put("T", "-");
        encodeDictionary.put("U", "..-");
        encodeDictionary.put("V", "...-");
        encodeDictionary.put("W", ".--");
        encodeDictionary.put("X", "-..-");
        encodeDictionary.put("Y", "-.--");
        encodeDictionary.put("Z", "--..");
        encodeDictionary.put(" ", "");
        encodeDictionary.put(".", ".-.-.-");
        encodeDictionary.put(",", "--..--");
        encodeDictionary.put("?", "..--..");
        encodeDictionary.put("'", ".----.");
        encodeDictionary.put("!", "-.-.--");
        encodeDictionary.put("/", "-..-.");
        encodeDictionary.put("(", "-.--.");
        encodeDictionary.put(")", "-.--.-");
        encodeDictionary.put("[", "-.--.");
        encodeDictionary.put("]", "-.--.-");
        encodeDictionary.put("&", ".-...");
        encodeDictionary.put(":", "---...");
        encodeDictionary.put(";", "-.-.-.");
        encodeDictionary.put("=", "-...-");
        encodeDictionary.put("-", "-....-");
        encodeDictionary.put("_", "..--.-");
    }

    /**
     * Encode the given {@link String} to the correspondent morse {@link String}.
     * @param letter - The {@link char} alpha numeric information.
     * @return The correspondent morse.
     */
    public static String encode(char letter) {
        return encodeDictionary.get(String.valueOf(letter).toUpperCase());
    }
}
