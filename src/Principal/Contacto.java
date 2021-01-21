package Principal;

public class Contacto {
	/**
	 * @author Marcos Hernández Aragonés
	 * @version 3.0
	 */
	private String nombre;
	private String telefono;
	

	/**
	 * se añaden el nombre y el telefon de los contactos
	 * @param nombre el nombre de nuestro contacto
	 * @param telefono el telefono de nuestro contacto
	 */
	
	public Contacto(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}

	/**
	 * devuelve el nombre
	 * @return el nombre de nuestro contacto
	 */

	public String getNombre() {
		return nombre;
	}

	/**
	 * cambias el nombre por uno que le pases
	 * @param nombre el nuevo nombre de nuestro contacto
	 */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * devuelve el telefono
	 * @return el telefono de nuestro contacto
	 */

	public String getTelefono() {
		return telefono;
	}

	/**
	 * cambias el telefono por uno que le pases
	 * @param telefono  el nuevo telefono de nuestro contacto
	 */

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * devuelve el nombre y el telefono
	 * @return devuelve el nombre y el telefono de la agenda
	 */

	@Override
	public String toString() {
		return nombre + " ---- " + telefono;
	}
	
	/**
	 * Se utiliza la funcion busqueda y luego se compara para ver si es el nombre o telefono que estamos buscando
	 * @param busqueda funcion que se utiliza para buascar a los contactos
	 * @return devueslve falso si no conunciden los nombres o los telefonos
	 */
	
	public boolean compara(String busqueda) {
		if (nombre.equalsIgnoreCase(busqueda) || telefono.equalsIgnoreCase(busqueda)) {
			return true;
		}else {
			return false;
		}
	}
}
