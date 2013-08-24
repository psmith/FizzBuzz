package kata.fizzbuzz;

import kata.fizzbuzz.kata.fizzbuzz.MultipleOfFive;
import kata.fizzbuzz.kata.fizzbuzz.MultipleOfThree;
import kata.fizzbuzz.kata.fizzbuzz.MultipleOfThreeAndFive;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Smith
 * Date: 8/23/13
 * Time: 9:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestFizzBuzz {
    FizzBuzz fizzBuzz = new FizzBuzz.FizzBuzzBuilder().add(new MultipleOfThreeAndFive())
            .add(new MultipleOfThree())
            .add(new MultipleOfFive())
            .build();

    @Test
    public void shouldReturn1(){
       assertEquals("1", fizzBuzz.convert(1));
    }

    @Test
    public void given3ShouldReturnFizz(){
        assertEquals("Fizz", fizzBuzz.convert(3));
    }

    @Test
    public void given5ShouldReturnBuzz(){
        assertEquals("Buzz", fizzBuzz.convert(5));
    }

    @Test
    public void given15ShouldReturnFizzBuzz(){
        assertEquals("FizzBuzz", fizzBuzz.convert(15));
    }
}
