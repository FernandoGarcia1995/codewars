package codewars.test.nivel.seis;

import static org.junit.Assert.*;
import org.junit.Test;
import codewars.nivel.seis.Persist;

public class PersistTest {
    
	@Test
	public void BasicTests() {
		System.out.println("****** Basic Tests ******");
		assertEquals(3, Persist.persistence(39));
		assertEquals(0, Persist.persistence(4));
	  assertEquals(2, Persist.persistence(25));
	  assertEquals(4, Persist.persistence(999));
	}
	
}