package cesur24252;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumaTest {

	@Test
	void testSumar() {
		Suma S=new Suma(2,3);
		assertTrue(S.sumar()==4);
		
	}

}
