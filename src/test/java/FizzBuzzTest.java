import org.junit.Before;
import org.junit.Test;

import com.fizzbuzz.fizzbuzzclass.FizzBuzz;

import junit.framework.Assert;

public class FizzBuzzTest {
	FizzBuzz fizzbuzz;
	
	@Before
	public void setup() {
		fizzbuzz = new FizzBuzz();
	}
	
	@Test
	public void testNumber() {
		
		int number = 1;
		String result = fizzbuzz.play(number);
		
		Assert.assertEquals("1", result);
	} 
	
	@Test
	public void fizzNumberDivisibleBy3() {
		
		int number = 3;
		String result = fizzbuzz.play(number);
		
		Assert.assertEquals("fizz", result);
	}
	
	@Test
	public void fizzNumberDivisibleBy5() {
		
		int number = 5;
		String result = fizzbuzz.play(number);
		
		Assert.assertEquals("buzz", result);
	}
	

}
