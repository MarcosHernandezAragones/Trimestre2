package password;

import java.util.Random;

public class Password {
	
	private int longitud;
	private String contrasena;
	
	
	public Password() {
		this.longitud = 8;
		this.contrasena = "AAAaa111111"; //fuerte borrar final
	}
	
	
	public Password(int longitud) {
		this.longitud = longitud;
		contrasena="";
		generarPassword();
	}


	public boolean esFuerte() {
		
		return false;
	}
	
	
	public void generarPassword() {
		
		String letraMin="abcdefghijklmnñopqrstuvwxyz";
		String letraMay=letraMin.toUpperCase();
		String numero ="0123456789";
		String posi = letraMin + letraMay + numero;
		Random r = new Random();
		int aleatorio=0;
		
		for (int i = 0; i < longitud; i++) {
			aleatorio=r.nextInt(posi.length());
			contrasena += posi.substring(aleatorio, aleatorio+1);
		}
		
		System.out.println(contrasena);
		
	}

	

	public String getContrasena() {
		return contrasena;
	}


	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}


	public int getLongitud() {
		return longitud;
	}


	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	
	
	
}
