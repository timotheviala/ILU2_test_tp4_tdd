package fizzbuzz;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import fizzbuzz.*;

public class FizzBuzzTest {
	
	@Test
	void testFizzUn() {
		assertEquals(FizzBuzz.fizzbuzz(1),"1");
	}
	
	@Test
	void testFizzDeux() {
		assertEquals(FizzBuzz.fizzbuzz(2),"2");
	}
	
	@Test
	void testFizzTrois() {
		assertEquals(FizzBuzz.fizzbuzz(3),"fizz");
	}
	
	@Test
	void testFizzPlusieursVal() {
		assertEquals(FizzBuzz.fizzbuzz(4), "4");
		assertEquals(FizzBuzz.fizzbuzz(6),"fizz");
		assertEquals(FizzBuzz.fizzbuzz(7), "7");
	}
}
