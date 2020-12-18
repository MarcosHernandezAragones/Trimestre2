package password;

import java.util.Random;

public class Password {

	private int longitud;
	private String contrasena;

	
	public Password() {
		this.longitud = 8;
		this.contrasena = "AAAaa111111"; // fuerte borrar final
	}

	
	public Password(int longitud) {
		this.longitud = longitud;
		contrasena = "";
		generarPassword();
	}

	
	public void generarPassword() {

		String letraMin = "abcdefghijklmnñopqrstuvwxyz";
		String letraMay = letraMin.toUpperCase();
		String numero = "0123456789";
		String posi = letraMin + letraMay + numero;
		Random r = new Random();
		int aleatorio = 0;

		for (int i = 0; i < longitud; i++) {
			aleatorio = r.nextInt(posi.length());
			contrasena += posi.substring(aleatorio, aleatorio + 1);
		}

	}

	
	public boolean esFuerte() {
		
		String letraMin = "abcdefghijklmnñopqrstuvwxyz";
		String letraMay = letraMin.toUpperCase();
		String numero = "0123456789";
		
		int contMin=0;
		int contMay=0;
		int contNum=0;
		
		for (int i = 0; i < letraMin.length(); i++) {
			if (contrasena.substring(i,i+1).equals(letraMin)) {
				contMin +=1;
			}
		}
		
		for (int i = 0; i < letraMay.length(); i++) {
			if (contrasena.substring(i, i+1).equals(letraMay)) {
				contMay +=1;
			}
		}
		
		for (int i = 0; i < numero.length(); i++) {
			if (contrasena.substring(i, i+1).equals(numero)) {
				contNum +=1;
			}
		}
		
		if (contMay>3 && contMin>1 && contNum>5) {
			return true;
		}
		
		return false;
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
