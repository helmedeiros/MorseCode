package br.com.helmed.morsecode.encode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test of {@link MorseEncode}
 * User: helmed
 * Date: 5/26/13
 * Time: 9:44 PM
 */
public class MorseEncodeTest {

    @Test public void shouldReturnTheMorseCorrespondentToE() {
        assertEquals(".", MorseEncode.encode('E'));
        assertEquals(".", MorseEncode.encode('e'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToT() {
        assertEquals("-", MorseEncode.encode('T'));
        assertEquals("-", MorseEncode.encode('t'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToA() {
        assertEquals(".-", MorseEncode.encode('A'));
        assertEquals(".-", MorseEncode.encode('a'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToO() {
        assertEquals("---", MorseEncode.encode('O'));
        assertEquals("---", MorseEncode.encode('o'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToI() {
        assertEquals("..", MorseEncode.encode('I'));
        assertEquals("..", MorseEncode.encode('i'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToN() {
        assertEquals("-.", MorseEncode.encode('N'));
        assertEquals("-.", MorseEncode.encode('n'));
    }

}
