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

    /**
     * Encode the given {@link String} to the correspondent morse {@link String}.
     * @param letter - The {@link char} alpha numeric information.
     * @return The correspondent morse.
     */
    public static String encode(char letter) {
        Map<String,String> morseDictionary = new HashMap<String, String>();
        morseDictionary.put("E", ".");
        morseDictionary.put("T", "-");

        if(letter == 'e' || letter == 'E') return morseDictionary.get(String.valueOf(letter).toUpperCase());
        if(letter == 't' || letter == 'T') return morseDictionary.get(String.valueOf(letter).toUpperCase());

        return "";
    }
}
