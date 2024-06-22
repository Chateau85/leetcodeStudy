package NewSources;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceElementsWithGreatestElementOnRightSideTest {

    @Test
    public void replaceElements() {
        ReplaceElementsWithGreatestElementOnRightSide t = new ReplaceElementsWithGreatestElementOnRightSide();
        int[] arr = new int[]{17, 18, 5, 4, 6, 1};
        int[] expected = new int[]{18, 6, 6, 6, 1, -1};
        assertArrayEquals(expected, t.replaceElements(arr));
    }
}