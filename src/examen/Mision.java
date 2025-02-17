package examen;

public class Mision {
	private String nombre;
	private String descripcion;
	private int puntuacionNecesaria;
	
	public Mision() {
	}
	
	public Mision(String nombre, String descripcion, int puntuacionNecesaria) {	
		this.nombre = nombre;
		this.descripcion = descripcion;
		if (puntuacionNecesaria < 10) {
			puntuacionNecesaria = 10;
		} else if (puntuacionNecesaria > 400) {
			puntuacionNecesaria = 400;
		}
		this.puntuacionNecesaria = puntuacionNecesaria;
	}
	// para asegurar que la puntuacion se encuentre entre 10 y 400
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public int getPuntuacionNecesaria() {
		return puntuacionNecesaria;
	}
	
	public void setPuntuacionNecesaria(int puntuacionNecesaria) {
		this.puntuacionNecesaria = puntuacionNecesaria;
	}
	
	@Override
	public String toString() {
		return "| Nombre: " + nombre + " | Descripcion: " + descripcion + " | Puntuacion Necesaria: " + puntuacionNecesaria + " |";
	}
	
}
