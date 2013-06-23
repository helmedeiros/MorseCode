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

    @Test public void shouldReturnTheMorseCorrespondentToS() {
        assertEquals("...", MorseEncode.encode('S'));
        assertEquals("...", MorseEncode.encode('s'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToH() {
        assertEquals("....", MorseEncode.encode('H'));
        assertEquals("....", MorseEncode.encode('h'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToR() {
        assertEquals(".-.", MorseEncode.encode('R'));
        assertEquals(".-.", MorseEncode.encode('r'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToD() {
        assertEquals("-..", MorseEncode.encode('D'));
        assertEquals("-..", MorseEncode.encode('d'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToL() {
        assertEquals(".-..", MorseEncode.encode('L'));
        assertEquals(".-..", MorseEncode.encode('l'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToC() {
        assertEquals("-.-.", MorseEncode.encode('C'));
        assertEquals("-.-.", MorseEncode.encode('c'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToU() {
        assertEquals("..-", MorseEncode.encode('U'));
        assertEquals("..-", MorseEncode.encode('u'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToM() {
        assertEquals("--", MorseEncode.encode('M'));
        assertEquals("--", MorseEncode.encode('m'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToW() {
        assertEquals(".--", MorseEncode.encode('W'));
        assertEquals(".--", MorseEncode.encode('w'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToF() {
        assertEquals("..-.", MorseEncode.encode('F'));
        assertEquals("..-.", MorseEncode.encode('f'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToG() {
        assertEquals("--.", MorseEncode.encode('G'));
        assertEquals("--.", MorseEncode.encode('g'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToY() {
        assertEquals("-.--", MorseEncode.encode('Y'));
        assertEquals("-.--", MorseEncode.encode('y'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToP() {
        assertEquals(".--.", MorseEncode.encode('P'));
        assertEquals(".--.", MorseEncode.encode('p'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToB() {
        assertEquals("-...", MorseEncode.encode('B'));
        assertEquals("-...", MorseEncode.encode('b'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToV() {
        assertEquals("...-", MorseEncode.encode('V'));
        assertEquals("...-", MorseEncode.encode('v'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToK() {
        assertEquals("-.-", MorseEncode.encode('K'));
        assertEquals("-.-", MorseEncode.encode('k'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToJ() {
        assertEquals(".---", MorseEncode.encode('J'));
        assertEquals(".---", MorseEncode.encode('j'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToX() {
        assertEquals("-..-", MorseEncode.encode('X'));
        assertEquals("-..-", MorseEncode.encode('x'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToQ() {
        assertEquals("--.-", MorseEncode.encode('Q'));
        assertEquals("--.-", MorseEncode.encode('q'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToZ() {
        assertEquals("--..", MorseEncode.encode('Z'));
        assertEquals("--..", MorseEncode.encode('z'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToSpace() {
        assertEquals("", MorseEncode.encode(' '));
    }

    @Test public void shouldReturnTheMorseCorrespondentToDot() {
        assertEquals(".-.-.-", MorseEncode.encode('.'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToComa() {
        assertEquals("--..--", MorseEncode.encode(','));
    }

    @Test public void shouldReturnTheMorseCorrespondentToQuestionMArk() {
        assertEquals("..--..", MorseEncode.encode('?'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToApostrophe() {
        assertEquals(".----.", MorseEncode.encode('\''));
    }

    @Test public void shouldReturnTheMorseCorrespondentToExclamationMArk() {
        assertEquals("-.-.--", MorseEncode.encode('!'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToSlash() {
        assertEquals("-..-.", MorseEncode.encode('/'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToParenthesisOpen() {
        assertEquals("-.--.", MorseEncode.encode('('));
    }

    @Test public void shouldReturnTheMorseCorrespondentToParenthesisClose() {
        assertEquals("-.--.-", MorseEncode.encode(')'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToBraketOpen() {
        assertEquals("-.--.", MorseEncode.encode('['));
    }

    @Test public void shouldReturnTheMorseCorrespondentToBraketClose() {
        assertEquals("-.--.-", MorseEncode.encode(']'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToAmpersand() {
        assertEquals(".-...", MorseEncode.encode('&'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToColon() {
        assertEquals("---...", MorseEncode.encode(':'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToSemiColon() {
        assertEquals("-.-.-.", MorseEncode.encode(';'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToEqual() {
        assertEquals("-...-", MorseEncode.encode('='));
    }

    @Test public void shouldReturnTheMorseCorrespondentToHifen() {
        assertEquals("-....-", MorseEncode.encode('-'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToUnderLine() {
        assertEquals("..--.-", MorseEncode.encode('_'));
    }

    @Test public void shouldReturnTheMorseCorrespondentToQuote() {
        assertEquals(".-..-.", MorseEncode.encode('"'));
    }
}
