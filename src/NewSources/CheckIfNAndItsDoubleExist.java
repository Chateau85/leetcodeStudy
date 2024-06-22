package NewSources;

import java.util.HashSet;
import java.util.Set;

public class CheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int v : arr) {
            if (set.contains(2 * v) || v % 2 == 0 && set.contains(v / 2)) {
                return true;
            }
            set.add(v);
        }
        return false;
    }
}
