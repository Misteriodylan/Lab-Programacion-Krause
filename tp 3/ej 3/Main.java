package dylan;

public class Main {
	public static void main(String[] args) {
		Vendedores vendedor1 = new Vendedores("1025","Eric");
		Vendedores vendedor2 = new Vendedores("1834","Dylan");
		Vendedores vendedor3 = new Vendedores("1356","Alex");
		Auto a1 = new Auto("AA111BB", "Toyota Corolla");
        Auto a2 = new Auto("AA222CC", "Ford Fiesta");
        Auto a3 = new Auto("AA333DD", "Chevrolet Cruze");
        Auto a4 = new Auto("AA444EE", "Peugeot 208");
        Auto a5 = new Auto("AA555FF", "Fiat Cronos");
        Auto a6 = new Auto("AA666GG", "Honda Civic");

        Moto m1 = new Moto("MM111AA", "Honda Wave");
        Moto m2 = new Moto("MM222BB", "Yamaha FZ");
        Moto m3 = new Moto("MM333CC", "Suzuki GN125");
        Moto m4 = new Moto("MM444DD", "Kawasaki Z400");
        vendedor1.AgregarVehiculos(a1);
        vendedor1.AgregarVehiculos(a2);
        vendedor1.AgregarVehiculos(m1);
        
        vendedor2.AgregarVehiculos(a3);
        vendedor2.AgregarVehiculos(a4);
        vendedor2.AgregarVehiculos(m2);
        
        vendedor3.AgregarVehiculos(a5);
        vendedor3.AgregarVehiculos(a6);
        vendedor3.AgregarVehiculos(m3);
        vendedor3.AgregarVehiculos(m4);
        vendedor1.mostrarVehiculos();
        vendedor2.mostrarVehiculos();
        vendedor3.mostrarVehiculos();
        
	}
}
