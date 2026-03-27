package dylan;
import java.util.Scanner;
public class Actividad2 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int[] numeros = new int[5]; 

	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Ingrese un número: ");
	            numeros[i] = sc.nextInt();
	        }

	        int max = numeros[0];

	        for (int i = 1; i < numeros.length; i++) {
	            if (numeros[i] > max) {
	                max = numeros[i];
	            }
	        }

	        System.out.println("El número máximo es: " + max);

	        sc.close();
	    }
	}