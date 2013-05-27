package br.com.helmed.morsecode.encode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: helmed
 * Date: 5/26/13
 * Time: 9:44 PM
 */
public class MorseEncodeTest {

    @Test public void shouldReturnTheMorseCorrespondentToE() {
        assertEquals(".", MorseEncode.encode('E'));
        assertEquals(".", MorseEncode.encode('e'));
    }

}
