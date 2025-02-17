package examen;

import java.util.Scanner;

public class Pruebas {

	static Scanner numeros = new Scanner(System.in);
	static Scanner letras = new Scanner(System.in);
	static Mision[] misiones = new Mision[10];
	static Villano villano = new Villano("Snoopy", 4);
	// escaners, array de misiones y objeto villano creados como estaticos
	
	public static void main(String[] args) {
		int opcion;
		
		villano.reclutarMinions();
		// llamo al metodo reclutarMinions para llenar el ejercito
		bienvenida();
		do {
			
			menuInicio();
			opcion = numeros.nextInt();
			tratarMenuInicio(opcion);
			
		} while (opcion != 5);

	}
	
	private static void bienvenida() {
		System.out.println("🦧🦧🦧 Bienvenid@ al programa de gestion de super villanos, solo para los villanos mas malosos de todos 🦧🦧🦧");
		
	}
	
	private static void menuInicio() {
		System.out.println("\n🦧 Por favor escoja una de las opciones disponibles: 🦧");
		System.out.println("1) Crear Misiones");
		System.out.println("2) Listar Misiones");
		System.out.println("3) Listar Estadisticas");
		System.out.println("4) Conseguir Victorias");
		System.out.println("5) Salir");
		
	}
	
	private static void tratarMenuInicio(int opcion) {
		switch (opcion) {
		case 1:
			crearMision();
			break;
		case 2:
			listarMisiones();
			break;
		case 3:
			listarEstadisticas();
			break;
		case 4:
			conseguirVictoria();
			break;
		case 5:
			salir();
			break;
		default:
			error();
		}
		
	}
	
	private static void crearMision() {
		String nombre, descripcion;
		int puntuacion;
		boolean comprobar = false;
		
		System.out.println("\n🦧 Por favor introduzca el nombre de la mision a crear: 🦧");
		nombre = letras.nextLine();
		System.out.println("Su descripcion:");
		descripcion = letras.nextLine();
		System.out.println("Y su puntuacion:");
		puntuacion = numeros.nextInt();
		
		try {
			System.out.println("\nGenerando mision, espere por favor...");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		for (int i = 0; i < misiones.length; i++) {
			if (misiones[i] == null) {
				misiones[i] = new Mision(nombre, descripcion, puntuacion);
				comprobar = true;
				i = misiones.length;
			}
			
		}
		
		if (comprobar) {
			System.out.println("\nLa mision ha sido creada");
		} else {
			System.out.println("\nError, la mision no ha podido ser creada");
		}
		
	}
	// metodo para crear y añadir misiones nuevas al array
	
	private static void listarMisiones() {
		System.out.println("\n🦧 Datos de misiones por conquistar: 🦧");
		for (int i = 0; i < misiones.length; i++) {
			if (misiones[i] != null) {
				System.out.println(misiones[i]);
			}
			
		}
		
	}
	// metodo para recorrer el array e imprimir las misiones creadas
	
	private static void listarEstadisticas() {
		System.out.println("\n🦧 Datos de su increible e inigualable malosidad: 🦧");
		System.out.println(villano);
		
	}
	// metodo para imprimir el toString de villano
	
	private static void conseguirVictoria() {
		int numero, fuerza = 0, torpeza = 0, total;

		System.out.println("\n🦧 Introduzca el numero de mision a enfrentar: 🦧");
		numero = numeros.nextInt();
		if (misiones[numero - 1] != null ) {
			System.out.println("Puntuacion necesaria para completar la mision: " + misiones[numero - 1].getPuntuacionNecesaria());
			for (int i = 0; i < villano.getEjercito().length; i++) {
				fuerza += villano.getEjercito()[i].getFuerza();
				torpeza += villano.getEjercito()[i].getTorpeza();
				
			}
			
			System.out.println("\nFuerza total de minions: " + fuerza);
			System.out.println("Torpeza total de minions: " + torpeza);
			
			try {
				System.out.println("\nCalculando resultados, espere por favor...");
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			}
			
			total = fuerza - torpeza;
			if (total > misiones[numero - 1].getPuntuacionNecesaria()) {
				System.out.println("\n¡La mision ha sido un exito total!");
				villano.registrarVictorias();
				misiones[numero - 1] = null;
			} else {
				System.out.println("\nLa mision ha sido un fracaso...");
			}
			
		} else {
			System.out.println("\nError, esa mision aun no ha sido creada");
		}
		
	}
	/* metodo para elegir una mision del array
	 * si la fuerza combinada del ejercito es mayor que su torpeza combinada se completa la mision
	 * si una mision se completa el numero de victorias del villano aumenta y esa mision se borra
	 */
	
	private static void salir() {
		System.out.println("\n🦧 Saliendo del programa... 🦧");
		System.out.println("🦧🦧🦧 ¡Mucho animo en futuras conquistas! 🦧🦧🦧");
		
	}
	
	private static void error() {
		System.out.println("\n🦧 Error, por favor escoja una de las opciones disponibles 🦧");
		
	}

}
