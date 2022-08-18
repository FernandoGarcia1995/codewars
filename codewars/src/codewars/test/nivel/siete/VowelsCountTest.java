package codewars.test.nivel.siete;

import org.junit.Test;

import codewars.nivel.siete.VowelsCount;

import static org.junit.Assert.assertEquals;

public class VowelsCountTest {
    @Test
    public void testCase1() {
      assertEquals(5, VowelsCount.getCount("abracadabra"));
      assertEquals(0, VowelsCount.getCount(""));
      assertEquals(4, VowelsCount.getCount("pear tree"));
    }
}