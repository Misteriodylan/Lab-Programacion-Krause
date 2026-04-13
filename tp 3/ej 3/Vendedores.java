package dylan;
import java.util.*;
public class Vendedores {
	private String legajo;
	private String nombre_vendedor;
	public List<Vehiculos> lista;
	public Vendedores(String legajo,String nombre_vendedor) {
		this.legajo=legajo;
		this.nombre_vendedor=nombre_vendedor;
		this.lista = new ArrayList<>();
	}
	public String getLegajo() {
        return legajo;
    }

    public String getNombre_vendedor() {
        return nombre_vendedor;
    }
    public void AgregarVehiculos(Vehiculos vehiculo) {
        lista.add(vehiculo);
    }
    public void mostrarVehiculos() {
        System.out.println("Vendedor: " + nombre_vendedor);
        
        for (Vehiculos vehiculo : lista) {
            System.out.println("- " + vehiculo.getModelo());
        }
    }
}