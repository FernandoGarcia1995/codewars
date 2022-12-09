package codewars.nivel.cinco;

import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

//At a job interview, you are challenged to write an algorithm to check if a given string, s, can be formed from two other strings, part1 and part2.
//
//The restriction is that the characters in part1 and part2 should be in the same order as in s.
//
//The interviewer gives you the following example and tells you to figure out the rest from the given test cases.
//
//For example:
//	
//	'codewars' is a merge from 'cdw' and 'oears':
//
//	    s:  c o d e w a r s   = codewars
//	part1:  c   d   w         = cdw
//	part2:    o   e   a r s   = oears

public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {
        if (s.isEmpty() || (part1.length() + part2.length() != s.length())) return false;

        int i = 0, j = 0, k = 0;

        while (k < s.length()) {
            if (i < part1.length() && s.charAt(k) == part1.charAt(i)) {
                i++;
            } else if (j < part2.length() && s.charAt(k) == part2.charAt(j)) {
                j++;
            } else {
                return false;
            }
            k++;
        }

        return (i == part1.length() && j == part2.length());
    }

}