import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void whenGivenAnArrayOfTwoIndexes_ShouldReturnTwoIndexesThatSumsToTarget() {
        //Arrange
        TwoSum twoSum = new TwoSum();

        int target = 9;
        int[] givenNums = new int[]{2, 7};
        int[] returnedArrayOrExpected = new int[]{0, 1};

        //Act
        int[] actual = twoSum.solution(givenNums, target);

        //Assertion
        Assert.assertArrayEquals(returnedArrayOrExpected, actual);
    }

    @Test
    public void whenGivenAnArrayOfThreeIndexes_ShouldReturnTwoIndexesThatSumToTarget() {
        //Arrange
        TwoSum twoSum = new TwoSum();

        int target = 13;
        int[] givenArray = new int[]{2, 7, 11};
        int[] expectedOrReturnedArray = new int[]{0, 2};

        //Act
        int[] actual = twoSum.solution(givenArray, target);

        //Assertion
        Assert.assertArrayEquals(expectedOrReturnedArray, actual);
    }
}
