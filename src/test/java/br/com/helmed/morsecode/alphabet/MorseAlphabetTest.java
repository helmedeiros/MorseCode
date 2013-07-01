package br.com.helmed.morsecode.alphabet;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *  Unit test of {@link MorseAlphabet}
 * User: helmed
 * Date: 6/23/13
 * Time: 12:54 PM
 */
public class MorseAlphabetTest {
    private Alphabet morseAlphabet = new MorseAlphabet();
    
    @Test public void shouldReturnTheMorseCorrespondentToE() {
        assertEquals(".", morseAlphabet.fromLetter("E"));
        assertEquals(".", morseAlphabet.fromLetter("e"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToT() {
        assertEquals("-", morseAlphabet.fromLetter("T"));
        assertEquals("-", morseAlphabet.fromLetter("t"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToA() {
        assertEquals(".-", morseAlphabet.fromLetter("A"));
        assertEquals(".-", morseAlphabet.fromLetter("a"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToO() {
        assertEquals("---", morseAlphabet.fromLetter("O"));
        assertEquals("---", morseAlphabet.fromLetter("o"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToI() {
        assertEquals("..", morseAlphabet.fromLetter("I"));
        assertEquals("..", morseAlphabet.fromLetter("i"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToN() {
        assertEquals("-.", morseAlphabet.fromLetter("N"));
        assertEquals("-.", morseAlphabet.fromLetter("n"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToS() {
        assertEquals("...", morseAlphabet.fromLetter("S"));
        assertEquals("...", morseAlphabet.fromLetter("s"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToH() {
        assertEquals("....", morseAlphabet.fromLetter("H"));
        assertEquals("....", morseAlphabet.fromLetter("h"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToR() {
        assertEquals(".-.", morseAlphabet.fromLetter("R"));
        assertEquals(".-.", morseAlphabet.fromLetter("r"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToD() {
        assertEquals("-..", morseAlphabet.fromLetter("D"));
        assertEquals("-..", morseAlphabet.fromLetter("d"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToL() {
        assertEquals(".-..", morseAlphabet.fromLetter("L"));
        assertEquals(".-..", morseAlphabet.fromLetter("l"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToC() {
        assertEquals("-.-.", morseAlphabet.fromLetter("C"));
        assertEquals("-.-.", morseAlphabet.fromLetter("c"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToU() {
        assertEquals("..-", morseAlphabet.fromLetter("U"));
        assertEquals("..-", morseAlphabet.fromLetter("u"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToM() {
        assertEquals("--", morseAlphabet.fromLetter("M"));
        assertEquals("--", morseAlphabet.fromLetter("m"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToW() {
        assertEquals(".--", morseAlphabet.fromLetter("W"));
        assertEquals(".--", morseAlphabet.fromLetter("w"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToF() {
        assertEquals("..-.", morseAlphabet.fromLetter("F"));
        assertEquals("..-.", morseAlphabet.fromLetter("f"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToG() {
        assertEquals("--.", morseAlphabet.fromLetter("G"));
        assertEquals("--.", morseAlphabet.fromLetter("g"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToY() {
        assertEquals("-.--", morseAlphabet.fromLetter("Y"));
        assertEquals("-.--", morseAlphabet.fromLetter("y"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToP() {
        assertEquals(".--.", morseAlphabet.fromLetter("P"));
        assertEquals(".--.", morseAlphabet.fromLetter("p"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToB() {
        assertEquals("-...", morseAlphabet.fromLetter("B"));
        assertEquals("-...", morseAlphabet.fromLetter("b"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToV() {
        assertEquals("...-", morseAlphabet.fromLetter("V"));
        assertEquals("...-", morseAlphabet.fromLetter("v"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToK() {
        assertEquals("-.-", morseAlphabet.fromLetter("K"));
        assertEquals("-.-", morseAlphabet.fromLetter("k"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToJ() {
        assertEquals(".---", morseAlphabet.fromLetter("J"));
        assertEquals(".---", morseAlphabet.fromLetter("j"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToX() {
        assertEquals("-..-", morseAlphabet.fromLetter("X"));
        assertEquals("-..-", morseAlphabet.fromLetter("x"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToQ() {
        assertEquals("--.-", morseAlphabet.fromLetter("Q"));
        assertEquals("--.-", morseAlphabet.fromLetter("q"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToZ() {
        assertEquals("--..", morseAlphabet.fromLetter("Z"));
        assertEquals("--..", morseAlphabet.fromLetter("z"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToSpace() {
        assertEquals("", morseAlphabet.fromLetter(" "));
    }

    @Test public void shouldReturnTheMorseCorrespondentToDot() {
        assertEquals(".-.-.-", morseAlphabet.fromLetter("."));
    }

    @Test public void shouldReturnTheMorseCorrespondentToComa() {
        assertEquals("--..--", morseAlphabet.fromLetter(","));
    }

    @Test public void shouldReturnTheMorseCorrespondentToQuestionMArk() {
        assertEquals("..--..", morseAlphabet.fromLetter("?"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToApostrophe() {
        assertEquals(".----.", morseAlphabet.fromLetter("\'"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToExclamationMArk() {
        assertEquals("-.-.--", morseAlphabet.fromLetter("!"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToSlash() {
        assertEquals("-..-.", morseAlphabet.fromLetter("/"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToParenthesisOpen() {
        assertEquals("-.--.", morseAlphabet.fromLetter("("));
    }

    @Test public void shouldReturnTheMorseCorrespondentToParenthesisClose() {
        assertEquals("-.--.-", morseAlphabet.fromLetter(")"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToBraketOpen() {
        assertEquals("-.--.", morseAlphabet.fromLetter("["));
    }

    @Test public void shouldReturnTheMorseCorrespondentToBraketClose() {
        assertEquals("-.--.-", morseAlphabet.fromLetter("]"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToAmpersand() {
        assertEquals(".-...", morseAlphabet.fromLetter("&"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToColon() {
        assertEquals("---...", morseAlphabet.fromLetter(":"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToSemiColon() {
        assertEquals("-.-.-.", morseAlphabet.fromLetter(";"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToEqual() {
        assertEquals("-...-", morseAlphabet.fromLetter("="));
    }

    @Test public void shouldReturnTheMorseCorrespondentToHifen() {
        assertEquals("-....-", morseAlphabet.fromLetter("-"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToUnderLine() {
        assertEquals("..--.-", morseAlphabet.fromLetter("_"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToQuote() {
        assertEquals(".-..-.", morseAlphabet.fromLetter("\""));
    }

    @Test public void shouldReturnTheMorseCorrespondentToDollar() {
        assertEquals("...-..-", morseAlphabet.fromLetter("$"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToAtSign() {
        assertEquals(".--.-.", morseAlphabet.fromLetter("@"));
    }

    @Test public void shouldReturnTheMorseCorrespondentTo0() {
        assertEquals("-----", morseAlphabet.fromLetter("0"));
    }

    @Test public void shouldReturnTheMorseCorrespondentTo1() {
        assertEquals(".----", morseAlphabet.fromLetter("1"));
    }

    @Test public void shouldReturnTheMorseCorrespondentTo2() {
        assertEquals("..---", morseAlphabet.fromLetter("2"));
    }

    @Test public void shouldReturnTheMorseCorrespondentTo3() {
        assertEquals("...--", morseAlphabet.fromLetter("3"));
    }

    @Test public void shouldReturnTheMorseCorrespondentTo4() {
        assertEquals("....-", morseAlphabet.fromLetter("4"));
    }

    @Test public void shouldReturnTheMorseCorrespondentTo5() {
        assertEquals(".....", morseAlphabet.fromLetter("5"));
    }

    @Test public void shouldReturnTheMorseCorrespondentTo6() {
        assertEquals("-....", morseAlphabet.fromLetter("6"));
    }

    @Test public void shouldReturnTheMorseCorrespondentTo7() {
        assertEquals("--...", morseAlphabet.fromLetter("7"));
    }

    @Test public void shouldReturnTheMorseCorrespondentTo8() {
        assertEquals("---..", morseAlphabet.fromLetter("8"));
    }

    @Test public void shouldReturnTheMorseCorrespondentTo9() {
        assertEquals("----.", morseAlphabet.fromLetter("9"));
    }

    @Test public void shouldReturnAWhenPassedCorrespondentMorseToA() throws Exception {
        assertEquals("A", morseAlphabet.toLetter(".-"));
    }

    @Test public void shouldReturnBWhenPassedCorrespondentMorseToB() throws Exception {
        assertEquals("B", morseAlphabet.toLetter("-..."));
    }

    @Test public void shouldReturnCWhenPassedCorrespondentMorseToC() throws Exception {
        assertEquals("C", morseAlphabet.toLetter("-.-."));
    }

    @Test public void shouldReturnDWhenPassedCorrespondentMorseToD() throws Exception {
        assertEquals("D", morseAlphabet.toLetter("-.."));
    }

    @Test public void shouldReturnEWhenPassedCorrespondentMorseToE() throws Exception {
        assertEquals("E", morseAlphabet.toLetter("."));
    }

    @Test public void shouldReturnFWhenPassedCorrespondentMorseToF() throws Exception {
        assertEquals("F", morseAlphabet.toLetter("..-."));
    }

    @Test public void shouldReturnGWhenPassedCorrespondentMorseToG() throws Exception {
        assertEquals("G", morseAlphabet.toLetter("--."));
    }

    @Test public void shouldReturnHWhenPassedCorrespondentToH() throws Exception {
        assertEquals("H", morseAlphabet.toLetter("...."));
    }

    @Test public void shouldReturnIWhenPassedCorrespondentToI() throws Exception {
        assertEquals("I", morseAlphabet.toLetter(".."));
    }

    @Test public void shouldReturnJWhenPassedCorrespondentToJ() throws Exception {
        assertEquals("J", morseAlphabet.toLetter(".---"));
    }

    @Test public void shouldReturnKWhenPassedCorrespondentToK() throws Exception {
        assertEquals("K", morseAlphabet.toLetter("-.-"));
    }

    @Test public void shouldReturnLWhenPassedCorrespondentToL() throws Exception {
        assertEquals("L", morseAlphabet.toLetter(".-.."));
    }

    @Test public void shouldReturnMWhenPassedCorrespondentToM() throws Exception {
       assertEquals("M", morseAlphabet.toLetter("--"));
    }

    @Test public void shouldReturnNWhenPassedCorrespondentToN() throws Exception {
        assertEquals("N", morseAlphabet.toLetter("-."));
    }

    @Test public void shouldReturnOWhenPassedCorrespondentToO() throws Exception {
        assertEquals("O", morseAlphabet.toLetter("---"));
    }

    @Test public void shouldReturnPWhenPassedCorrespondentToP() throws Exception {
        assertEquals("P", morseAlphabet.toLetter(".--."));
    }
}
