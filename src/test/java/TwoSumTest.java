import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void whenGivenAnArrayOfTwoIndexes_ShouldReturnTheIndexes() {
        //Arrange
        TwoSum twoSum = new TwoSum();

        int target = 5;
        int[] givenArray = new int[]{2, 3};
        int[] returnedArrayOrExpected = new int[]{0, 1};

        //Act
        int[] actual = twoSum.calculate(givenArray, target);

        //Assertion
        Assert.assertArrayEquals(returnedArrayOrExpected, actual);
    }

}
