package dylan;
import java.util.Scanner;
public class Actividad3 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int[] numeros = new int[5]; 

	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Ingrese un número: ");
	            numeros[i] = sc.nextInt();
	        }

	        int min = numeros[0];

	        for (int i = 1; i < numeros.length; i++) {
	            if (numeros[i] < min) {
	                min = numeros[i];
	            }
	        }

	        System.out.println("El número mínimo es: " + min);

	        sc.close();
	    }
	}

