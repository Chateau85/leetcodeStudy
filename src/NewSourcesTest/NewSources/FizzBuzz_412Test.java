package NewSources;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FizzBuzz_412Test {
    static int n = 15;
    static FizzBuzz_412 t = new FizzBuzz_412();
    List<String> expected = new ArrayList<>();
    static String[] val = new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};

    @Test
    public void fizzBuzz() {
        expected.addAll(Arrays.asList(val).subList(0, n));
        List<String> result = t.fizzBuzz(15);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void fizzBuzzLeetCode() {
        expected.addAll(Arrays.asList(val).subList(0, n));
        List<String> result = t.fizzBuzzLeetCode(15);
        Assert.assertEquals(expected, result);
    }
}