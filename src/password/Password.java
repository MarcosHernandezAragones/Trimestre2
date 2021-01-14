package password;

import java.util.Random;

public class Password {

	private int longitud;
	private String contrasena;

	
	public Password() {
		this.longitud = 11;
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
		
		
		for (int i = 0; i < longitud; i++) {
			
			for (int j = 0; j < letraMin.length(); j++) {
				if (contrasena.substring(i,i+1).equals(letraMin.substring(j, j+1))) {
					
				}
				if (contrasena.substring(i,i+1).equals(letraMay.substring(j, j+1))) {
					contMay++;
				}
			}
			
			for(int j = 0; j < numero.length(); j++) {
				if (contrasena.substring(i,i+1).equals(numero.substring(j, j+1))) {
					contNum++;
				}
			}
		}
		
		
		if (contMay>2 && contMin>1 && contNum>5) {
			return true;
			
		}else {
			return false;
			
		}
		
		
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
