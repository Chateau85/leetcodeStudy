package NewSources;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int left = 0, right = nums.length - 1;
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

    public int removeElementOthers(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
