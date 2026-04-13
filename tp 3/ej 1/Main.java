package dylan;

public class Main {

	public static void main(String[] args) {
		HerramientaElectrica taladro = new HerramientaElectrica(1,"bosch",230);
		HerramientaElectrica Lijadora_eléctrica = new HerramientaElectrica(2,"bosch",220);
		HerramientaElectrica Soldador_eléctrico = new HerramientaElectrica(3,"bosch",110);
		HerramientaElectrica Amoladora_angular = new HerramientaElectrica(4,"bosch",220);
		HerramientaElectrica Sierra_circular_eléctrica = new HerramientaElectrica(5,"bosch",220);
		HerramientaManual martillo = new HerramientaManual(1,"bosch","Empuñadura de goma");
		HerramientaManual alicate = new HerramientaManual(2,"bosch","Empuñadura aislada dieléctrica");
		HerramientaManual destornillador = new HerramientaManual(3,"bosch","empuñadura ergonómica");
		HerramientaManual llave_inglesa = new HerramientaManual(4,"bosch","empuñadura metálica recta");
		HerramientaManual serrucho_manual = new HerramientaManual(5,"bosch","empuñadura cerrada ergonómica");
		
		martillo.usar();
		martillo.devolver();
		alicate.usar();
		alicate.devolver();
		destornillador.usar();
		destornillador.devolver();
		llave_inglesa.usar();
		llave_inglesa.devolver();
		serrucho_manual.usar();
		serrucho_manual.devolver();
		
		taladro.conectar();
		taladro.usar();
		taladro.devolver();
		Lijadora_eléctrica.conectar();
		Lijadora_eléctrica.usar();
		Lijadora_eléctrica.devolver();
		Soldador_eléctrico.conectar();
		Soldador_eléctrico.usar();
		Soldador_eléctrico.devolver();
		Amoladora_angular.conectar();
		Amoladora_angular.usar();
		Amoladora_angular.devolver();
		Sierra_circular_eléctrica.conectar();
		Sierra_circular_eléctrica.usar();
		Sierra_circular_eléctrica.devolver();
	}

}
