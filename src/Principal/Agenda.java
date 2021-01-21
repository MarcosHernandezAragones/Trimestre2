package Principal;

import java.util.Scanner;

public class Agenda {
	/**
	 * @author Marcos Hernández Aragonés
	 * @version 3.0
	 */
	private String propietario;
	private Contacto[] vAgenda;

	
	public Agenda() {
		propietario = "";
		vAgenda = new Contacto[10];

	}
	
	/**
	 * Añadir ejemplos a nuestra agenda
	 * @param propietario Añadir ejemplos a nuestra agenda
	 */

	public Agenda(String propietario) {
		this.propietario = propietario;
		vAgenda = new Contacto[10];
		vAgenda[0] = new Contacto("Juan", "999888777");
		vAgenda[1] = new Contacto("Pepe", "222222");
		vAgenda[2] = new Contacto("Silvia", "333333");
	}

	/**
	 * Definir la longitud de nuestra agenda
	 * @param propietario el dueño de la agenda
	 * @param tam el tamaño de la agenda
	 */
	
	public Agenda(String propietario, int tam) {
		this.propietario = propietario;
		vAgenda = new Contacto[tam];
	}
	
	/**
	 * metodo estatico que nos muestra solo el menu
	 * @return devuelve la opcion elegida
	 */

	public static int verMenu() {
		Scanner leer = new Scanner(System.in);
		int opc = 0;
		do {
			System.out.println("Agenda telefonos 2.0 \n -------------- \n");
			System.out.println("1- Ver todos los contactos");
			System.out.println("2- A�adir contacto");
			System.out.println("3- Borrar contacto");
			System.out.println("4- Buscar contacto");
			System.out.println("5- Editar contacto");
			System.out.println("6- Salir");
			try {
				opc = leer.nextInt();
			} catch (Exception e) {
				opc = 0;
				leer = new Scanner(System.in);
			}

			if (opc < 1 || opc > 6) {
				System.out.println("Opci�n no v�lida \n\n");
			}
		} while (opc < 1 || opc > 6);
		return opc;
	}

	/**
	 * devuelve el propietario
	 * @return devuelve el propietario
	 */
	
	public String getPropietario() {
		return propietario;
	}

	/**
	 * El toString para mostrar el propietario y los contactos
	 */
	
	@Override
	public String toString() {
		String contactos = "";

		for (int i = 0; i < vAgenda.length; i++) {
			if (vAgenda[i] != null) {
				contactos += vAgenda[i].toString() + "\n";
			}
		}

		return propietario + "\n" + contactos;
	}

	
	/**
	 * Buscar una posion libre para añadir un contacto
	 * @return devuelve -1 si no lo encuentra
	 */
	private int buscarPosicion() {

		int pos = -1;
		for (int i = 0; i < vAgenda.length; i++) {
			if (vAgenda[i] == null) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Busca nombre o telefeno que se van a utilizar más tarde
	 * @param busqueda funcion externa para buscar
	 * @return -1 si no lo encuentra
	 */
	
	private int buscarPosicion(String busqueda) {

		for (int i = 0; i < vAgenda.length; i++) {
			if (vAgenda[i].compara(busqueda)) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Añadir un contacto
	 */
	
	public void anadirContacto() {

		Scanner leer = new Scanner(System.in);

		String nombre, telefono;
		int pos;

		try {

			System.out.println("dime su nombre");
			nombre = leer.nextLine();
			System.out.println("dime su telefono");
			telefono = leer.nextLine();

			Contacto c = new Contacto(nombre, telefono);
			pos = buscarPosicion();
			vAgenda[pos] = c;
			System.out.println("Este contacto morira en 3 dias.");
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("Tu agenda esta llena.");
		} catch (Exception e) {
			System.out.println("Contacto no a�adido.");
		}

	}
	
	/**
	 * borrar un contacto
	 */

	public void borrarContacto() {
		Scanner leer = new Scanner(System.in);

		String busqueda;
		int pos;

		try {

			System.out.println("dime su nombre o el telefono");
			busqueda = leer.nextLine();

			pos = buscarPosicion(busqueda);
			vAgenda[pos] = null;
			System.out.println("contacto borrado");
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("El contacto no exsiste.");
		} catch (Exception e) {
			System.out.println("El contacto no se a podido borrar.");
		}

	}
<<<<<<< HEAD

=======
	
	/**
	 * Se utiliza la funcion busqueda para buscar los contactos
	 * @return devuelve el propietario y el contacto que hemos buscado
	 */
	
>>>>>>> main
	public String buscarContacto() {
		Scanner leer = new Scanner(System.in);

		String busqueda, respuesta = "";
		int pos;
		try {

			System.out.println("dime su nombre o el telefono");
			busqueda = leer.nextLine();

			pos = buscarPosicion(busqueda);
			for (int i = 0; i < vAgenda.length; i++) {
				if (i == pos) {
					respuesta += vAgenda[pos].toString() + "\n";
				}
			}
			System.out.println("contacto borrado");
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("El contacto no exsiste.");
		} catch (Exception e) {
			System.out.println("El contacto no se a podido borrar.");
		}
		return propietario + "\n" + respuesta;

	}
<<<<<<< HEAD

=======
	
	/**
	 * se utiliza la funcion busqueda para editar un contacto
	 */
	
>>>>>>> main
	public void editarContacto() {
		Scanner leer = new Scanner(System.in);

		String nombre, telefono;
		String busqueda, respuesta = "";
		int pos;
		try {

			System.out.println("dime su nombre o el telefono");
			busqueda = leer.nextLine();

			pos = buscarPosicion(busqueda);
			for (int i = 0; i < vAgenda.length; i++) {
				if (i == pos) {
					System.out.println("dime su nombre");
					nombre = leer.nextLine();
					System.out.println("dime su telefono");
					telefono = leer.nextLine();
					Contacto c = new Contacto(nombre, telefono);
					pos = buscarPosicion();
					vAgenda[i] = c;
					i = vAgenda.length;
				}
			}
<<<<<<< HEAD

			System.out.println("contacto A�adido");
=======
			
			System.out.println("contacto A�adido");
>>>>>>> main
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("El contacto no exsiste.");
		} catch (Exception e) {
			System.out.println("El contacto no se a podido borrar.");
		}
	}
}
