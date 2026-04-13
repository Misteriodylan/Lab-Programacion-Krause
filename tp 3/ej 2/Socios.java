package dylan;
import java.util.*;

public class Socios {
    private String nombre_Socio;
    private int num_socio;
    public List<Libros> lista; 

    public Socios(String nombre_Socio, int num_socio) {
        this.nombre_Socio = nombre_Socio;
        this.num_socio = num_socio;
        this.lista = new ArrayList<>(); 
    }

    public String getNombre() {
        return nombre_Socio;
    }

    public int getNum_socio() {
        return num_socio;
    }

    public void AgregarLibros(Libros libro) {
        lista.add(libro);
    }
    public void mostrarLibros() {
        System.out.println("Socio: " + nombre_Socio);
        for (Libros libro : lista) {
            System.out.println("- " + libro.getTitulo());
        }
    }
    
}