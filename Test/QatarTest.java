import static org.junit.Assert.*;

import org.junit.Test;

public class QatarTest {

	@Test
	public void queSePuedaCrearUnaFigurita() {
		Figurita figu = new Figurita(123, 'D', "Albania", "Messi", 10000);
		
		assertNotNull(figu);
	}

}
