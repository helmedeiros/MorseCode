package br.com.helmed.morsecode.alphabet;

/**
 * User: helmed
 * Date: 6/23/13
 * Time: 4:43 PM
 */
public interface Alphabet {
    String fromLetter(String letter);

    String toLetter(String morse);
}
