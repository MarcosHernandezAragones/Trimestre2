package Ejercicio_Clinica;

import java.util.Random;



public class Persona {
	private String nombre;
	private String dni;
	private int edad;
	private char sexo; // H - Hombre --- M - Mujer
	private double peso;
	private double altura; // Altura en m
	
	
	private final char HOMBRE = 'H'; // Constante Hombre
	private final char MUJER = 'M'; // Constante Mujer
	private final int BAJOPESO = -1; // Constante Bajo Peso
	private final int PESOIDEAL= 0; // Constante Peso Ideal
	private final int SOBREPESO = 1; // Constante Sobre Peso
	
	public Persona() {
		this.nombre = "";
		this.dni = generarDNI();
		this.edad = 0;
		this.sexo = HOMBRE;
		this.peso = 0;
		this.altura = 0;
	}


	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.dni = generarDNI();
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
		this.peso = 0;
		this.altura = 0;
	}


	public Persona(String nombre, String dni, int edad, char sexo, double peso, double altura) { //inicializar los atributos
		this.nombre = nombre;
		this.dni = comprobarDNI(dni);
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	}
	
	
	public int calcularIMC() {
		double peso = this.peso / (altura*altura);
			
		if (peso < 18.5) {
			return BAJOPESO;
		}else if(peso < 24.9){
			return PESOIDEAL;
		}else {
			return SOBREPESO;
		}
		
	}
	
	
	public boolean esMayorEdad() {
		if (edad<18) {
			return false;
		}else {
			return true;
		}
	}
	
	
	private char comprobarSexo(char sexo) {
		
		if (sexo == HOMBRE || sexo == MUJER) {
			return sexo;
		} else {
			return HOMBRE;
		}
	}


	
	
	private String generarDNI() {
		
		Random r = new Random();
		String dni="";
		int num=0;
		
		for (int i = 0; i < 8; i++) {
			num=r.nextInt(10);
			dni=num+dni;
		}
		
		dni= dni + generarLetraDNI(dni);
		
		return dni;
	}
	
	private String generarLetraDNI(String dni) {
		
		String letra="-";
		int resto=0;
		int dniNum = Integer.valueOf(dni);
		
		String letras="TRWAGMYFPDXBNJZSQVHLCKE";
		
		resto = dniNum%23;
		
		letra +=letras.substring(resto, resto+1);
		
		return letra;
		
	}
	
	private String comprobarDNI(String dni) {
		
		boolean valido=false;
		String letraValida="",letraRecibida="";
		
		String numDni="";
		
		numDni = dni.substring(0, 8);
		letraRecibida = dni.substring(9);
		letraValida=generarLetraDNI(numDni);
		
		if (letraRecibida.equalsIgnoreCase(letraValida)) {
			valido=true;
		}
		
		
		if (valido==true) {
			return dni;
		}else {
			return generarDNI();
		}
	}
	
	@Override
	public String toString() {
		String sexo;
		
		if (this.sexo == HOMBRE) {
			sexo="Hombre";
		}else {
			sexo="Mujer";
		}
		
		return "Persona nombre= " + nombre + " dni= " + dni + " edad= " + edad + " sexo= " + sexo + " peso= " + peso + " kg altura= " + altura + " m";
	}

	
	
}
