/**
 * 
 */
package org.fizzbuzz;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


import org.fizzbuzz.model.Buzz5;
import org.junit.Test;

/**
 * @author Utilisateur
 *
 */
public class Buzz5Test {
	
	@Test
	public void testBuzz5() {
		Buzz5 buzz5 = new Buzz5(3);
		Buzz5 buzz52 = new Buzz5(5);
		
		assertThat(buzz5.isBuzz(), is(false));
		assertThat(buzz52.isBuzz(), is(true));
	}
}
