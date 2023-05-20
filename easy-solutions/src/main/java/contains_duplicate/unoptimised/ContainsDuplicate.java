package contains_duplicate.unoptimised;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicate {
    public static void main(String [] args) {
        int[] numbs = {1, 2, 3, 4, 4};
        System.out.println("Testing containsDuplicate: " + containsDuplicate(numbs));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return nums.length != set.size();
    }
}
