import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScrabbleScoreTest {

    @Test
    public void testALowerCaseLetter() {
        Scrabble scrabble = new Scrabble("a", false, false, "", "");
        assertEquals(1, scrabble.getScore());
    }

    @Test
    public void testALowerCaseLetterTripleWord() {
        Scrabble scrabble = new Scrabble("a", true, false, "", "");
        assertEquals(3, scrabble.getScore());
    }

    @Test
    public void testALowerCaseLetterDoubleWord() {
        Scrabble scrabble = new Scrabble("a", false, true, "", "");
        assertEquals(2, scrabble.getScore());
    }

    @Test
    public void testAUpperCaseLetter() {
        Scrabble scrabble = new Scrabble("A", false, false, "", "");
        assertEquals(1, scrabble.getScore());
    }

    @Test
    public void testAValuableLetter() {
        Scrabble scrabble = new Scrabble("f", false, false, "", "");
        assertEquals(4, scrabble.getScore());
    }

    @Test
    public void testAShortWord() {
        Scrabble scrabble = new Scrabble("at", false, false, "", "");
        assertEquals(2, scrabble.getScore());
    }

    @Test
    public void testAShortValuableWord() {
        Scrabble scrabble = new Scrabble("zoo", false, false, "", "");
        assertEquals(12, scrabble.getScore());
    }

    @Test
    public void testAShortValuableWordTripleZDoubleWord() {
        Scrabble scrabble = new Scrabble("zoo", false, true, "Z", "");
        assertEquals(64, scrabble.getScore());
    }

    @Test
    public void testAMediumWord() {
        Scrabble scrabble = new Scrabble("street", false, false, "", "");
        assertEquals(6, scrabble.getScore());
    }

    @Test
    public void testAMediumValuableWord() {
        Scrabble scrabble = new Scrabble("quirky", false, false, "", "");
        assertEquals(22, scrabble.getScore());
    }

    @Test
    public void testALongMixCaseWord() {
        Scrabble scrabble = new Scrabble("OxyphenButazone", false, false, "", "");
        assertEquals(41, scrabble.getScore());
    }

    @Test
    public void testAEnglishLikeWord() {
        Scrabble scrabble = new Scrabble("pinata", false, false, "", "");
        assertEquals(8, scrabble.getScore());
    }

    @Test
    public void testAnEmptyInput() {
        Scrabble scrabble = new Scrabble("", false, false, "", "");
        assertEquals(0, scrabble.getScore());
    }

    @Test
    public void testEntireAlphabetAvailable() {
        Scrabble scrabble = new Scrabble("abcdefghijklmnopqrstuvwxyz", false, false, "", "");
        assertEquals(87, scrabble.getScore());
    }

}
