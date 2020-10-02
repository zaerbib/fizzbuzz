package org.fizzbuzz;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.fizzbuzz.model.Fizz3;
import org.junit.Test;

public class Fizz3Test {
	
	@Test
	public void testFizz3() {
		Fizz3 fizz3 =  new Fizz3(3);
		Fizz3 fizz32 = new Fizz3(5);
		
		assertThat(fizz3.isFizz(), is(true));
		assertThat(fizz32.isFizz(), is(false));
	}
}
