import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		String iban, nombre, pin;
		double saldo;
		Scanner sc = new Scanner (System.in);
		
		//Objeto uno
		cuentas c1 = new cuentas();
		c1.setTitular("Javier");
		System.out.println("Iban: "+c1.getIBAN());
		System.out.println("Titular: "+c1.getTitular());
		
		
		System.out.print("Dime el iban: ");
		iban=sc.next();
		System.out.print("Dime el titular: ");
		nombre=sc.next();
		cuentas c2 = new cuentas(iban,nombre);
		System.out.println("Iban2: "+c2.getIBAN());
		System.out.println("Titular2: "+c2.getTitular());
		System.out.println("Saldo2: "+c2.getSaldo());
	}

}
