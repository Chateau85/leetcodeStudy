package NewSources;

import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateZerosTest {

    @Test
    public void duplicateZeros() {
        DuplicateZeros t = new DuplicateZeros();
        int[] arr = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        int[] expected = new int[]{1, 0, 0, 2, 3, 0, 0, 4};
        t.duplicateZeros(arr);
    }
}