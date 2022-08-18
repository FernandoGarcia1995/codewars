package codewars.test.nivel.seis;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import codewars.nivel.seis.NameInStr;

public class NameInStrTest {
    @Test
    public void sampleTest() {
        assertEquals(true, NameInStr.nameInStr("Across the rivers", "chris"));
        assertEquals(false, NameInStr.nameInStr("Next to a lake", "chris"));
        assertEquals(false, NameInStr.nameInStr("Under a sea", "chris"));
        assertEquals(false, NameInStr.nameInStr("A crew that boards the ship", "chris"));
        assertEquals(false, NameInStr.nameInStr("A live son", "Allison"));
    }
}