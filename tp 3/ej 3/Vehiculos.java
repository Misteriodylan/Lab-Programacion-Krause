package dylan;

public abstract class Vehiculos {
	private String patente;
	private String modelo;
	public Vehiculos(String patente,String modelo) {
		this.patente=patente;
		this.modelo=modelo;
	}
	  public String getModelo() {
	        return modelo;
	    }
	  public String getPatente() {
	        return patente;
	    }
}
