package br.com.helmed.morsecode.encode;

import br.com.helmed.morsecode.alphabet.Alphabet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Unit test of {@link MorseEncode}
 * User: helmed
 * Date: 5/26/13
 * Time: 9:44 PM
 */
public class MorseEncodeTest {
    private MorseEncode morseEncode;

    @Before
    public void setUp() throws Exception {
        Alphabet alphabetMock = createMorseAlphabetMock();

        morseEncode = new MorseEncode(alphabetMock);
    }

    @Test public void shouldReturnTheMorseCorrespondentToE() {
        assertEquals(".", morseEncode.encodeWithSpace("E"));
        assertEquals(".", morseEncode.encodeWithSpace("e"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToT() {
        assertEquals("-", morseEncode.encodeWithSpace("T"));
        assertEquals("-", morseEncode.encodeWithSpace("t"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToA() {
        assertEquals(".-", morseEncode.encodeWithSpace("A"));
        assertEquals(".-", morseEncode.encodeWithSpace("a"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToO() {
        assertEquals("---", morseEncode.encodeWithSpace("O"));
        assertEquals("---", morseEncode.encodeWithSpace("o"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToI() {
        assertEquals("..", morseEncode.encodeWithSpace("I"));
        assertEquals("..", morseEncode.encodeWithSpace("i"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToN() {
        assertEquals("-.", morseEncode.encodeWithSpace("N"));
        assertEquals("-.", morseEncode.encodeWithSpace("n"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToS() {
        assertEquals("...", morseEncode.encodeWithSpace("S"));
        assertEquals("...", morseEncode.encodeWithSpace("s"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToH() {
        assertEquals("....", morseEncode.encodeWithSpace("H"));
        assertEquals("....", morseEncode.encodeWithSpace("h"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToR() {
        assertEquals(".-.", morseEncode.encodeWithSpace("R"));
        assertEquals(".-.", morseEncode.encodeWithSpace("r"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToD() {
        assertEquals("-..", morseEncode.encodeWithSpace("D"));
        assertEquals("-..", morseEncode.encodeWithSpace("d"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToL() {
        assertEquals(".-..", morseEncode.encodeWithSpace("L"));
        assertEquals(".-..", morseEncode.encodeWithSpace("l"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToC() {
        assertEquals("-.-.", morseEncode.encodeWithSpace("C"));
        assertEquals("-.-.", morseEncode.encodeWithSpace("c"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToU() {
        assertEquals("..-", morseEncode.encodeWithSpace("U"));
        assertEquals("..-", morseEncode.encodeWithSpace("u"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToM() {
        assertEquals("--", morseEncode.encodeWithSpace("M"));
        assertEquals("--", morseEncode.encodeWithSpace("m"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToW() {
        assertEquals(".--", morseEncode.encodeWithSpace("W"));
        assertEquals(".--", morseEncode.encodeWithSpace("w"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToF() {
        assertEquals("..-.", morseEncode.encodeWithSpace("F"));
        assertEquals("..-.", morseEncode.encodeWithSpace("f"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToG() {
        assertEquals("--.", morseEncode.encodeWithSpace("G"));
        assertEquals("--.", morseEncode.encodeWithSpace("g"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToY() {
        assertEquals("-.--", morseEncode.encodeWithSpace("Y"));
        assertEquals("-.--", morseEncode.encodeWithSpace("y"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToP() {
        assertEquals(".--.", morseEncode.encodeWithSpace("P"));
        assertEquals(".--.", morseEncode.encodeWithSpace("p"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToB() {
        assertEquals("-...", morseEncode.encodeWithSpace("B"));
        assertEquals("-...", morseEncode.encodeWithSpace("b"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToV() {
        assertEquals("...-", morseEncode.encodeWithSpace("V"));
        assertEquals("...-", morseEncode.encodeWithSpace("v"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToK() {
        assertEquals("-.-", morseEncode.encodeWithSpace("K"));
        assertEquals("-.-", morseEncode.encodeWithSpace("k"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToJ() {
        assertEquals(".---", morseEncode.encodeWithSpace("J"));
        assertEquals(".---", morseEncode.encodeWithSpace("j"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToX() {
        assertEquals("-..-", morseEncode.encodeWithSpace("X"));
        assertEquals("-..-", morseEncode.encodeWithSpace("x"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToQ() {
        assertEquals("--.-", morseEncode.encodeWithSpace("Q"));
        assertEquals("--.-", morseEncode.encodeWithSpace("q"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToZ() {
        assertEquals("--..", morseEncode.encodeWithSpace("Z"));
        assertEquals("--..", morseEncode.encodeWithSpace("z"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToSpace() {
        assertEquals("", morseEncode.encodeWithSpace(" "));
    }

    @Test public void shouldReturnTheMorseCorrespondentToDot() {
        assertEquals(".-.-.-", morseEncode.encodeWithSpace("."));
    }

    @Test public void shouldReturnTheMorseCorrespondentToComa() {
        assertEquals("--..--", morseEncode.encodeWithSpace(","));
    }

    @Test public void shouldReturnTheMorseCorrespondentToQuestionMArk() {
        assertEquals("..--..", morseEncode.encodeWithSpace("?"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToApostrophe() {
        assertEquals(".----.", morseEncode.encodeWithSpace("\'"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToExclamationMArk() {
        assertEquals("-.-.--", morseEncode.encodeWithSpace("!"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToSlash() {
        assertEquals("-..-.", morseEncode.encodeWithSpace("/"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToParenthesisOpen() {
        assertEquals("-.--.", morseEncode.encodeWithSpace("("));
    }

    @Test public void shouldReturnTheMorseCorrespondentToParenthesisClose() {
        assertEquals("-.--.-", morseEncode.encodeWithSpace(")"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToBraketOpen() {
        assertEquals("-.--.", morseEncode.encodeWithSpace("["));
    }

    @Test public void shouldReturnTheMorseCorrespondentToBraketClose() {
        assertEquals("-.--.-", morseEncode.encodeWithSpace("]"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToAmpersand() {
        assertEquals(".-...", morseEncode.encodeWithSpace("&"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToColon() {
        assertEquals("---...", morseEncode.encodeWithSpace(":"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToSemiColon() {
        assertEquals("-.-.-.", morseEncode.encodeWithSpace(";"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToEqual() {
        assertEquals("-...-", morseEncode.encodeWithSpace("="));
    }

    @Test public void shouldReturnTheMorseCorrespondentToHifen() {
        assertEquals("-....-", morseEncode.encodeWithSpace("-"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToUnderLine() {
        assertEquals("..--.-", morseEncode.encodeWithSpace("_"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToQuote() {
        assertEquals(".-..-.", morseEncode.encodeWithSpace("\""));
    }

    @Test public void shouldReturnTheMorseCorrespondentToDollar() {
        assertEquals("...-..-", morseEncode.encodeWithSpace("$"));
    }

    @Test public void shouldReturnTheMorseCorrespondentToAtSign() {
        assertEquals(".--.-.", morseEncode.encodeWithSpace("@"));
    }

    @Test public void shouldReturnTheMorseCorrespondentTo0() {
        assertEquals("-----", morseEncode.encodeWithSpace("0"));
    }

    @Test public void shouldReturnTheMorseCorrespondentTo1() {
        assertEquals(".----", morseEncode.encodeWithSpace("1"));
    }

    @Test public void shouldReturnTheMorseCorrespondentTo2() {
        assertEquals("..---", morseEncode.encodeWithSpace("2"));
    }

    @Test public void shouldReturnTheMorseCorrespondentTo3() {
        assertEquals("...--", morseEncode.encodeWithSpace("3"));
    }

    @Test public void shouldReturnTheMorseCorrespondentTo4() {
        assertEquals("....-", morseEncode.encodeWithSpace("4"));
    }

    @Test public void shouldReturnTheMorseCorrespondentTo5() {
        assertEquals(".....", morseEncode.encodeWithSpace("5"));
    }

    @Test public void shouldReturnTheMorseCorrespondentTo6() {
        assertEquals("-....", morseEncode.encodeWithSpace("6"));
    }

    @Test public void shouldReturnTheMorseCorrespondentTo7() {
        assertEquals("--...", morseEncode.encodeWithSpace("7"));
    }

    @Test public void shouldReturnTheMorseCorrespondentTo8() {
        assertEquals("---..", morseEncode.encodeWithSpace("8"));
    }

    @Test public void shouldReturnTheMorseCorrespondentTo9() {
        assertEquals("----.", morseEncode.encodeWithSpace("9"));
    }

    @Test public void shouldReturnTheTextCorrespondent() throws Exception {
        assertEquals(".--. .-. --- -.-. .-.. .- -- .- - .. --- -.",
                morseEncode.encodeWithSpace("Proclamation"));

        assertEquals(". -- .- -. -.-. .. .--. .- - .. --- -.",
                morseEncode.encodeWithSpace("Emancipation"));
    }

    @Test public void shouldReturnTheTextCorrespondentWithDoubleSpaceBetweenWords() throws Exception {
        assertEquals(". -- .- -. -.-. .. .--. .- - .. --- -.  .--. .-. --- -.-. .-.. .- -- .- - .. --- -.",
                morseEncode.encodeWithSpace("Emancipation Proclamation"));

        assertEquals("-... -.--  - .... .  .--. .-. . ... .. -.. . -. -  --- ..-.  ..- -. .. - . -..  ... - .- - . ...  --- ..-.  .- -- . .-. .. -.-. .-",
                morseEncode.encodeWithSpace("By the president of united states of america"));
    }

    @Test public void shouldReturnTheTextCorrespondentWithDoubleSpaceBetweenWordsWithSpecialCharacters() throws Exception {
        assertEquals(".-- .... . .-. . .- ... --..--  --- -.  - .... .  - .-- . -. - -.-- -...- ... . -.-. --- -. -..  -.. .- -.--  --- ..-.  ... . .--. - . -- -... . .-. --..--  .. -.  - .... .  -.-- . .- .-.  --- ..-.  --- ..- .-.  .-.. --- .-. -..",
                morseEncode.encodeWithSpace("Whereas, On the Twenty=Second day of September, in the year of our Lord"));
    }

    @Test public void shouldReturnTheTextCorrespondentWithoutSpace() throws Exception {
        assertEquals(".--..-.----.-..-...---.--..----.",
                morseEncode.encodeWithoutSpace("Proclamation"));

        assertEquals(".-....-.-.-.---.-..-.",
                morseEncode.encodeWithoutSpace("Lincoln"));
    }

    private void defineWhen(Alphabet alphabetMock, String letter, String morseLetter) {
        when(alphabetMock.fromLetter(letter)).thenReturn(morseLetter);
        when(alphabetMock.fromLetter(letter.toLowerCase())).thenReturn(morseLetter);
    }

    private Alphabet createMorseAlphabetMock() {
        Alphabet alphabetMock = mock(Alphabet.class);
        defineWhen(alphabetMock, "A", ".-");
        defineWhen(alphabetMock, "B", "-...");
        defineWhen(alphabetMock, "C", "-.-.");
        defineWhen(alphabetMock, "D", "-..");
        defineWhen(alphabetMock, "E", ".");
        defineWhen(alphabetMock, "F", "..-.");
        defineWhen(alphabetMock, "G", "--.");
        defineWhen(alphabetMock, "H", "....");
        defineWhen(alphabetMock, "I", "..");
        defineWhen(alphabetMock, "J", ".---");
        defineWhen(alphabetMock, "K", "-.-");
        defineWhen(alphabetMock, "L", ".-..");
        defineWhen(alphabetMock, "M", "--");
        defineWhen(alphabetMock, "N", "-.");
        defineWhen(alphabetMock, "O", "---");
        defineWhen(alphabetMock, "P", ".--.");
        defineWhen(alphabetMock, "Q", "--.-");
        defineWhen(alphabetMock, "R", ".-.");
        defineWhen(alphabetMock, "S", "...");
        defineWhen(alphabetMock, "T", "-");
        defineWhen(alphabetMock, "U", "..-");
        defineWhen(alphabetMock, "V", "...-");
        defineWhen(alphabetMock, "W", ".--");
        defineWhen(alphabetMock, "X", "-..-");
        defineWhen(alphabetMock, "Y", "-.--");
        defineWhen(alphabetMock, "Z", "--..");

        defineWhen(alphabetMock, " ", "");
        defineWhen(alphabetMock, ".", ".-.-.-");
        defineWhen(alphabetMock, ",", "--..--");
        defineWhen(alphabetMock, "?", "..--..");
        defineWhen(alphabetMock, "'", ".----.");
        defineWhen(alphabetMock, "!", "-.-.--");
        defineWhen(alphabetMock, "/", "-..-.");
        defineWhen(alphabetMock, "(", "-.--.");
        defineWhen(alphabetMock, ")", "-.--.-");
        defineWhen(alphabetMock, "[", "-.--.");
        defineWhen(alphabetMock, "]", "-.--.-");
        defineWhen(alphabetMock, "&", ".-...");
        defineWhen(alphabetMock, ":", "---...");
        defineWhen(alphabetMock, ";", "-.-.-.");
        defineWhen(alphabetMock, "=", "-...-");
        defineWhen(alphabetMock, "-", "-....-");
        defineWhen(alphabetMock, "_", "..--.-");
        defineWhen(alphabetMock, "\"", ".-..-.");
        defineWhen(alphabetMock, "$", "...-..-");
        defineWhen(alphabetMock, "@", ".--.-.");

        defineWhen(alphabetMock, "0", "-----");
        defineWhen(alphabetMock, "1", ".----");
        defineWhen(alphabetMock, "2", "..---");
        defineWhen(alphabetMock, "3", "...--");
        defineWhen(alphabetMock, "4", "....-");
        defineWhen(alphabetMock, "5", ".....");
        defineWhen(alphabetMock, "6", "-....");
        defineWhen(alphabetMock, "7", "--...");
        defineWhen(alphabetMock, "8", "---..");
        defineWhen(alphabetMock, "9", "----.");

        return alphabetMock;
    }
}