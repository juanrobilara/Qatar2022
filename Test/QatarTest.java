import static org.junit.Assert.*;

import org.junit.Test;

public class QatarTest {

	@Test
	public void queSePuedaCrearUnaFigurita() {
		Figurita figu = new Figurita(123, 'D', "Albania", "Messi", 10000);
		
		assertNotNull(figu);
	}
	
	@Test
	public void queSePuedaCrearUnAdmin() {
		Album a = new Album("Panini");
		Administrador admin = new Administrador(15, "Juan Perez");
		
		a.agregarAdmin(admin);
		
		Integer valorObtenido = a.getCantidadAdmins();
		Integer valorEsperado = 1;
		
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void queSeCreeUnUserFinal() {
		Album a = new Album("Panini");
		UsuarioFinal u = new UsuarioFinal(15, "Juan Perez");
		
		
		a.agregarUsuario(u);
		
		Integer valorObtenido = a.getCantidadUsuarios();
		Integer valorEsperado = 1;
		
		assertEquals(valorEsperado, valorObtenido);
	}
}
