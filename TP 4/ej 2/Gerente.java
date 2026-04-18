package dylan;

public class Gerente extends Empleado {
private float bonoResponsabilidad;
	
	public Gerente(String legajo, float sueldoBase, float bonoResponsabilidad) {
		super(legajo, sueldoBase);
		this.bonoResponsabilidad = bonoResponsabilidad;
	}
	
	public float getValorHoraExtra() {
		return bonoResponsabilidad;
	}
	public void setValorHoraExtra(float bonoResponsabilidad) {
		this.bonoResponsabilidad = bonoResponsabilidad;
	}
}
