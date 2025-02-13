package cesur24252;

import java.util.Random;

public class Aleatorio2 {

	

	public static void main(String[] args) {
		
		aleatorio();

	}

	private static void aleatorio() {
		Random r= new Random();
		int valorDado= r.nextInt(10)+1;
		System.out.print(valorDado);
	}

}
