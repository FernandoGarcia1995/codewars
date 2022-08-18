package codewars.test.nivel.siete;

import org.junit.Test;

import codewars.nivel.siete.SquareDigit;

import static org.junit.Assert.assertEquals;

public class SquareDigitTest {
    @Test
    public void test() {
      assertEquals(811181, new SquareDigit().squareDigits(9119));
      assertEquals(0, new SquareDigit().squareDigits(0));
    }
    
}
