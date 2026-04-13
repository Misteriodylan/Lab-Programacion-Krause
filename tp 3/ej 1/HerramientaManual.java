package dylan;

public class HerramientaManual extends Herramientas {
	private String tipoEmpuñadura;
	public HerramientaManual(int codigo, String marca, String tipoEmpuñadura) {
		super(codigo,marca);
		this.tipoEmpuñadura = tipoEmpuñadura;
	}
	public String getTipoEmpuñadura() {
		return tipoEmpuñadura;
	}
	public void setTipoEmpuñadura(String TipoEmpuñadura) {
		this.tipoEmpuñadura = tipoEmpuñadura;
	}

}
