package examen;

import java.util.Random;

public class Minions {
	Random random = new Random();
	
	private int fuerza;
	private int torpeza;
	
	public Minions() {
		this.fuerza = random.nextInt(10) + 1;
		this.torpeza = random.nextInt(10) + 1;
	}
	/* se establece un numero aleatorio para fuerza y torpeza en el constructor
	 * cuando se crea un minion nuevo, automaticamente se le asignan esos valores
	 */

	public int getFuerza() {
		return fuerza;
	}

	/* public void setFuerza() {
		this.fuerza = random.nextInt(10) + 1;
	} */
	// no se puede cambiar la fuerza del minion

	public int getTorpeza() {
		return torpeza;
	}

	/* public void setTorpeza() {
		this.torpeza = random.nextInt(10) + 1;
	} */
	// no se puede cambiar la torpeza del minion

	@Override
	public String toString() {
		return "Minion: (Nivel de Fuerza: " + this.fuerza + ", Nivel de Torpeza: " + this.torpeza + ")";
	}
	
}
