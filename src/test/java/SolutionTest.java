import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void minSubArrayLenTest1() {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        int expected = 2;
        int actual = new Solution().minSubArrayLen(target, nums);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSubArrayLenTest2() {
        int target = 4;
        int[] nums = {1, 4, 4};
        int expected = 1;
        int actual = new Solution().minSubArrayLen(target, nums);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSubArrayLenTest3() {
        int target = 11;
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
        int expected = 0;
        int actual = new Solution().minSubArrayLen(target, nums);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSubArrayLenTest4() {
        int target = 11;
        int[] nums = {1, 2, 3, 4, 5};
        int expected = 3;
        int actual = new Solution().minSubArrayLen(target, nums);

        Assertions.assertEquals(expected, actual);
    }

}
