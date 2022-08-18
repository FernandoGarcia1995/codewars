package codewars.test.nivel.cinco;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import codewars.nivel.cinco.PigLatin;


public class PigLatinTests {
    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
    }
}