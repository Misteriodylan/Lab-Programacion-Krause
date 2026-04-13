package dylan;

public abstract class Animales {
	private String nombre_animal;
	private String fecha_nacimiento;
	public Animales(String nombre_animal,String fecha_nacimiento) {
		this.nombre_animal=nombre_animal;
		this.fecha_nacimiento=fecha_nacimiento;
		
	}
	public String getNombre_animal() {
        return nombre_animal;
    }
	public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }
}
