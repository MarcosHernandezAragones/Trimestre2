package Principal;

public class Contacto {
	private String nombre;
	private String telefono;
	

	public Contacto(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	@Override
	public String toString() {
		return nombre + " ---- " + telefono;
	}
	
	public boolean compara(String busqueda) {
		if (nombre.equalsIgnoreCase(busqueda) || telefono.equalsIgnoreCase(busqueda)) {
			return true;
		}else {
			return false;
		}
	}
}
