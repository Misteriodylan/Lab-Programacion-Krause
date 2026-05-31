package dylan;

public class Main {
	public static void main(String[] args) {
		Curso curso = new Curso("5°2");
		Estudiante e1 = new Estudiante("Dylan","111111",12.0);
		Estudiante e2 = new Estudiante("Alex","222222",14.0);
		Estudiante e3 = new Estudiante("Joey","333333",20.0);
		curso.getNombre();
		curso.inscribir(e1);
		curso.inscribir(e2);
		curso.inscribir(e3);
		curso.cantidadAlumnos();
		curso.darDebaja(1);
		curso.listarAlumnos();
		
	}
}
