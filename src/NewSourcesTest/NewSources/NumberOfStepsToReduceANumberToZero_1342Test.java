package NewSources;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfStepsToReduceANumberToZero_1342Test {

    @Test
    public void numberOfSteps() {
        NumberOfStepsToReduceANumberToZero_1342 t = new NumberOfStepsToReduceANumberToZero_1342();
        Assert.assertEquals(0, t.numberOfSteps(0));
        Assert.assertEquals(12, t.numberOfSteps(123));
        Assert.assertEquals(4, t.numberOfSteps(8));
    }
}