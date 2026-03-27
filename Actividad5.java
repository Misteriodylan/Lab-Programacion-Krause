package dylan;

public class Actividad5 {
	public static void main(String[] args) {
		int[] arreglo = {1, 1, 1, 3, 1, 4, 2, 2, 2, 4}; int par_cont = 0;
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] % 2 == 0) {
				par_cont++;
			}
		}
		System.out.println("La cantidad de pares del array es: " + par_cont);
	}
}

