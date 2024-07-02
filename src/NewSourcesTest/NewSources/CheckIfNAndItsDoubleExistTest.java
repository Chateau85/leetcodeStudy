package NewSources;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfNAndItsDoubleExistTest {

    @Test
    public void checkIfExist() {
        CheckIfNAndItsDoubleExist t = new CheckIfNAndItsDoubleExist();
        int[] arr = new int[]{3, 1, 7, 11};
        Assert.assertTrue(t.checkIfExist(arr));
    }
}