package kata.fizzbuzz;

import kata.fizzbuzz.MultipleOfFive;
import kata.fizzbuzz.MultipleOfThree;
import kata.fizzbuzz.MultipleOfThreeAndFive;

import java.util.List;
import java.util.ArrayList;
/**
 * Created with IntelliJ IDEA.
 * User: Smith
 * Date: 8/23/13
 * Time: 9:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class FizzBuzz {
    private final List<Filter> filters;
    public String convert(int i){
        String converted = String.valueOf(i);
        for(Filter f: filters){
            if(( f.convert(i)) != null){
               converted = f.convert(i);
               break;
            }
        }
        return converted;
    }

    private FizzBuzz(FizzBuzzBuilder builder){
         filters = builder.getFilters();
    }

    public static class FizzBuzzBuilder{
        private static List<Filter> filters = new ArrayList<Filter>();

        public List<Filter> getFilters(){
            return new ArrayList<Filter>(filters);
        }
        public FizzBuzzBuilder add(Filter f){
           this.filters.add(f);
           return this;
        }
        public FizzBuzz build(){
           return new FizzBuzz(this);
        }
    }

    public static void main(String[] args){
        FizzBuzz fb = new FizzBuzz.FizzBuzzBuilder().add(new MultipleOfThreeAndFive())
                .add(new MultipleOfThree())
                .add(new MultipleOfFive())
                .build();
        for(int i = 1; i <= 100; i++){
            System.out.println(fb.convert(i));
        }
    }
}
