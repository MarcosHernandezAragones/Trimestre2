package password;

public class Principal {

	public static void main(String[] args) {
		
		Password p = new Password(30);
		
		System.out.println(p.getContrasena());
		
		System.out.println(p.esFuerte());
		
	}

}
