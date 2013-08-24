package kata.fizzbuzz;

/**
 * Created with IntelliJ IDEA.
 * User: Smith
 * Date: 8/23/13
 * Time: 8:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class MultipleOfThreeAndFive implements kata.fizzbuzz.Filter {
    public String convert(int i){
        return i % 3 == 0 && i % 5 == 0 ? "FizzBuzz" : null;
    }
}
