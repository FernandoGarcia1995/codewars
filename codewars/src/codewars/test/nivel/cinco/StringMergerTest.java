package codewars.test.nivel.cinco;

import org.junit.Test;

import codewars.nivel.cinco.StringMerger;

import static org.junit.Assert.*;

public class StringMergerTest {
  
  @Test
  public void normalHappyFlow() {
    assertTrue("codewars can be created from code and wars", StringMerger.isMerge("codewars", "code", "wars"));
    assertTrue("codewars can be created from cdwr and oeas", StringMerger.isMerge("codewars", "cdwr", "oeas"));
    assertFalse("Codewars are not codwars", StringMerger.isMerge("codewars", "cod", "wars"));
    assertFalse("Empty is not code", StringMerger.isMerge("", "code", "wars"));
  }
  
}