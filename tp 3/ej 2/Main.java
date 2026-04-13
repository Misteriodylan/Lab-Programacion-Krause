package dylan;

public class Main {
	public static void main(String[] args) {
		Socios socio1 = new Socios("Eric",0);
		Socios socio2 = new Socios("Alex",1);
		Socios socio3 = new Socios("Dylan",2);
		Libros libro1 = new Libros(1,"La caperucita roja");
		Libros libro2 = new Libros(2,"Harry potter y la tierra filosofal");
		Libros libro3 = new Libros(3,"Laberinto de la culpa");
		Libros libro4 = new Libros(4,"Harry potter y la camara secreta ");
		Libros libro5 = new Libros(5,"Harry potter y la prision de Azkábn");
		Libros libro6 = new Libros(6,"Yu-Gi-Oh! tomo 1");
		Libros libro7 = new Libros(7,"Blue lock tomo 1");
		Libros libro8 = new Libros(8,"El alquimista");
		Libros libro9 = new Libros(9,"Espiritu de lucha tomo 1");
		Libros libro10 = new Libros(10,"La comunicacion no verbal");
		Libros libro11 = new Libros(11,"El arte de la guerra");
		Libros libro12 = new Libros(12,"harry potter y caliz de fuego");
		Libros libro13 = new Libros(13,"Harry potter y el principe mestizo");
		Libros libro14 = new Libros(14,"harry potter y el orden de fénix ");
		Libros libro15 = new Libros(15,"Harry potter y las reliquias de la muerte");
		socio1.AgregarLibros(libro1);
		socio1.AgregarLibros(libro2);
		socio1.AgregarLibros(libro3);
		socio1.AgregarLibros(libro4);
		socio1.AgregarLibros(libro5);
		socio2.AgregarLibros(libro6);
		socio2.AgregarLibros(libro7);
		socio2.AgregarLibros(libro8);
		socio2.AgregarLibros(libro9);
		socio2.AgregarLibros(libro10);
		socio3.AgregarLibros(libro11);
		socio3.AgregarLibros(libro12);
		socio3.AgregarLibros(libro13);
		socio3.AgregarLibros(libro14);
		socio3.AgregarLibros(libro15);
		socio1.mostrarLibros();
		socio2.mostrarLibros();
		socio3.mostrarLibros();
	}
}
