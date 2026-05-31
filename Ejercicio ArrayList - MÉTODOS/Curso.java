package dylan;
import java.util.List;
import java.util.ArrayList;
public class Curso {
private String nombre;
private List<Estudiante>alumnos;
public Curso(String nombre) {
	this.nombre=nombre;
	this.alumnos=new ArrayList<>();
}
public String getNombre() {
	return nombre;
}
public void inscribir(Estudiante e) {
	alumnos.add(e);
	System.out.println("Alumno: " + e.getNombre()+ " inscrito");
}
public void darDebaja(int indice) {
	alumnos.remove(indice);
}
public void listarAlumnos() {
	for (Estudiante u: alumnos) {
		u.Mostrarficha();
	}
}
public void cantidadAlumnos() {
	alumnos.size();
}
}
