package dylan;
import java.util.ArrayList;
public class Biblioteca {
private ArrayList<Libro>libros=new ArrayList<Libro>();
public void añadirLibro(Libro l) {
	libros.add(l);
}
public void listarLibro() {
	for(Libro l:libros) {
		System.out.println("Titulo: " + l.getTitulo() + " Isbn: " + l.getIsbn() + " Cantidad de paginas: " + l.getCantidadPaginas());
	}
}
public void cantidadLibro() {
	System.out.println(libros.size());
}
public void paginaLibroIndicePorCapitulo(int indice) {
	System.out.println(libros.get(indice).getCantidadPaginas());
}
}
