package Examen;


public class Persona {
	int id;
	private String codigo;
	private String nombre;
	float  correlativo;
	public Persona next;
	public Persona(int id, String nombre, String codigo, float correlativo ) {
		this.id=id;
		this.codigo=codigo;
		this.nombre=nombre;
		this.correlativo=correlativo;
		
	}
	public int getid() {return id;}
	public void setid(int id) {this.id=id;}
	public String getcodigo() {return codigo;}
	public void setcodigo(String codigo) {this.codigo=codigo;}
	public String getnombre() {return nombre;}
	public void setnombre(String nombre) {this.nombre=nombre;}
	public float getcorrelativo() {return correlativo;}
	public void setcorrelativo(float correlativo) {this.correlativo=correlativo;}
    @Override
    public String toString() {
        return "Persona{" + "id=" + id +", codigo='" +"EMP-" + codigo +", nombre='" +nombre+", correlativo='"+correlativo+'\'' +'}';
    }
}
