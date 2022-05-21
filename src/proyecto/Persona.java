package proyecto;


public class Persona {
	private String codigo;
	private String nombre;
	private int edad;
	public Persona next;
	public Persona(int edad, String nombre, String codigo ) {
		this.codigo=codigo;
		this.nombre=nombre;
		this.edad=edad;
	}
	public String getcodigo() {return codigo;}
	public void setcodigo(String codigo) {this.codigo=codigo;}
	public String getnombre() {return nombre;}
	public void setnombre(String nombre) {this.nombre=nombre;}
	public int getedad() {return edad;}
	public void setedad(int edad) {this.edad=edad;}
}
