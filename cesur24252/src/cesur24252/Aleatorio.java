package cesur24252;

import java.util.Random;

public class Aleatorio {

	

	public static void main(String[] args) {
		
		Random r= new Random();
		int valorDado= r.nextInt(10)+1;
		System.out.print(valorDado);

	}

}
