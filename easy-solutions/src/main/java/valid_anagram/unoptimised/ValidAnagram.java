package valid_anagram.unoptimised;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ValidAnagram {
    public static void main (String [] args) {
        System.out.println("Testing Anagram method:");

        System.out.println(isAnagram("aacc", "ccac"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Set<String> uniqueLetters = new HashSet<>(Arrays.asList(s.split("")));

        long countS, countT;

        for (String letter: uniqueLetters) {
            countS = s.chars().filter(ch -> ch == letter.charAt(0)).count();
            countT = t.chars().filter(ch -> ch == letter.charAt(0)).count();

            if (countS != countT) {
                return false;
            }
        }

        return true;
    }
}
