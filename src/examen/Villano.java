package examen;

import java.util.Arrays;

public class Villano {
	private String nombre;
	private int maldad;
	private Minions[] ejercito;
	private int victorias = 0;
	
	public Villano() {
	}

	public Villano(String nombre, int maldad) {
		this.nombre = nombre;
		if (maldad < 1) {
			maldad = 1;
		} else if (maldad > 4) {
			maldad = 4;
		}
		this.maldad = maldad;
		ejercito = new Minions[this.maldad * 10];
	}
	// para asegurar que la maldad se encuentre entre 1 y 4

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMaldad() {
		return maldad;
	}

	/* public void setMaldad(int maldad) {
		this.maldad = maldad;
	} */
	// no se puede cambiar la maldad

	public Minions[] getEjercito() {
		return ejercito;
	}

	/* public void setEjercito(Minions[] ejercito) {
		this.ejercito = ejercito;
	} */
	// no se puede cambiar el ejercito

	public int getVictorias() {
		return victorias;
	}

	public void setVictorias(int victorias) {
		this.victorias = victorias;
	}

	@Override
	public String toString() {
		return "| Alias: " + nombre + " | Nivel de Maldad: " + maldad + " | Ejercito de Minions: " + Arrays.toString(ejercito) + " | Numero de Victorias: " + victorias + " |";
	}
	
	public void registrarVictorias() {
		setVictorias(getVictorias() + 1);
	}
	// metodo para aumentar el numero de victorias en caso de que se complete la mision
	
	public void reclutarMinions() {
		for (int i = 0; i < ejercito.length; i++) {
			if (ejercito[i] == null) {
				Minions minion = new Minions();
				ejercito[i] = minion;
			}
			
		}	
	}
	// metodo para llenar el ejercito de minions
	
}
