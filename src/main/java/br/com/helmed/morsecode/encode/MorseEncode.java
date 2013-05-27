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
        encodeDictionary.put("E", ".");
        encodeDictionary.put("I", "..");
        encodeDictionary.put("O", "---");
        encodeDictionary.put("T", "-");
        encodeDictionary.put("N", "-.");
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
