
public abstract class Usuario {
	protected Integer id;
	protected String nombre;
	
	public Usuario(Integer id, String nombre) {
		
		this.id = id;
		this.nombre = nombre;
	}
	
	public abstract void agregarFigurita(Figurita actual);
	
}
