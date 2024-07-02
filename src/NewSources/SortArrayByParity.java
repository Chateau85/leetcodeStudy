package NewSources;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        if (nums == null || nums.length == 0) return nums;

        int evenIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] % 2 == 0) {
                        evenIndex = j;
                        break;
                    }
                }
                if (evenIndex != 0) {
                    int temp = nums[i];
                    nums[i] = nums[evenIndex];
                    nums[evenIndex] = temp;
                }
            }
        }
        return nums;
    }

    public int[] sortArrayByParity2(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            while (left < right && nums[left] % 2 == 0) {
                left++;
            }
            while (left < right && nums[right] % 2 == 1) {
                right--;
            }
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        return nums;
    }
}
