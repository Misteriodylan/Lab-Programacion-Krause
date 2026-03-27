package dylan;
import java.util.*;
public class Actividad8 {
	 public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	       Random rand = new Random();
	       String[] palabras = {"negro", "hijo", "mulan", "peppa", "gringo", "misterio", "fakefury"};
	       String palabra = palabras[rand.nextInt(palabras.length)];
	      
	       char[] letras = palabra.toCharArray();
	       char[] progreso = new char[palabra.length()];
	      
	       Arrays.fill(progreso, '_');
	      
	       int letrasCorrectas = 0;
	       int letrasCorrectasAgregadas = 0;
	       System.out.println("ADIVINA LA PALABRA");
	       while (letrasCorrectas < palabra.length()) {
	       	System.out.println();
	           for (int i = 0; i < palabra.length(); i++) {
	               System.out.print(progreso[i] + " ");
	           }
	           System.out.println();
	           System.out.println();
	           System.out.print("Ingrese una letra: ");
	           char letra = scanner.next().charAt(0);
	           for (int i = 0; i < palabra.length(); i++) {
	           	if (letras[i] == letra) {
	           		if (progreso[i] == '_') {
	           			progreso[i] = letra;
	           			letrasCorrectasAgregadas++;
	           		}
	           	}
	           }
	           if (letrasCorrectasAgregadas == letrasCorrectas) {
	           	System.out.println("Letra ingresada incorrecta.");
	           } else {
	           	letrasCorrectas = letrasCorrectasAgregadas;
	           }
	       }
	       System.out.println("¡Ganaste! La palabra era: " + palabra);
	   }
	}


