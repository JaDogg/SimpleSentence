package info.simpll.simplesentence;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit Test for SimpleSentence.java
 *
 * @author Bhathiya
 */
public class SimpleSentenceTest {

    public static boolean match(String strToTest) {
        boolean matches = SimpleSentence.match(strToTest);
        System.out.printf("%-60s%s\n",
                String.format("match(\"%s\")", strToTest),
                matches ? "true" : "false");
        return matches;
    }

    @Test
    public void testMatching() {
        assertTrue(match("Because I'm Batman"));
        assertTrue(match("John Cena's fans"));
        assertTrue(match("Nice."));
        assertTrue(match("Mat's Mug"));
        assertTrue(match("Good Boy"));
        assertTrue(match("Assert True."));
        assertTrue(match("The students' projects"));
        assertTrue(match("The Johnsons' house is on fire."));
        assertTrue(match("Tim's and Marty's ice cream"));
        assertTrue(match("You're late."));
        assertTrue(match("Cat's eyes are blue."));
        assertTrue(match("B.A.T."));
        assertTrue(match("B. A. T."));
        assertTrue(match(" Hello World "));
        assertTrue(match(" K.O. "));
        assertTrue(match(" Js' friend "));
        assertTrue(match(" J A V A "));
        assertTrue(match("I'll look into it"));
        assertTrue(match("I can't beleive it."));
    }

    @Test
    public void testNotMatching() {
        assertFalse(match("The students'"));
        assertFalse(match("The  students")); //extra space inside
        assertFalse(match("."));
        assertFalse(match(""));
        assertFalse(match("AA"));
        assertFalse(match("A"));
        assertFalse(match("B..A.T."));
        assertFalse(match("You''re late."));
        assertFalse(match("' ; delete from users ;"));
        assertFalse(match("abcdefg@"));
        assertFalse(match("Bhathiya & JaDogg are the same"));
        assertFalse(match("Interesting !"));
        assertFalse(match("B..A.T.!@#$!@"));
        assertFalse(match(null));
        assertFalse(match("The# students'"));
        assertFalse(match("The  students  are bad")); //extra spaces inside
        assertFalse(match("aaaa#"));
        assertFalse(match("abc$"));
        assertFalse(match("xyz%"));
        assertFalse(match("@@@@@@@"));
        assertFalse(match("........."));
        assertFalse(match("I'm happy.."));
        assertFalse(match("Why?"));
        assertFalse(match("Gim'me"));
        assertFalse(match("weird4431"));
        assertFalse(match("1234123"));
        assertFalse(match("\"hello\""));
        assertFalse(match("'hello'"));
    }
}
