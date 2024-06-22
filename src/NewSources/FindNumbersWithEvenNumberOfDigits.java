package NewSources;

public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int result = 0;
        for (int v : nums) {
            if (String.valueOf(v).length() % 2 == 0) {
                result++;
            }
        }
        return result;
    }

    public int findNumbersOthers(int[] num) {
        int count = 0;
        for (int v : num) {
            if ((int)(Math.log10(v) + 1) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
