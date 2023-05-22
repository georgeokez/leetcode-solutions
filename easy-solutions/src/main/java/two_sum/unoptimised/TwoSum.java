package two_sum.unoptimised;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public static void main (String [] args) {
        int[] numbs = {2, 7, 0, 9};
        int target = 9;
        System.out.println("Testing twoSum method: ");
        printArray(twoSum(numbs, target));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        List<Integer> listNums = new ArrayList<>(nums.length);

        convertArrayToListInteger(listNums, nums);

        if (listNums.contains(0) && listNums.contains(target)){
            result[0] = listNums.indexOf(0);
            result[1] = listNums.indexOf(target);
        }

        return result;
    }

    public static void convertArrayToListInteger(List<Integer> list, int[] array) {
        for (int i : array) {
            list.add(i);
        }
    }

    public static void printArray(int[] array) {
        System.out.println("[" + array[0] +", "+ array[1]+ "]");
    }
}
