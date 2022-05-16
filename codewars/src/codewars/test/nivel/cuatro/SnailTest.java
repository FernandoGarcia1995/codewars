package codewars.test.nivel.cuatro;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import static java.util.stream.Collectors.joining;

import codewars.nivel.cuatro.Snail;

public class SnailTest {

  @Test
    public void SnailTest1() {
        int[][] array
                = {{1, 2, 3, 4},
                {4, 5, 6 , 7},
                {7, 8, 9, 8},
                {7, 8, 9 , 11}};
        int[] r = {1, 2, 3, 6, 9, 8, 7, 4, 5};
        test(array, r);
    }
    
   public String int2dToString(int[][] a) {
        return Arrays.stream(a).map(row -> Arrays.toString(row)).collect(joining("\n"));
    }

    public void test(int[][] array, int[] result) {
        String text = int2dToString(array) + " should be sorted to " + Arrays.toString(result);
        System.out.println(text);
        Assert.assertArrayEquals( result, Snail.snail(array));
    }

   
}