package dylan;
import java.util.List;

public class Socio {
	private int numSocio;
	private String nombre;
	private List<Reserva> historial;
	
	public Socio(int numSocio, String nombre) {
		this.numSocio = numSocio;
		this.nombre = nombre;
	}
	
	public void añadirReserva(Reserva reserva) { 
		historial.add(reserva);
		System.out.println("Se ha añadido una reserva a nombre de " + nombre );
	}
	
	public int getNumSocio() {
		return numSocio;
	}
	public void setNumSocio(int numSocio) {
		this.numSocio = numSocio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}