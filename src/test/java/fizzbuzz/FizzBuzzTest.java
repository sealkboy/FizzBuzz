package fizzbuzz;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void testFizz() {
        assertThat(FizzBuzz.fizzBuzz(3), is("Fizz"));
        assertThat(FizzBuzz.fizzBuzz(9), is("Fizz"));
        assertThat(FizzBuzz.fizzBuzz(13), is("Fizz"));  // Contiene un 3
    }

    @Test
    public void testBuzz() {
        assertThat(FizzBuzz.fizzBuzz(5), is("Buzz"));
        assertThat(FizzBuzz.fizzBuzz(10), is("Buzz"));
        assertThat(FizzBuzz.fizzBuzz(52), is("Buzz"));  // Contiene un 5
    }

    @Test
    public void testFizzBuzz() {
        assertThat(FizzBuzz.fizzBuzz(15), is("FizzBuzz"));
        assertThat(FizzBuzz.fizzBuzz(53), is("FizzBuzz"));  // Contiene 3 y 5
    }

    @Test
    public void testNumber() {
        assertThat(FizzBuzz.fizzBuzz(1), is("1"));
        assertThat(FizzBuzz.fizzBuzz(4), is("4"));
    }
}
