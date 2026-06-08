package dylan;
import java.util.ArrayList;
public class Hospital {
private ArrayList<Paciente>pacientes =new ArrayList<Paciente>();
public void agregarPaciente(Paciente p) {
	pacientes.add(p);
}
public void listarPaciente() {
	for(Paciente p:pacientes) {
		System.out.println("Nombre: " + p.getNombre() + "dni: " + p.getDni() +"Edad: " + p.getEdad() + "Peso: " + p.getPeso() + "¿Esta hospitalizado?: " + p.getEstaHospitalizado());
}
}
public void cantPacientes() {		
System.out.println(pacientes.size());
		
}
public void infoPorIndice(int indice) {
	Paciente p = pacientes.get(indice);
	
	System.out.println("Nombre: "+p.getNombre());
	System.out.println("Edad: "+p.getEdad());
	p.hospitalizado();
}
}
