package org.fizzbuzz.model;

import org.fizzbuzz.ifizzbuzz.AbstractFizzBuzz;

public class Buzz5 extends AbstractFizzBuzz {

	public Buzz5(int nombre) {
		super(nombre, 5);
	}
	
	public boolean isBuzz() {
		return this.estDivisible() || this.contient();
	}
}
