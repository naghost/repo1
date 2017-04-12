import java.util.*;
public class Vehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Inicio Variables y objetos*/
	boolean coche,motos,camiones;
	String vehiculo[][];
	int seleccion;
	Scanner sc = new Scanner(System.in);
	vehiculo = new String[100][3];
	
	System.out.println("Hola mundo");
	/* Menu principal*/
		System.out.println("Bienvenido al sistema de clasificacion");
		System.out.println("¿Que quieres realizar?");
		System.out.println("1. Introducir un vehiculo");
		System.out.println("2. Ver Vehiculos");
		System.out.println("3. Ver Coches");
		System.out.println("4. Ver Motos");
		System.out.println("5. Ver Camiones");
		System.out.println("Selecciona una opcion");
		seleccion = sc.nextInt();
			/**/
			switch(seleccion){
			case 1:
				System.out.println("Introducir un vehiculo");
				System.out.print("");
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			}
	}

}
