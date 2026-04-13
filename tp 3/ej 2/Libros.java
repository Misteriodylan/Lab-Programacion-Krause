package dylan;

public class Libros {
	private int isbn;
	private String titulo;
public Libros(int isbn, String titulo) {
	this.isbn = isbn;
	this.titulo = titulo;
}
public String getTitulo() {
	return titulo;
}
public int getIsbn() {
	return isbn;
}
}
