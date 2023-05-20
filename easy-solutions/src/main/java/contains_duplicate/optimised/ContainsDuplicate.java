package contains_duplicate.optimised;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String [] args) {
        int[] numbs = {1, 2, 3, 4, 4};
        System.out.println("Testing containsDuplicate: " + containsDuplicate(numbs));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();

        for( int numb : nums) {
            if (!hashSet.add(numb)){
                return true;
            }
        }

        return false;
    }
}
