package dssc.assignment.fizzbuzz;

import java.util.Optional;
import java.util.stream.Stream;

public class FizzBuzz {

    public static void main(String... args) {
        Stream.iterate(1, n -> n+1)
                .limit(105)
                .map(FizzBuzz::fizzBuzzBang)
                .forEach(System.out::println);
    }

    public static String fizzBuzzBang(int in){
        String result = Optional.of(in)
                .map(n -> ((n%3 == 0) ? "Fizz" : "") + ((n%5 == 0) ? "Buzz" : "") + ((n%7 == 0) ? "Bang" : "")).get();
        return result.isEmpty() ? Integer.toString(in) : result;
    }

}
