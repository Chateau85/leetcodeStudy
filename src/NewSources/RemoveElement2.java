package NewSources;

public class RemoveElement2 {
    public int removeElement(int[] nums, int val) {
        int count = 0, left = 0, right = nums.length - 1;
        while (left < right) {
            if (nums[right] == val) {
                right--;
            } else {
                if (nums[left] == val) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;

                    right--;
                }
                left++;
            }
        }
        for (int v : nums) {
            if (v != val) {
                count++;
            }
        }
        return count;
    }

    public int removeElement2(int[] nums, int val) {
        int k = nums.length - 1, i = 0;
        while (i < k) {
            if (nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k--;
                i--;
            }
            i++;
        }
        return k + 1;
    }
}
