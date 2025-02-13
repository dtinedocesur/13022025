package cesur24252;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuentaBancariaTest {

	
	

	@Test
	void testGetSaldo() {
		CuentaBancaria cuenta1 = new CuentaBancaria("ES21099865462528660871295",100);
		assertEquals(100,cuenta1.getSaldo());
	}

	@Test
	void testSetSaldo() {
		CuentaBancaria cuenta1 = new CuentaBancaria("ES21099865462528660871295",100);
		cuenta1.setSaldo(150);
		assertEquals(150, cuenta1.getSaldo());
	}

	@Test
	void testIngresarDinero() {
		CuentaBancaria cuenta1 = new CuentaBancaria("ES21099865462528660871295",100);
		cuenta1.ingresarDinero(400);
		assertEquals(500,cuenta1.getSaldo());
	}



}
