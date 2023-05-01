import java.util.List;
import java.util.ArrayList;

public class Album {

	private String nombre;
	private ArrayList<Administrador> administradores;
	private ArrayList<UsuarioFinal> consumidores;
	private ArrayList<Figurita> figuritas;
	
	
	public Album(String nombre) {
		super();
		this.nombre = nombre;
		this.administradores = new ArrayList<Administrador>();
		this.consumidores = new ArrayList<UsuarioFinal>();
		this.figuritas = new ArrayList<Figurita>();
	}
	
	public void agregarAdmin(Administrador actual) {
		administradores.add(actual);
	}
	
	public void agregarUsuario(UsuarioFinal actual) {
		consumidores.add(actual);
	}
	
	public Integer getCantidadAdmins() {
		return this.administradores.size();
	}
	
	public Integer getCantidadUsuarios() {
		return this.consumidores.size();
	}

	public void agregarFigurita(Figurita actual) {
		figuritas.add(actual);
		
	}
	
}
