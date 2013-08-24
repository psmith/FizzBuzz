package kata.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Smith
 * Date: 8/23/13
 * Time: 9:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestMultipleOf3and5 {
    private Filter filter = new MultipleOfThreeAndFive();
    @Test
    public void oneShouldReturnNull(){
        Assert.assertNull(filter.convert(1));
    }

    @Test
    public void fifteenShouldReturnFizzBuzz(){
        Assert.assertEquals("FizzBuzz", filter.convert(15));
    }
}
