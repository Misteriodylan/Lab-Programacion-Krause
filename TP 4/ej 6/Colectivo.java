package dylan;

public class Colectivo extends Unidad{
private int numLinea;
	
	public Colectivo(int idInterno, int capacidadPasajeros, int numLinea) {
		super(idInterno, capacidadPasajeros);
		this.numLinea = numLinea;
	} 
	
	public int getNroLinea() {
		return numLinea;
	}
	public void setNroLinea(int numLinea) {
		this.numLinea = numLinea;
	}
}
