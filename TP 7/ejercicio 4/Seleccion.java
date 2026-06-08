package dylan;
import java.util.ArrayList;
public class Seleccion {
private ArrayList<Jugador>plantel = new ArrayList<Jugador>();

public void agregarJugador(Jugador e) {
	plantel.add(e);
}
public void eliminarJugador(int indice) {
plantel.remove(indice);
	}
public void buscarPorPosicion(String posicion) {
	for(Jugador j:plantel) {
		if(j.getEquipo().equals(posicion)) {
			System.out.println(j.getNombre());
		}
	}
}
public void mostrarConvocados() {

    for (Jugador j : plantel) {

        if (j.getConvocado()) {
            System.out.println(j);
        }
    }
}
public void mostrarNoConvocados() {
	for (Jugador j:plantel) {
		if (!j.getConvocado()) {
            System.out.println(j);
        }
   }
 }
public void contarPorSeleccion() {
	System.out.println(plantel.size());
}
public void jugadorMasJoven() {
	Jugador masJoven = plantel.get(0);
	
	for(Jugador j:plantel) {
		if(j.getEdad()<masJoven.getEdad()) {
			masJoven = j;
		}
	}
	
	System.out.println("Jugador más joven: "+ masJoven.getNombre());
}
public void jugadorMasVeterano() {
	Jugador masViejo = plantel.get(0);
	
	for(Jugador j:plantel) {
		if(j.getEdad()>masViejo.getEdad()) {
			masViejo = j;
		}
	}
	
	System.out.println("Jugador más veterano: "+ masViejo.getNombre());
}
public void buscarPorEquipo(String club) {
	for(Jugador j:plantel) {
		if(j.getEquipo().equals(club)) {
			System.out.println(j.getNombre());
		}
	}
}
public void ordenarPorEdad() {
	Jugador[] js = new Jugador[plantel.size()];
	js = plantel.toArray(js);
	Jugador aux;
	for(int i = 0; i < js.length; i++) {
		for(int j = 0; j < js.length; j++) {
			if(js[j].getEdad() > js[i].getEdad()) {
				aux = js[j];
				js[j] = js[i];
				js[i] = aux;
			}
		}
	}
	
	for(int i = 0; i < js.length; i++) {
		System.out.println(js[i].getNombre()+" "+js[i].getEdad()+" años.");
	}
}
public void contarPorPosicion() {
	int arqueros = 0;
	int defensores = 0;
	int mediocampistas = 0;
	int delanteros = 0;
	for(Jugador j:plantel) {
		if(j.getPosicion().equals("Delantero")) {
			delanteros++;
		}else if(j.getPosicion().equals("Mediocampista")) {
			mediocampistas++;
		}else if(j.getPosicion().equals("Defensor")) {
			defensores++;
		}else if(j.getPosicion().equals("Arquero")) {
			arqueros++;
		}else {
			System.out.println(j.getNombre()+" tiene una posición inválida.");
		}
	}
	
	System.out.println("Arqueros: "+arqueros);
	System.out.println("Defensores: "+defensores);
	System.out.println("Mediocampistas: "+mediocampistas);
	System.out.println("Delanteros: "+delanteros);
}
public void estaConvocado(Jugador j) {
	if(j.getConvocado()) {
		System.out.println("El jugador "+j.getNombre()+" está convocado.");
	}else {
		System.out.println("El jugador "+j.getNombre()+" no está convocado.");
	}
}
public void promedioEdad() {
	float prom = 0f;
	for(Jugador j:plantel) {
		prom = prom + j.getEdad();
	}
	prom = prom/plantel.size();
	System.out.printf("El promedio de edad en la selección es: %.2f", prom);
	System.out.println(".");
}
}



