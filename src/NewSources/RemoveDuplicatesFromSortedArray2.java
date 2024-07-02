package NewSources;

public class RemoveDuplicatesFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int insertIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[insertIndex]) {
                insertIndex++;
                nums[insertIndex] = nums[i];
            }
        }
        return insertIndex + 1;
    }
}
