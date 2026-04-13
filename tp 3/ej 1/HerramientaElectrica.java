package dylan;

public class HerramientaElectrica extends Herramientas{
	private int voltaje;
	
	public HerramientaElectrica(int codigo, String marca, int voltaje) {
		super(codigo,marca);
		this.voltaje = voltaje;
		
	}
public void conectar() {
	System.out.println("la herramienta de " + codigo + "se esta conectando a " + voltaje + "volts");
}
public int getVoltaje() {
	return voltaje;	
}
public void setVoltaje(int voltaje) {
	this.voltaje = voltaje = voltaje;
}
}
