package NewSources;

import org.junit.Test;

import static org.junit.Assert.*;

public class RansomNote_383Test {

    @Test
    public void canConstruct() {
        RansomNote_383 t = new RansomNote_383();
        assertTrue(t.canConstruct("aa", "aab"));
    }

    @Test
    public void canConstructOthers() {
        RansomNote_383 t = new RansomNote_383();
        assertTrue(t.canConstructOthers("aa", "aab"));
    }
}