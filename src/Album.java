import java.util.List;
import java.util.ArrayList;

public class Album {

	private String nombre;
	private ArrayList<Administrador> administradores;
	
	
	public Album(String nombre) {
		super();
		this.nombre = nombre;
		this.administradores = new ArrayList<Administrador>();
	}
	
	
	
}
