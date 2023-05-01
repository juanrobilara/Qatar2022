import java.util.ArrayList;

public class UsuarioFinal extends Usuario {
	private ArrayList<Figurita> figuritasDisponibles;
	
	public UsuarioFinal(Integer id, String nombre) {
		super(id, nombre);
		
	}

	@Override
	public void agregarFigurita(Figurita actual) {
		figuritasDisponibles.add(actual);
		
	}



}
