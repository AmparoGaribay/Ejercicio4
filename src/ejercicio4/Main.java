package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ¿Que hace el codigo?
		 * El codigo lo que hace es jugar un piedra papel y tijeras en donde basado en dos posibles 
		 * entradas asigna dos variables y las compara entre ellas en donde mediante un if compara ambas condiciones y
		 * dice que si las dos son igual entonces es un empate, pero si son diferentes, entonces entra en un switch 
		 * en  donde tiene un caso para cada uno de los supuestos. en donde evalua si son iguales entonces va a 
		 * realizar una accion determinada
		 * */
		
		/*errores :
		 * no tener declarado el sistem. in en el scaner 
		 * no se necesitan dos scanners solo con uno es suficiente
		 * faltan las llaves que cierran
		 * sobraban parentesis en la condicion del if
		 * faltaban cerrar la conexion del scanner para optimizar la memoria.
		 * */
		

		Scanner s = new Scanner(System.in);

		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		String j1 = s.nextLine();

		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		//  Scanner s2 = new Scanner();
		String j2 = s.nextLine();

		if (j1 == j2) {
			System.out.println("Empate");
		} else {
			int g = 2;
			switch(j1) {
				case "piedra":
					if (j2 == "tijeras") {
						g = 1;
					}
	
				case "papel":
					if (j2 == "piedra") {
						g = 1;
					}
				case "tijera":
					if (j2.equals("papel")) {
						g = 1;
					}
				break;
				default:
					}
					System.out.println("Gana el jugador " + g);
			}
		s.close();

		}
	
	
	

}
