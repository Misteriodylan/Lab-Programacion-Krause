package dylan;
import java.util.*;
public class Veterinarios {
	private String legajo;
	private String nombre_vete;
	public List<Animales> lista;
	public Veterinarios(String legajo,String nombre_vete) {
		this.legajo=legajo;
		this.nombre_vete=nombre_vete;
		this.lista = new ArrayList<>();
	}
	public String getLegajo() {
        return legajo;
    }
	public String getNombre_vete() {
        return nombre_vete;
    }
	public void AgregarAnimales(Animales animal) {
        lista.add(animal);
    }

    public void mostrarAnimales() {
        System.out.println("Veterinario: " + nombre_vete);

        for (Animales animal : lista) {
            System.out.println("- " + animal.getNombre_animal());
        }
    }
}
