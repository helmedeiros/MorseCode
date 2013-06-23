package br.com.helmed.morsecode.encode;

import br.com.helmed.morsecode.alphabet.MorseAlphabet;

/**
 * Utility class to encode morse.
 * User: helmed
 * Date: 5/26/13
 * Time: 9:46 PM
 */
public class MorseEncode {
    public static final boolean WITH_SPACE = true;
    public static final boolean WITHOUT_SPACE = false;
    private static MorseAlphabet morseAlphabet = new MorseAlphabet();

    /**
     * Encode the given {@link char} to the correspondent morse {@link String}.
     * @param letter - The {@link char} alpha numeric information.
     * @return The correspondent morse.
     */
    public static String encode(final char letter) {
        return morseAlphabet.get(String.valueOf(letter).toUpperCase());
    }

    /**
     * Encode the given {@link String} to the correspondent morse {@link String}.
     * @param text - The {@link String} alpha numeric information.
     * @return The correspondent morse.
     */
    public static String encode(final String text,  final Boolean withSpace) {
        StringBuilder encodedText = new StringBuilder("");

        final String cleanedText = text.replace("\n", "").replace("\t", "");

        for (char character : cleanedText.toCharArray()) {
            String encode = encode(character);
            if(encode != null) encodedText.append(encode);
            else System.out.println("Null -> "+character);

            if(withSpace) encodedText.append(" ");
        }

        return encodedText.toString().trim();
    }

    /**
     * Encode the given {@link String} to the correspondent morse {@link String}.
     * @param text - The {@link String} alpha numeric information.
     * @return The correspondent morse.
     */
    public static String encodeWithSpace(final String text) {
        return encode(text, WITH_SPACE);
    }

    /**
     * Encode the given {@link String} to the correspondent morse {@link String}.
     * @param text - The {@link String} alpha numeric information.
     * @return The correspondent morse.
     */
    public static String encodeWithoutSpace(final String text) {
        return encode(text, WITHOUT_SPACE);
    }
}
