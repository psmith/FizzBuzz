package kata.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Smith
 * Date: 8/23/13
 * Time: 9:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestMultipleOfFive {
    private Filter filter = new MultipleOfFive();
    @Test
    public void oneShouldReturnNull(){
        Assert.assertNull(filter.convert(1));
    }

    @Test
    public void fiveShouldReturnBuzz(){
        Assert.assertEquals("Buzz", filter.convert(5));
    }
}
