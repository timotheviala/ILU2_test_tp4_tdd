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
}
