package dylan;
import java.util.ArrayList;
public class Inventario {
private ArrayList<Producto> inventario = new ArrayList<Producto>();
	
	public void añadirProducto(Producto p) {
		inventario.add(p);
	}
	public void listarProductos() {
		for(Producto p:inventario) {
			System.out.println("Nombre: " + p.getNombre() +
            "  Código: " + p.getCodigo() +
            "  Precio: $" + p.getPrecio()
        );
		}
	}
	public void cantidadProductos() {
		System.out.println(inventario.size());
	}
}

