package fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FizzBuzzTests {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testFizzBuzz() {
        assertEquals("Fizz", fizzBuzz.fizzBuzz(3));
        assertEquals("Buzz", fizzBuzz.fizzBuzz(5));
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
        assertEquals("7", fizzBuzz.fizzBuzz(7));
    }

    @Test
    public void testFizzBuzz2() {
        assertEquals("Fizz", fizzBuzz.fizzBuzz2(3)); 
        assertEquals("Buzz", fizzBuzz.fizzBuzz2(5));
        assertEquals("Fizz", fizzBuzz.fizzBuzz2(53)); 
        assertEquals("Buzz", fizzBuzz.fizzBuzz2(55)); 
        assertEquals("7", fizzBuzz.fizzBuzz2(7));
    }
}
