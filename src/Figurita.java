
public class Figurita {

	private Integer codigo;
	private Character grupo;
	private String pais;
	private String nombre;
	private Integer valorM;
	
	



	public Figurita(Integer codigo, Character grupo, String pais, String nombre, Integer valorM) {
		
		this.codigo = codigo;
		this.grupo = grupo;
		this.pais = pais;
		this.nombre = nombre;
		this.valorM = valorM;
	}


	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public Character getGrupo() {
		return grupo;
	}


	public void setGrupo(Character grupo) {
		this.grupo = grupo;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getValorM() {
		return valorM;
	}


	public void setValorM(Integer valorM) {
		this.valorM = valorM;
	}
	
	

}
