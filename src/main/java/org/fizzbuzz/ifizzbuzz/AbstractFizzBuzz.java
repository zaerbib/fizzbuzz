/**
 * 
 */
package org.fizzbuzz.ifizzbuzz;

/**
 * @author Utilisateur
 *
 */
public abstract class AbstractFizzBuzz implements IFizzBuzz {
	private int nombre, dividende;
	
	public AbstractFizzBuzz(int nombre, int dividende) {
		super();
		this.nombre = nombre;
		this.dividende = dividende;
	}

	/* (non-Javadoc)
	 * @see org.fizzbuzz.ifizzbuzz.IFizzBuzz#estDivisible(int)
	 */
	public boolean estDivisible() {
		return (nombre % dividende) == 0;
	}

	/* (non-Javadoc)
	 * @see org.fizzbuzz.ifizzbuzz.IFizzBuzz#contient(int)
	 */
	public boolean contient() {
		return String.valueOf(nombre).contains(String.valueOf(dividende));
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public int getDividende() {
		return dividende;
	}

	public void setDividende(int dividende) {
		this.dividende = dividende;
	}
}
