package dylan;
public class Actividad12 {
	public static void main(String[] args) {

        int[] numeros = {15, 2, 8, 99, 23, 7, 1, 50};

        // Suponemos que el primero es el mayor y el menor
        int mayor = numeros[0];
        int menor = numeros[0];

        // Recorremos el array
        for (int i = 1; i < numeros.length; i++) {

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Mostrar resultados
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}