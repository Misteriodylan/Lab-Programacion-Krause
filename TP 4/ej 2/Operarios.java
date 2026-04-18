package dylan;

public class Operarios extends Empleado{
private float valorHoraExtra;
	
	public Operarios(String legajo, float sueldoBase, float valorHoraExtra) {
		super(legajo, sueldoBase);
		this.valorHoraExtra = valorHoraExtra;
	} 
	
	public float getValorHoraExtra() {
		return valorHoraExtra;
	}
	public void setValorHoraExtra(float valorHoraExtra) {
		this.valorHoraExtra = valorHoraExtra;
	}
}
