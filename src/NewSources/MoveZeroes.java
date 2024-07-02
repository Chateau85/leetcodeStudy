package NewSources;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums.length <= 1) {
            return;
        }
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        left = j;
                        break;
                    }
                }
                if (left != 0) {
                    int temp = nums[i];
                    nums[i] = nums[left];
                    nums[left] = temp;
                }
            }
        }
    }

    public void moveZeroes2(int[] nums) {
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[fast] == 0) {
                fast++;
            } else {
                nums[slow] = nums[fast];
                fast++;
                slow++;
            }
        }
        while (slow < nums.length) {
            nums[slow++] = 0;
        }
    }
}
