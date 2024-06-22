package NewSources;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RichestCustomWealth_1672Test {

    @Test
    public void maximumWealth() {
        RichestCustomWealth_1672 t = new RichestCustomWealth_1672();
        int[][] accounts = new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        int output = t.maximumWealth(accounts);
        int expected = 17;

        Assert.assertEquals(output, expected);
    }
}