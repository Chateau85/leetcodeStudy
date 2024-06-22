package NewSources;

public class ReplaceElementsWithGreatestElementOnRightSide {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                int v = max;
                max = arr[i];
                arr[i] = v;
            } else {
                arr[i] = max;
            }
        }
        return arr;
    }
}
