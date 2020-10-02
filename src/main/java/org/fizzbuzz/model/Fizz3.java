/**
 * 
 */
package org.fizzbuzz.model;

import org.fizzbuzz.ifizzbuzz.AbstractFizzBuzz;

/**
 * @author Utilisateur
 *
 */
public class Fizz3 extends AbstractFizzBuzz {

	public Fizz3(int nombre) {
		super(nombre, 3);
	}

	public boolean isFizz() {
		return this.estDivisible() || this.contient();
	}
}
