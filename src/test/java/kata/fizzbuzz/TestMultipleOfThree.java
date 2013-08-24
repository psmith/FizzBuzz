package kata.fizzbuzz;

import org.junit.Test;
import org.junit.Assert;

/**
 * Created with IntelliJ IDEA.
 * User: Smith
 * Date: 8/23/13
 * Time: 9:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestMultipleOfThree {
    private MultipleOfThree filter = new MultipleOfThree();

    @Test
    public void oneShouldReturnNull(){
        Assert.assertNull(filter.convert(1));
    }

    @Test
    public void threeShouldReturnFizz(){
        Assert.assertEquals("Fizz", filter.convert(3));
    }
}
