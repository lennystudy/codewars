package codewars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

public class PrimitiveTest {

    Primitive p = new Primitive();

    @Test
    public void testTypes() {
        
        assertEquals("byte", p.determineType("2"));
        assertEquals("int", p.determineType("-803847"));
        assertEquals("none", p.determineType("9173654782928177561848183754729818437466"));
        assertEquals("short", p.determineType("3573"));
        assertEquals("long", p.determineType("-5745621829365"));
    }
}