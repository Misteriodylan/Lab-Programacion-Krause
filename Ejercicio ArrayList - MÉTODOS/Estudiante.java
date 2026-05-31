package dylan;

public class Estudiante {
	private String nombre;
	private String dni;
	private Double prom; 
public Estudiante (String nombre,String dni,Double prom) {
	this.nombre=nombre;
	this.dni=dni;
	this.prom=prom;
}
public String getNombre() {
	return nombre;
}
public Double getProm() {
	return prom;
}
public void Mostrarficha() {
	System.out.println("Nombre: " + nombre);
    System.out.println("DNI: " + dni);
    System.out.println("Promedio: " + prom);
}

}
