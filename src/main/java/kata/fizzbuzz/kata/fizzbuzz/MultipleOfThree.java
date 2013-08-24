package kata.fizzbuzz.kata.fizzbuzz;

/**
 * Created with IntelliJ IDEA.
 * User: Smith
 * Date: 8/23/13
 * Time: 8:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class MultipleOfThree implements kata.fizzbuzz.Filter {
    public String convert(int i){
        return i % 3 == 0 ? "Fizz" : null;
    }
}
